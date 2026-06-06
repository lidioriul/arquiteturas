package study.software.architecture.person.to;

import lombok.Data;

@Data
public class PersonRequest {

    private String name;
    private String document;
    private Long age;
}
