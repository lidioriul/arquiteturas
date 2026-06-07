package study.software.architecture.person.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.software.architecture.person.entities.Person;
import study.software.architecture.person.entities.PersonConverter;
import study.software.architecture.person.repositories.PersonRepository;
import study.software.architecture.person.to.PersonRequest;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person save(PersonRequest personRequest) {
        Person person = PersonConverter.toEntity(personRequest);
        return personRepository.save(person);
    }
}
