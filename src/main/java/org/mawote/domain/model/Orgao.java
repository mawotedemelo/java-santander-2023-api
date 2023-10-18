package org.mawote.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_orgao")
public class Orgao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @OneToOne(cascade = CascadeType.ALL)
    private Informe informe;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Atividade> atividade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Informe getInforme() {
        return informe;
    }

    public void setInforme(Informe informe) {
        this.informe = informe;
    }

    public List<Atividade> getAtividade() {
        return atividade;
    }

    public void setAtividade(List<Atividade> atividade) {
        this.atividade = atividade;
    }
}
