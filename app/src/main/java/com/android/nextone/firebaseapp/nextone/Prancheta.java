package com.android.nextone.firebaseapp.nextone;

import java.util.ArrayList;
import java.util.List;

public class Prancheta {

    private List<Taxista> taxistas;
    private List<Praca> pracas;

    public Prancheta() {
        this.taxistas = new ArrayList<Taxista>();
    }

    public void cadastraTaxista(Taxista taxista) throws TaxistaJaCadastradoException {
        for (Taxista t : this.taxistas) {
            if (t.getCnh().equals(taxista.getCnh())) {
                throw new TaxistaJaCadastradoException("Já existe um Taxista Cadastrado com essa CNH!!");
            }
        }
        this.taxistas.add(taxista);
    }

    public void removeTaxistaDaLista(String cnh) {
        for (int k = 0; k < taxistas.size(); k++) {
            if (taxistas.get(k).equals(cnh)) {
                taxistas.remove(k);
                k--;
            }
            k++;

        }
    }

    public Taxista pesquisaTaxista(String cnh) throws TaxistaNaoExisteException {
        for (Taxista t : this.taxistas) {
            if (t.getCnh().equals(cnh)) {
                return t;
            }
        }
        throw new TaxistaNaoExisteException("Não Foi encontrado nem um taxista com essa CNH!!");
    }

    public Taxista pesquisaTaxistaPorPlacaCarro(String placaCarro) throws TaxistaNaoExisteException {
        for (Taxista y : this.taxistas) {
            if (y.getPlacaCarro().equals(placaCarro)) {
                return y;
            }
        }
        throw new TaxistaNaoExisteException("Não Foi encontrado nem um taxista com essa CNH!!\"");
    }

    public void cadastraPraca(String nomeDaPraça, int maxTaxistas) throws PracaJaCadastradaException {
        Praca praca = new Praca(nomeDaPraça, maxTaxistas);
        for (Praca p : this.pracas) {
            if (p.getNomeDaPraça().equals(nomeDaPraça)) {
                throw new PracaJaCadastradaException("Uma praça já foi cadastrada com este nome!");
            } else {
                this.pracas.add(praca);
            }
        }
    }


    public Praca pesquisaPraca(String nomeDaPraça) throws PracaNaoExisteException{
     for(Praca p: this.pracas){
         if(p.getNomeDaPraça().equals(nomeDaPraça)){
             return p;
         }
     }
     throw new PracaNaoExisteException("Não Esxiste Praça com esse nome" +nomeDaPraça );
    }

}