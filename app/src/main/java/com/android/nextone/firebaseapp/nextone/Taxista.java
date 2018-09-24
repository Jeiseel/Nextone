package com.android.nextone.firebaseapp.nextone;

import java.util.HashMap;

public class Taxista {

    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    private String cnh;
    private String placaCarro;
    private String cod;
    private int qtdViagens;
    private HashMap<Object, Object> hashMapTaxista;

    public Taxista(String nome, String sobrenome, String cnh, String placaCarro, String cod){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cnh = cnh;
        this.placaCarro = placaCarro;
        this.cod = cod;
        this.qtdViagens =0;
    }

    public Taxista(){
        this.nome="";
        this.sobrenome="";
        this.email="";
        this.senha="";
        this.cnh="";
        this.placaCarro="";
        this.cod="";
        this.qtdViagens = 0;
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

    public int getQtdViagens(){
        return qtdViagens;
    }

    public void setQtdViagens(int qtdViagens){
        this.qtdViagens = qtdViagens;
    }

    public String toString(){
        return "Taxista:" + this.nome + "\n CNH: " + this.cnh + "\n Placa Do Carro" + this.placaCarro + "\n Quantidade de viagens:" + this.qtdViagens;
    }
}
