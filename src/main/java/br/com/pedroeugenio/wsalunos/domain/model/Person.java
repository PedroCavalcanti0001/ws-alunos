package br.com.pedroeugenio.wsalunos.domain.model;

public interface Person {
    String getName();

    String getCpf();

    String getRg();

    int getAge();

    void setCpf(String cpf);

    void setAge(int age);

    void setName(String name);

    void setRg(String name);

    void isValidCpf(String cpf) throws Exception;
}
