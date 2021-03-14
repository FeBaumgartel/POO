/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

/**
 *
 * @author felipe_baumgartel
 */
public class Cliente {

    private long id;
    private String nome;
    private String Rg;
    private long CPF;
    private int idade;
    private String sexo;
    private String endereco;
    private long telefone;

    public Cliente() {
    }

    public Cliente(long id, String nome, String Rg, long CPF, int idade, String sexo, String endereco, long telefone) {
        this.id = id;
        this.nome = nome;
        this.Rg = Rg;
        this.CPF = CPF;
        this.idade = idade;
        this.sexo = sexo;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente: " + "id=" + id + ", nome=" + nome + ", Rg=" + Rg + ", "
                + "CPF=" + CPF + ", idade=" + idade + ", sexo=" + sexo + ", "
                + "endereco=" + endereco + ", telefone=" + telefone + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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
