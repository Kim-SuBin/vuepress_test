package springbootstudy.fileupload.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import springbootstudy.fileupload.dto.FileDto;
import springbootstudy.fileupload.service.FileService;
import springbootstudy.fileupload.service.S3Service;

import java.io.IOException;

@Controller
@AllArgsConstructor
public class FileController {
    private S3Service s3Service;
    private FileService fileService;

    @GetMapping("/upload")
    public String upload() {
        return "upload";
    }

    @PostMapping("upload")
    public String upload(FileDto fileDto, MultipartFile file) throws IOException {
        String path = s3Service.upload(file);
        fileDto.setFilePath(path);

        fileService.savePost(fileDto);

        return "upload";
    }
}
