package com.android.nextone.firebaseapp.nextone;

public interface SistemaPrancheta {

    public void cadastraTaxista(Taxista taxista)throws TaxistaJaCadastradoException;
    public Taxista pesquisaTaxistaPorPlaca(String placaCarro) throws TaxistaNaoExisteException;
    public Taxista pesquisaTaxista(String cnh) throws TaxistaNaoExisteException;
    public void removeTaxistaDaLista(String cnh);


}
