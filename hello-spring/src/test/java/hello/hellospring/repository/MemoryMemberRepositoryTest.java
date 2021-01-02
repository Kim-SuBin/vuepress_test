package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

// Assertions를 import하여 사용

// 굳이 public으로 안해도 됨. 다른데서 가져다 사용하지 않으므로
class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    // 동작이 끝날 때마다 실행되는 메소드
    @AfterEach
    public void afterEach(){
        // 테스트가 끝날 때마다 store를 비워주는 역할
        // 이 메소드가 없는 경우 test 과정에서 fail 발생
        // (Test 메소드들이 의존관계가 생기게 되기 때문에 fail이 발생하는 것)
        repository.clearStore();
    }

    // Test를 사용하여 아래 메소드 그냥 실행 가능
    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        // 출력 통해 가져온 정보(result)와 member가 같은지 확인 가능
        // System.out.println("result= " + (result == member));
        // 출력을 통한 방법은 번거롭기 때문에 주로 assert 사용
        // Assertions.assertEquals(member, result); // 기대한 값, 가져온 값
        // 최근에 가장 많이 사용하는 방법
        // Assertions.assertThat(member).isEqualTo(result);
        // Assertions를 import 했기 때문에 아래와 같이 그냥 사용 가능
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        // shift + F6을 통해 member1을 모두 member2로 변경
        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get();
        assertThat(result).isEqualTo(member1);


    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member>  result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);
    }
}
