package springstudy.securitytest.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import springstudy.securitytest.dto.MemberDto;
import springstudy.securitytest.service.MemberService;

@Controller
@AllArgsConstructor
public class MemberController {
    private MemberService memberService;

    @GetMapping("/")
    public String index() {
        return "home";
    }

    @GetMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("member", new MemberDto());

        return "signup";
    }

    @PostMapping("/signup")
    public String signup(MemberDto memberDto) {
        memberService.signUp(memberDto);

        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
