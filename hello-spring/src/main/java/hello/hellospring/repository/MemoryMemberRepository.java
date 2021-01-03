package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

// 스프링에서 MemberRepository를 인식하도록 @Repository 어노테이션 추가
@Repository
public class MemoryMemberRepository implements MemberRepository {

    // 실무에서는 동시성 문제 때문에 HashMap이 아닌 ConcurrentHashMap을 써야하는데 단순 예제이므로 HashMap 사용
    private static Map<Long, Member> store = new HashMap<>();
    // sequence는 0, 1, 2 이렇게 key 값을 생성해주는 역할. 동시성 문제를 고려하면 AtomicLong을 사용하는 것이 좋지만 단순 예제이므로 long 사용
    private static long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id)); // null인 경우 optional로 감싸서 반환
    }

    @Override
    public Optional<Member> findByName(String name) {
        // 자바8의 람다 사용
        // filter를 사용하여 getName이 파라미터로 넘어온 name과 같은지 확인
        // 같은 경우에만 필터링이 되고, 하나라도 찾으면(findAny) 반환
        // 없으면 optional에 null이 포함되어 반환됨
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();
    }

    @Override
    public List<Member> findAll() {
        // store에 있는 member들 반화
        return new ArrayList<>(store.values());
    }

    // store를 비우는 용도로 사용용
   public void clearStore() {
        store.clear();
    }
}
