package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//Controller 어노테이션이 있으면 스프링 컨테이너에 Controller 객체를 생성하여 넣어두고 스프링이 관리함
@Controller
class MemberController {

    // private final MemberService memberService = new MemberService();
    // 스프링이 관리를 하게 되면 스프링 컨테이너에 등록을 하고 받아서 쓰도록 바꿔야 함
    // new를 통해서 생성하면 다른 컨트롤러에서도 MemberService를 생성하게 되는데
    // MemberService의 기능이 단순하므로 스프링 컨테이너에 등록하고 공용으로 쓰는 것이 더 좋음

    private final MemberService memberService;

    // 생성자 단축키 Alt + Insert를 통해서 생성
    // 생성자에 Autowired가 있으면 스프링이 스프링 컨테이너에 있는 memberService를 가져와 연결시켜 줌
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}