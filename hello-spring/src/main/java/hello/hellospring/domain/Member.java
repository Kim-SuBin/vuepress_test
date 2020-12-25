package hello.hellospring.domain;

public class Member {

    private Long id; // 시스템이 저장하는 ID
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
