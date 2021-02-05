package springbootstudy.fileupload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootstudy.fileupload.domain.File;

public interface FileRepository extends JpaRepository<File, Long> {
}
