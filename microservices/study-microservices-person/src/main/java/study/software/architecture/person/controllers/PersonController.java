package study.software.architecture.person.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.software.architecture.person.services.PersonService;
import study.software.architecture.person.to.PersonRequest;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody PersonRequest personRequest) {
        return ResponseEntity.ok(personService.save(personRequest));
    }

    @GetMapping("/{document}")
    public ResponseEntity<?> findByDocument(@PathVariable String document) {
        return ResponseEntity.ok(personService.findByDocument(document));
    }

}
