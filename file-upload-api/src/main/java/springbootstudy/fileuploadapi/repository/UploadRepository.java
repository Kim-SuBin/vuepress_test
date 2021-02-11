package springbootstudy.fileuploadapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootstudy.fileuploadapi.domain.Upload;

public interface UploadRepository extends JpaRepository<Upload, Long> {
}
