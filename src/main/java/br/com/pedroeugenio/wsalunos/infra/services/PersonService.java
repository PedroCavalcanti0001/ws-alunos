package br.com.pedroeugenio.wsalunos.infra.services;

import br.com.pedroeugenio.wsalunos.domain.model.Person;
import br.com.pedroeugenio.wsalunos.domain.model.impl.PersonDto;
import br.com.pedroeugenio.wsalunos.domain.repository.PersonRepository;
import br.com.pedroeugenio.wsalunos.infra.dao.PersonDao;
import br.com.pedroeugenio.wsalunos.infra.entities.PersonEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonService implements PersonRepository {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PersonDao personDao;

    @Override
    public PersonDto save(Person person) {
        PersonEntity entity = modelMapper.map(person, PersonEntity.class);
        personDao.save(entity);
        return (PersonDto) person;
    }


    @Override
    public void delete(long id) {
        personDao.deleteById(id);
    }

    @Override
    public PersonDto findByCpf(String cpf) {
        Optional<PersonEntity> optional = personDao.findPersonEntityByCpf(cpf);
        if(optional.isPresent()) {
            return modelMapper.map(optional, PersonDto.class);
        }
        throw new IllegalArgumentException("Nenhum cliente encontrado para esse cpf");
    }

    @Override
    public List<PersonDto> findAll() {
        return personDao.findAll()
                .stream().map(e -> modelMapper.map(e, PersonDto.class)).collect(Collectors.toList());
    }

}