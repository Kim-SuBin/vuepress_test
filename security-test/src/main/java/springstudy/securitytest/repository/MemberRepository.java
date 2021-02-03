package springstudy.securitytest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springstudy.securitytest.domain.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUsername(String username);
}
