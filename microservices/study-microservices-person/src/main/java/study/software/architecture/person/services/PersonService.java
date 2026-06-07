package study.software.architecture.person.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.software.architecture.person.entities.Person;
import study.software.architecture.person.entities.PersonConverter;
import study.software.architecture.person.repositories.PersonRepository;
import study.software.architecture.person.to.PersonRequest;
import study.software.architecture.person.to.PersonResponse;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public PersonResponse save(PersonRequest personRequest) {
        Person person = PersonConverter.toEntity(personRequest);
        Person personSaved = personRepository.save(person);
        return PersonConverter.toResponse(personSaved);
    }

    public PersonResponse findByDocument(String document) {
        return PersonConverter.toResponse(personRepository.findByDocument(document));
    }
}
