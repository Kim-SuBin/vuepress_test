<div align="center">
  <h1>Security API</h1>
  <h3>Spring Security와 JWT를 사용하여 회원가입, 로그인에 대한 API 구현</h3>
  <p>실제로 구현해본 결과 Postman에서는 정상작동 하지만 React를 통한 웹 통신이 안되는 문제 발생...😭</p>
  
  <img src="https://github.com/Kim-SuBin/Kim-SuBin/blob/master/svg/dev/languages/java.svg" alt="java" />
  <img src="https://github.com/Kim-SuBin/Kim-SuBin/blob/master/svg/dev/framework/spring.svg" alt="spring" />
  <img src="https://github.com/Kim-SuBin/Kim-SuBin/blob/master/svg/dev/system/mysql.svg" alt="mysql">
  <img src="https://github.com/Kim-SuBin/Kim-SuBin/blob/master/svg/dev/tool/intellijidea.svg" alt="intelliJ" />
  
</div>

---

## 🧱 Spring-boot

### Spec

- Gradle
- Java 11
- Spring Boot 2.4.2

### Dependencies
- Spring Web
- Spring Data JPA
- Spring Security
- Lombok
- MySQL
- Jjwt

## 📁 Directory Structure
수정한 부분 위주로 구조를 그림
```
security-test
├─src
│ ├─ main
│ │ ├─ java/springstudy/securityapi
│ │ │ ├─ config
│ │ │ │ ├─ JwtAuthenticationFilter.java (실제 인증 작업을 진행하는 부분)
│ │ │ │ ├─ JwtTokenProvider.java (JWT 토큰 생성 및 검증)
│ │ │ │ └─ SecurityConfig.java (Security 관련 설정)
│ │ │ ├─ controller
│ │ │ │ └─ MemverController.java
│ │ │ ├─ domain
│ │ │ │ ├─ Member.java (Member Model)
│ │ │ │ └─ Role.java (Admin, Member)
│ │ │ ├─ repository
│ │ │ │ └─ MemberRepository.java
│ │ │ ├─ service
│ │ │ │ └─ MemberService.java
│ │ │ └─ SecurityapiApplication.java
│ │ └─ resources
│ └─ test
├─ .gitignore
├─ build.gradle
└─ README.md
```

## 🔗 Reference
[SPRING SECURITY + JWT 회원가입, 로그인 기능 구현](https://webfirewood.tistory.com/1150
[SpringSecurity를 이용한 인증 및 권한 부여](https://daddyprogrammer.org/post/636/springboot2-springsecurity-authentication-authorization/)
[아이디 중복체크 로직](https://blog.naver.com/PostView.nhn?blogId=qjawnswkd&logNo=222056895788)
