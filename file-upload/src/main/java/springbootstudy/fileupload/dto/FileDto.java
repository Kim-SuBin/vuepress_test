package springbootstudy.fileupload.dto;

import lombok.*;
import springbootstudy.fileupload.domain.File;

@Getter @Setter
@ToString
@NoArgsConstructor
public class FileDto {
    private Long id;
    private String title;
    private String filePath;

    public File toEntity() {
        return File.builder()
                .id(id)
                .title(title)
                .filePath(filePath)
                .build();
    }

    @Builder
    public FileDto(Long id, String title, String filePath) {
        this.id = id;
        this.title = title;
        this.filePath = filePath;
    }
}
