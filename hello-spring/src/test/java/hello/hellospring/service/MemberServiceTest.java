package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MemberServiceTest {

    // MemberService memberService = new MemberService();
    // MemoryMemberRepository memberRepository = new MemoryMemberRepository();

    // 같은 메모리 멤버 레포지토리를 사용하는 형태로 변경
    MemberService memberService;
    MemoryMemberRepository memberRepository;

    // 동작 전에 실행되는 메소드
    @BeforeEach
    public void beforeEach(){
        memberRepository =  new MemoryMemberRepository();
        memberService = new MemberService(memberRepository);
    }

    // 동작이 끝날 때마다 실행되는 메소드
    @AfterEach
    public void afterEach(){
        memberRepository.clearStore();
    }

    @Test
    void join() {

        // Test 코드를 작성할 때 given-when-then 형태로 만들면 알아보기 더 쉬움
        // 상황에 따라 변형을 하는 형태로 만들면 됨

        // given
        Member member = new Member();
        member.setName("spring");

        // when
        Long saveId = memberService.join(member);

        // then
        Member findMember = memberService.findOne(saveId).get();
        // Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());
        // 위의 코드를 static import 단축키 Alt + Enter 를 통해 아래와 같은 형태로 변경
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    // 테스트코드의 클래스명은 실제 코드에 포함되지 않으므로 한글로 작성해도 상관 X
    public void 중복회원예외(){
        // given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");


        // when
        memberService.join(member1);
        // assertThrows(IllegalStateException.class, () -> memberService.join(member2));
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");

        /* 예외를 try catch를 통해 잡는 방법
        try {
            memberService.join(member2);
            // exception으로 안 넘어간 경우 fail 수행
            fail("예외가 발생해야 합니다.");
        } catch (IllegalStateException e) {
            assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
        }*/
        // then
    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}