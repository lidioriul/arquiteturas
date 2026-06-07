package study.software.architecture.person.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import study.software.architecture.person.entities.Person;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, UUID> {

    Person findByDocument(String document);

}
