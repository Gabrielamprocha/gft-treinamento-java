package br.com.treinamento;

public class Animal {
    String nome;
    String sobrenome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String nome) {
        this.sobrenome = nome;
    }

    public void imprimirNomeCompleto(){
        System.out.println("Animal " + this.nome + " " + this.sobrenome);
    }
}
