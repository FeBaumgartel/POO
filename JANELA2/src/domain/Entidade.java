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
public class Entidade {

    private int codigo;
    private String nome;
    private Sexo sexo;
    private Naturalidade naturalidade;
    private boolean ativo;
    private String observacao;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Entidade other = (Entidade) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade{" + "codigo=" + codigo + ", nome=" + nome + ", sexo=" + sexo + ", naturalidade=" + naturalidade + ", ativo=" + ativo + ", observacao=" + observacao + '}';
    }

    public Entidade() {
    }

    public Entidade(int codigo, String nome, Sexo sexo, Naturalidade naturalidade, boolean ativo, String observacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.naturalidade = naturalidade;
        this.ativo = ativo;
        this.observacao = observacao;
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Naturalidade getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(Naturalidade naturalidade) {
        this.naturalidade = naturalidade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
