/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jbferraz
 */
public class Aluno {
    private int matricula;
    private String cpf;
    private String nome;
    private String sexo;
    private int idade;
    private String telefone;
    private boolean status;
    private String endereco;

    public Aluno() {
    }

    /**
     * Construtor com todos os atributos
     * @param matricula
     * @param cpf
     * @param nome
     * @param sexo
     * @param idade
     * @param telefone
     * @param status
     * @param endereco 
     */
    public Aluno(int matricula, String cpf, String nome, String sexo, int idade, String telefone, boolean status, String endereco) {
        this.matricula = matricula;
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.telefone = telefone;
        this.status = status;
        this.endereco = endereco;
    }
    /**
     * Método que retorna a matricula do aluno
     * @return 
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * Atribui matricula do aluno
     * @param matricula 
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + 
                ", cpf=" + cpf + ", nome=" + nome + 
                ", sexo=" + sexo + ", idade=" + idade + 
                ", telefone=" + telefone + ", status=" + 
                status + ", endereco=" + endereco + '}';
    }  
    
}