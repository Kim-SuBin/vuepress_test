package springbootstudy.resttemplate.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestTemplateTest {

    RestTemplate restTemplate = new RestTemplate();
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void test() {

        String url = "http://localhost:8081/test";

        String filename = "filename";
        String extension = "mp3";
        String s3url = "s3://sstt/static/" + filename;
        Integer subjectNum = 3;
        List<String> fileInfo = new ArrayList<String>();
        fileInfo.add(filename);
        fileInfo.add(extension);
        fileInfo.add(s3url);

        Map<String, Object> params = new HashMap<>();
        params.put("file_info", fileInfo);
        params.put("subject_nums", subjectNum);

        String body;

        try {
            body = objectMapper.writeValueAsString(params);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if(body != null) {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

            HttpEntity entity = new HttpEntity(body, headers);

            ResponseEntity<Map> response = restTemplate.postForEntity(url, entity, Map.class);

            System.out.println(response);
            System.out.println("==========================");
            System.out.println(response.getBody());
            System.out.println("==========================");
        }

    }

}