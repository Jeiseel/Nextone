package com.android.nextone.firebaseapp.nextone;

import java.util.HashMap;

public class Taxista {

    private String nome ="";
    private String sobrenome = "";
    private String email ="";
    private String senha ="";
    private String cnh ="";
    private String placaCarro ="";
    private String cod = "";
    private HashMap<Object, Object> hashMapTaxista;

    public Taxista(){
    }

    public void salvar(){
    }

    public HashMap<Object, Object> toMap(){
        HashMap<String ing, Object> hashMapTaxista = new HashMap<>();

        hashMapTaxista.put("Nome", getNome());
        hashMapTaxista.put("Sobrenome", getSobrenome());
        hashMapTaxista.put("Email", getEmail());
        hashMapTaxista.put("Senha",getSenha());
        hashMapTaxista.put("CNH", getCnh());
        hashMapTaxista.put("Placa Do Carro", getPlacaCarro());
        hashMapTaxista.put("Codigo", getCod());

        return hashMapTaxista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public String getCod(){
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
