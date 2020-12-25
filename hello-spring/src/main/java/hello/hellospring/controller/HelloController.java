package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// Controller 사용 시 @Controller라고 Annotation을 추가해야 함
@Controller
public class HelloController {

    // 웹 애플리케이션에서 /hello 라고 들어오면 아래 method를 호출
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!");
        return "hello";
    }

    // MVC를 위해 추가
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    // API 테스트 - @ResponseBody 문자 반환
    @GetMapping("hello-string")
    @ResponseBody // 중요!! http의 body에 해당 데이터를 직접 넣겠다는 의미
    public String helloString(@RequestParam("name") String name){
        return "hello" + name; // name을 kim이라 하면 "hello kim"이 뜸
    }

    // API 테스트 - @ResponseBody 객체 반환
    // 데이터 전송 - JSON 형태(key-value)로 전송함
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello; // 객체 반환
    }

    // API 방식을 위해서는 get, set 사용
    static class Hello{
        private String name; // key

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
