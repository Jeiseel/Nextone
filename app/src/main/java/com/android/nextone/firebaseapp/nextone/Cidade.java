package com.android.nextone.firebaseapp.nextone;

import java.util.ArrayList;
import java.util.List;

public class Cidade {
    private List<Cidade> cidades;
    private List<Praca> pracas;
    private String nomeCidade;
    private String cep;

    public Cidade(String cep, String nomeCidade){
        this.cidades = new ArrayList<Cidade>();
        this.pracas = new ArrayList<Praca>();
        this.cep = cep;
        this.nomeCidade = nomeCidade;
    }

    public String getCep(String cep){
        return this.cep;
    }

    public List<Cidade> getCidades(){
        return this.cidades;
    }

    public void adicionaCidade(Cidade cidades){
        this.cidades.add(cidades);
    }

    public List<Praca> getPracas(){
        return this.pracas;
    }

    public void adicionaPracaNaCidade(Praca pracas){
        this.pracas.add(pracas);
    }

    public String toString(){
        return "Cidade" + this.nomeCidade+ "\n Cep:" +this.cep;
    }
}
