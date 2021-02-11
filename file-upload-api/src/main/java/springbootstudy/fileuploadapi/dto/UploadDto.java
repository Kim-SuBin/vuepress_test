package springbootstudy.fileuploadapi.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UploadDto {
    private Long id;
    private String title;
    private String filepath;

    @Builder
    public UploadDto(Long id, String title, String filepath) {
        this.id = id;
        this.title = title;
        this.filepath = filepath;
    }
}
