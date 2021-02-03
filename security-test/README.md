<div align="center">
  <h1>Security Test</h1>
  <h3>Spring Security를 사용하여 회원가입, 로그인, 로그아웃 구현</h3>
  
  <img src="https://github.com/Kim-SuBin/Kim-SuBin/blob/master/svg/dev/languages/java.svg" alt="java" />
  <img src="https://github.com/Kim-SuBin/Kim-SuBin/blob/master/svg/dev/framework/spring.svg" alt="spring" />
  <img src="https://github.com/Kim-SuBin/Kim-SuBin/blob/master/svg/dev/library/thymeleaf.svg" alt="thymeleaf" />
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
- Thymeleaf
- Lombok
- MySQL

## 📁 Directory Structure
수정한 부분 위주로 구조를 그림
```
security-test
├─src
│ ├─ main
│ │ ├─ java/springstudy/securitytest
│ │ │ ├─ config
│ │ │ │ └─ SecurityConfig.java (Security 관련 설정)
│ │ │ ├─ controller
│ │ │ │ └─ MemverController.java
│ │ │ ├─ domain
│ │ │ │ ├─ Member.java (Member Model)
│ │ │ │ └─ Role.java (Admin, Member)
│ │ │ ├─ dto
│ │ │ │ └─ MemberDto.java
│ │ │ ├─ repository
│ │ │ │ └─ MemberRepository.java
│ │ │ ├─ service
│ │ │ │ └─ MemberService.java
│ │ │ └─ SecurityTestApplication.java
│ │ └─ resources/templates
│ │ │ ├─ home.html
│ │ │ ├─ login.html
│ │ │ └─ signup.html
│ └─ test
├─ .gitignore
├─ build.gradle
└─ README.md
```

## 🔗 Reference
[hooong's Tech Note](https://hooongs.tistory.com/233)
