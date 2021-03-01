<div align="center">
  <h1>File Upload API</h1>
  <h3>SAmazon S3에 파일 업로드 API</h3>
  
  <img src="https://github.com/Kim-SuBin/Kim-SuBin/blob/master/svg/dev/languages/java.svg" alt="java" />
  <img src="https://github.com/Kim-SuBin/Kim-SuBin/blob/master/svg/dev/framework/spring.svg" alt="spring" />
  <img src="https://github.com/Kim-SuBin/Kim-SuBin/blob/master/svg/dev/service/amazons3.svg" alt="amazon s3' />
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
- Spring Cloud AWS
- Lombok
- MySQL

## 📁 Directory Structure
수정한 부분 위주로 구조를 그림
```

├─src
│ ├─ main
│ │ ├─ java/springstudy/securitytest
│ │ │ ├─ controller
│ │ │ │ └─ UploadController.java
│ │ │ ├─ domain
│ │ │ │ └─ Upload.java (Upload Model)
│ │ │ ├─ dto
│ │ │ │ └─ UploadDto.java
│ │ │ ├─ repository
│ │ │ │ └─ UploadRepository.java
│ │ │ ├─ uploader
│ │ │ │ └─ S3Uploader.java (S3에 파일 업로드)
│ │ │ └─ FileUploadApplication.java
│ │ └─ resources
│ └─ test
├─ .gitignore
├─ build.gradle
└─ README.md
```

## 🔗 Reference
- [버킷 생성 및 IAM 사용자 설정](https://twofootdog.tistory.com/36)
- [버킷 정책](https://zamezzz.tistory.com/299)
- [s3 연동](https://victorydntmd.tistory.com/334)
- [dependency](https://willseungh0.tistory.com/2)
- [업로드 부분](https://jojoldu.tistory.com/300)
- [업로드 용량 변경](https://dev.to/ramonak/how-to-upload-a-file-to-aws-s3-in-java-using-vaadin-framework-1m2m)
- [최대 용량 확인](https://docs.aws.amazon.com/ko_kr/AmazonS3/latest/dev/qfacts.html)
