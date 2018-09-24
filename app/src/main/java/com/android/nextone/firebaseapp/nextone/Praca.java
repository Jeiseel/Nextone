package com.android.nextone.firebaseapp.nextone;

import java.util.ArrayList;
import java.util.List;

public class Praca {

    private List<Taxista> taxista;
    private int maxTaxistas;
    private String nomeDaPraça;


    public Praca(String nomeDaPraça, int maxTaxistas){
        this.nomeDaPraça = nomeDaPraça;
        this.maxTaxistas = maxTaxistas;
        this.taxista = new ArrayList<Taxista>();
    }

    public List<Taxista> getTaxista(){
        return this.taxista;
    }

    public void adicionarTaxistaPraca(Taxista taxista){
        this.taxista.add(taxista);
    }

    public int getMaxTaxistas(){
        return this.maxTaxistas;
    }

    public String getNomeDaPraça(){
        return this.nomeDaPraça;
    }

    public int setMaxTaxistas(int maxTaxistas){
        return this.maxTaxistas = maxTaxistas;
    }


    public String toString(){
        return "Praça:" + this.nomeDaPraça + "Quantidade de Taxistas:" + this.maxTaxistas;
    }
}
