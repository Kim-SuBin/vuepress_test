package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;

import java.util.List;
import java.util.Optional;

// 스프링에서 MemberService를 인식하도록 @Service 어노테이션 추가
// @Service
public class MemberService {

    // private final MemberRepository memberRepository = new MemoryMemberRepository();

    // 직접 생성하는 형태에서 외부에서 가져오는 형태로 변경
    private final MemberRepository memberRepository;

    // 생성자에 Autowired가 있으면 스프링이 스프링 컨테이너에 있는 memberRepository를 가져와 연결시켜 줌
    // @Autowired
    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    // 회원가입
    // import class 단축키 Ctrl + Shift + o
    public Long join(Member member) {

        // 같은 이름이 있는 중복 회원 X (비즈니스로직을 이렇게 잡음!)
        /*
        // 변수 추출 단축키 Ctrl + Alt + v (리팩토링용)
        Optional<Member> result = memberRepository.findByName(member.getName());

        // 이름이 있는 경우 (Optional을 사용했기 때문에 가능한 구문)
        result.ifPresent(m -> {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });*/

        /*
        // 코드를 더 보기 좋은 형태로 수정
        // 해당 내용을 메소드로 만드는 것이 더 좋을 것 같으므로 메소드 추출 단축키를 이용하여 메소르도 변경
        // 메소드 추출 단축키 Ctrl + Alt + m
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });*/

        validateDuplicateMember(member); // 중복 회원 검증

        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    // 전체 회원 조회
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
