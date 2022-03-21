package br.com.pedroeugenio.wsalunos.api.controller;

import br.com.pedroeugenio.wsalunos.domain.model.impl.PersonDto;
import br.com.pedroeugenio.wsalunos.infra.dao.PersonDao;
import br.com.pedroeugenio.wsalunos.infra.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private PersonService service;


    @GetMapping
    public ResponseEntity<List<PersonDto>> getPersons(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<PersonDto> getPersonByCpf(@PathVariable String cpf){
        PersonDto personDto = service.findByCpf(cpf);
        return ResponseEntity.ok(personDto);
    }

    @PostMapping
    public ResponseEntity<PersonDto> savePerson(@RequestBody PersonDto person){
        service.save(person);
        return ResponseEntity.created(URI.create("/")).build();
    }

}
