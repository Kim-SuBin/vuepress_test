<div align="center">
  <h1>Rest Template</h1>
  <h3>외부 API 요청 </h3>
  <p>test directory에 쓴 코드를 사용하여 외부 API를 요청하는 형태로 쓰면 됨</p>
  
  <img src="https://github.com/Kim-SuBin/Kim-SuBin/blob/master/svg/dev/languages/java.svg" alt="java" />
  <img src="https://github.com/Kim-SuBin/Kim-SuBin/blob/master/svg/dev/framework/spring.svg" alt="spring" />
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
- Lombok

## 📁 Directory Structure
수정한 부분 위주로 구조를 그림
```

├─src
│ ├─ main
│ │ ├─ java/springstudy/resttemplate
│ │ │ ├─ controller
│ │ │ │ └─ TestController.java (외부 API를 대신할 POST API 생성)
│ │ │ └─ RestTemplateApplication.java
│ │ └─ resources
│ │ │ └─ application.yml (port 번호 수정 부분만 사용하면 됨)
│ └─ test
│ │ ├─ java/springstudy/resttemplate
│ │ │ ├─ test
│ │ │ │ └─ RestTemplateTest.java (실질적으로 외부 API와 통신하는 부분)
│ │ │ └─ RestTemplateApplicationTest.java
├─ .gitignore
├─ build.gradle
└─ README.md
```

## 🔗 Reference
[공식문서] (https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/client/RestTemplate.html)
[API 서버 사용 예제 코드] (https://gist.github.com/keesun/4603235)
