package springbootstudy.securityapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springbootstudy.securityapi.config.JwtTokenProvider;
import springbootstudy.securityapi.domain.Member;
import springbootstudy.securityapi.repository.MemberRepository;
import springbootstudy.securityapi.service.MemberService;

import java.util.Collections;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider jwtTokenProvider;
    private final MemberRepository memberRepository;
    private final MemberService memberService;

    // 회원가입
    @PostMapping("/user/signup")
    public Long signup(@RequestBody Map<String, String> member) {
        try {
            memberService.validateDuplicateMember(member);
        } catch (IllegalArgumentException e) {
            System.out.println("아이디 중복 오류");
            long result = -1;
            return result;
        }
        return memberRepository.save(
                Member.builder()
                        .signId(member.get("signId"))
                        .name(member.get("name"))
                        .pwd(passwordEncoder.encode(member.get("pwd")))
                        .roles(Collections.singletonList("USER")) // 최초 가입 시 USER로 설정
                        .build()).getId();
    }


    // 로그인
    @PostMapping("/user/login")
    public String login(@RequestBody Map<String, String> user) {
        Member member = memberRepository.findBySignId(user.get("signId"))
                .orElseThrow(() -> new IllegalArgumentException("가입되지 않은 ID 입니다."));
        if (!passwordEncoder.matches(user.get("pwd"), member.getPassword())) {
            throw new IllegalArgumentException("잘못된 비밀번호입니다.");
        }
        return jwtTokenProvider.createToken(member.getUsername(), member.getRoles());
    }
}
