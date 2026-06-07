package study.software.architecture.sale.to;

import lombok.Data;

import java.util.UUID;

@Data
public class PersonResponse {

    private UUID id;
    private String document;
    private String name;
    private Long age;
}
