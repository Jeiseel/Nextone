package com.android.nextone.firebaseapp.nextone;

import java.util.ArrayList;

public class PilhaTaxista {
    ArrayList<Taxista> taxistas;
    int topo;

    public PilhaTaxista(ArrayList<Taxista> taxistas){
        this.taxistas = taxistas;
        topo = -1;
    }

    //Adiciona taxistas no topo do array
    public void pushTaxista(Taxista t){
        topo ++;
        taxistas.add(topo,t);
    }

    //Adiciona mais uma viagem ao motorista e o coloca no fim do array
    public void popTaxista(){
        Taxista ultimo = taxistas.get(topo);
        ultimo.setQtdViagens(ultimo.getQtdViagens() + 1);
        ArrayList<Taxista> tax = new ArrayList<>();
        //adiciona o ultimo elemento que é o topo no fim do array indice 0
        tax.add(ultimo);

        //Copia os elementos restantes no array a partir do indice 1 (pos o 0 já esta com o antigo topo)
        for(int i =1 ; i <this.taxistas.size(); i++){
            tax.add(taxistas.get(i-1));
        }
        //Array comnovas possições é colocado dentro do array antigo
        this.taxistas = tax;
    }

    //retorna o motorista do topo
    public Taxista topo(){
        return this.taxistas.get(topo);
    }
}
