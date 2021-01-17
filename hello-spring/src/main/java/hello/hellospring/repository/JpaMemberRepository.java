package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class JpaMemberRepository implements MemberRepository{

    // JPA를 사용하려면 EntityManager를 주입받아야함! (이렇게 외워두세요 :D)
    private final EntityManager em;

    public JpaMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Member save(Member member) {
        // 이렇게 하면 JPA가 insert해서 id까지 다 넣어줌
        em.persist(member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        // find에 조회할 타입과 식별자(PK값)를 넣어주면 됨
        Member member = em.find(Member.class, id);
        return Optional.ofNullable(member);
    }

    @Override
    public Optional<Member> findByName(String name) {
        List<Member> result = em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();
        return result.stream().findAny();
    }

    @Override
    public List<Member> findAll() {
        // jpqa 쿼리의 경우 객체(entity)를 대상으로 쿼리를 날림
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }
}
