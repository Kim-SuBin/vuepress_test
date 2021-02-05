package springbootstudy.fileupload.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import springbootstudy.fileupload.dto.FileDto;
import springbootstudy.fileupload.repository.FileRepository;

@Service
@AllArgsConstructor
public class FileService {
    private FileRepository fileRepository;

    public void savePost(FileDto fileDto) {
        fileRepository.save(fileDto.toEntity());
    }
}
