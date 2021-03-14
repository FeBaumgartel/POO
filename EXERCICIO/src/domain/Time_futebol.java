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
public class Time_futebol {

    private int id;
    private String nome;
    private String mascote;
    private String fundacao;
    private String estadio;
    private String localizacao;
    private String treinador;

    @Override
    public String toString() {
        return "Time{" + "id=" + id + ", nome=" + nome + ", mascote=" + mascote + ", fundacao=" + fundacao + ", estadio=" + estadio + ", localizacao=" + localizacao + ", treinador=" + treinador + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Time_futebol other = (Time_futebol) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public Time_futebol(int id, String nome, String mascote, String fundacao, String estadio, String localizacao, String treinador) {
        this.id = id;
        this.nome = nome;
        this.mascote = mascote;
        this.fundacao = fundacao;
        this.estadio = estadio;
        this.localizacao = localizacao;
        this.treinador = treinador;
    }

    public Time_futebol() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMascote() {
        return mascote;
    }

    public void setMascote(String mascote) {
        this.mascote = mascote;
    }

    public String getFundacao() {
        return fundacao;
    }

    public void setFundacao(String fundacao) {
        this.fundacao = fundacao;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getTreinador() {
        return treinador;
    }

    public void setTreinador(String treinador) {
        this.treinador = treinador;
    }
}
