package study.software.architecture.person.entities;

import study.software.architecture.person.to.PersonRequest;
import study.software.architecture.person.to.PersonResponse;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonConverter {

    public static Person toEntity(PersonRequest personRequest) {
        return Person.builder()
                .name(personRequest.getName())
                .document(personRequest.getDocument())
                .age(personRequest.getAge())
                .build();
    }

    public static PersonResponse toResponse(Person person) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-ddTHH:mm");
        return PersonResponse.builder()
                .id(person.getId())
                .name(person.getName())
                .document(person.getDocument())
                .age(person.getAge())
                .dateSaved(simpleDateFormat.format(new Date()))
                .build();
    }
}
