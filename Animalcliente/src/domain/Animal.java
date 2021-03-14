/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author felipe_baumgartel
 */
public class Animal {
    private int id;
    private String raca;
    private String cor;
    private double peso;
    private int idade;
    private Sexo sexo;
    private String alimentacao;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", raca=" + raca + ", cor=" + cor + ", peso=" + peso + ", idade=" + idade + ", sexo=" + sexo + ", alimentacao=" + alimentacao + '}';
    }

    public Animal() {
    }

    public Animal(int id, String raca, String cor, double peso, int idade, Sexo sexo, String alimentacao) {
        this.id = id;
        this.raca = raca;
        this.cor = cor;
        this.peso = peso;
        this.idade = idade;
        this.sexo = sexo;
        this.alimentacao = alimentacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }
}
