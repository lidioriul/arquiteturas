package study.software.architecture.person.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PERSON")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ID_PERSON", nullable = false, updatable = false)
    private UUID id;
    @Column(name = "DES_NAME")
    private String name;
    @Column(name = "COD_DOCUMENT")
    private String document;
    @Column(name = "DES_AGE")
    private Long age;

}
