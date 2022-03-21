package br.com.pedroeugenio.wsalunos.domain.model.impl;

import br.com.pedroeugenio.wsalunos.domain.model.Person;
import br.com.pedroeugenio.wsalunos.infra.dao.PersonDao;

public class PersonDto implements Person {

    private String name;
    private String cpf;
    private String rg;
    private int age;

    public PersonDto(String name, String cpf, String rg, int age) {
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public String getRg() {
        return rg;
    }

    @Override
    public int getAge() {
        return age;
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void isValidCpf(String cpf) throws Exception {
        if (cpf.length() != 11) {
            throw new IllegalArgumentException("O Cpf é inválido");
        }
    }
}
