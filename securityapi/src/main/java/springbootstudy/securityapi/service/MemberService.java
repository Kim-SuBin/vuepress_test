package springbootstudy.securityapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import springbootstudy.securityapi.domain.Member;
import springbootstudy.securityapi.repository.MemberRepository;

import java.util.Map;
import java.util.Optional;

@RequiredArgsConstructor
@Service
// 토큰에 저장된 유저 정보를 활용하기 위해 UserDetailsService 를 상속받아 재정의
public class MemberService implements UserDetailsService {

    private final MemberRepository memberRepository;

    public void validateDuplicateMember(Map<String, String> member) {
        Optional<Member> findMember = memberRepository.findBySignId(member.get("signId"));
        if (!findMember.isEmpty()) {
            throw new IllegalArgumentException("이미 존재하는 회원입니다.");
        }
    }

    // 회원 정보 조회를 signId 이용
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return memberRepository.findBySignId(username)
                .orElseThrow(() -> new UsernameNotFoundException("사용자를 찾을 수 없습니다."));
    }

}
