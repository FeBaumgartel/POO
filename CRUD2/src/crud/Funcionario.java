/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.util.Objects;

/**
 *
 * @author felipe_baumgartel
 */
public class Funcionario {
    private long matricula;
    private String nome;
    private long CPF;
    private int idade;
    private double salario;
    private String endereco;
    private long telefone;

    public Funcionario() {
    }

    public Funcionario(long matricula, String nome, long CPF, int idade, double salario, String endereco, long telefone) {
        this.matricula = matricula;
        this.salario = salario;
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Funcionario: " + "matricula=" + matricula + ", nome=" + nome + ", "
                + "CPF=" + CPF + ", idade=" + idade + ", salario=" + salario + ", "
                + "endereco=" + endereco + ", telefone=" + telefone+"\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        return true;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

}
