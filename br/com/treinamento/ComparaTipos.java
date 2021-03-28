package br.com.treinamento;

public class ComparaTipos {
   public static void main(String[] args){
      String nome = "Gabriela";
      if (nome instanceof String) { 
          System.out.println("its a string");
      } else {
          System.out.println("not a string");
      }
   }
}