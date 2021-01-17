package hello.hellospring.domain;

import javax.persistence.*;

// JPA가 사용하는 Entity임을 표시
@Entity
public class Member {

    // PK 설정, DB가 알아서 생성해주는 것을 IDENTITY 라고 함
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 시스템이 저장하는 ID

    // DB에 설정된 name이 username인 경우 어노테이션을 이용해 매핑시키면 됨
    // @Column(name = "username")
    private String name; // 회원 이름

    // 단순하게 쉬운 예제로 하기 위해 getter, setter 사용
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
