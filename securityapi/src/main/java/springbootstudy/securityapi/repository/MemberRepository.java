package springbootstudy.securityapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootstudy.securityapi.domain.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findBySignId(String signId);
}
