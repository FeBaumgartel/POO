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
public class Aluno {

    private int codigo;
    private String nome;

    public Aluno(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Aluno() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" + "codigo=" + codigo + ", nome=" + nome + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
}
