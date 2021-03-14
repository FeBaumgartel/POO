/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplo1;

/**
 *
 * @author felipe_baumgartel
 */
public class Aluno {
    private int matricula;

    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nome=" + nome + ", CPF=" + CPF + ", sexo=" + sexo + ", email=" + email + ", endereco=" + endereco + '}';
    }
    private String nome;
    private long CPF;
    private Sexo sexo;
    private String email;
    private String endereco;

    public int getMatricula() {
        return matricula;
    }

    public Aluno(int matricula, String nome, long CPF, Sexo sexo, String email, String endereco) {
        this.matricula = matricula;
        this.nome = nome;
        this.CPF = CPF;
        this.sexo = sexo;
        this.email = email;
        this.endereco = endereco;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
