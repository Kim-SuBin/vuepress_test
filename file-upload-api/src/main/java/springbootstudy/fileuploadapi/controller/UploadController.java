package springbootstudy.fileuploadapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import springbootstudy.fileuploadapi.domain.Upload;
import springbootstudy.fileuploadapi.repository.UploadRepository;
import springbootstudy.fileuploadapi.uploader.S3Uploader;

import java.io.IOException;

@RequiredArgsConstructor
@RestController
public class UploadController {

    private final S3Uploader uploader;
    private final UploadRepository uploadRepository;

    @PostMapping("/upload")
    public Long upload(@RequestParam("data") MultipartFile file, @RequestParam("title") String title) throws IOException {
        String path = uploader.upload(file, "static");
        return uploadRepository.save(
                Upload.builder()
                .filepath(path)
                .title(title)
                .build()).getId();
    }

}
