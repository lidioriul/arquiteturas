package study.software.architecture.person.to;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class PersonResponse {

    private UUID id;
    private String name;
    private String document;
    private Long age;
    private String dateSaved;
}
