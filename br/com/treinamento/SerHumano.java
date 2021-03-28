package br.com.treinamento;

public class SerHumano {
    public static void main(String[] args){
        Animal objeto1 = new Animal();
        objeto1.setNome("Jack");
        objeto1.setSobrenome("Menezes");

        Animal objeto2 = new Animal();
        objeto2.setNome("Simon");
        objeto2.setSobrenome("Menezes");

       objeto1.imprimirNomeCompleto();
       objeto2.imprimirNomeCompleto();
    }
}
