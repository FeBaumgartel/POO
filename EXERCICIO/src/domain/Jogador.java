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
public class Jogador {

    private int id;
    private int id_time;
    private String nome;
    private String Nascimento;
    private Nacionalidade nacionalidade;
    private double altura;
    private Pe pe;
    private int numero;
    private String posicao;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jogador other = (Jogador) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Jogador{" + "id=" + id + ", id_time=" + id_time + ", nome=" + nome + ", Nascimento=" + Nascimento + ", nacionalidade=" + nacionalidade + ", altura=" + altura + ", pe=" + pe + ", numero=" + numero + ", posicao=" + posicao + '}';
    }

    public Jogador(int id, int id_time, String nome, String Nascimento, Nacionalidade nacionalidade, double altura, Pe pe, int numero, String posicao) {
        this.id = id;
        this.id_time = id_time;
        this.nome = nome;
        this.Nascimento = Nascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.pe = pe;
        this.numero = numero;
        this.posicao = posicao;
    }

    public Jogador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_time() {
        return id_time;
    }

    public void setId_time(int id_time) {
        this.id_time = id_time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return Nascimento;
    }

    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Pe getPe() {
        return pe;
    }

    public void setPe(Pe pe) {
        this.pe = pe;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
}
