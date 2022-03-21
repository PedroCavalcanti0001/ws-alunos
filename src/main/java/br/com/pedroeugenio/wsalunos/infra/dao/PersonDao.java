package br.com.pedroeugenio.wsalunos.infra.dao;

import br.com.pedroeugenio.wsalunos.infra.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public
interface PersonDao extends JpaRepository<PersonEntity, Long> {

    Optional<PersonEntity> findPersonEntityByCpf(String cpf);
}

