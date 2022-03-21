package br.com.pedroeugenio.wsalunos.domain.repository;

import br.com.pedroeugenio.wsalunos.domain.model.Person;
import br.com.pedroeugenio.wsalunos.domain.model.impl.PersonDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PersonRepository {
    PersonDto save(Person person);
    void delete(long id);
    PersonDto findByCpf(String cpf);
    List<PersonDto> findAll();
}

