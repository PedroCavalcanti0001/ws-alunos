package br.com.pedroeugenio.wsalunos.infra.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name = "PESSOAS")
public class PersonEntity {

    @Id
    private String name;
    private String cpf;
    private String rg;
    private int age;

    public PersonEntity(String name, String cpf, String rg, int age) {
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.age = age;
    }

    public PersonEntity() {

    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public int getAge() {
        return age;
    }

}

