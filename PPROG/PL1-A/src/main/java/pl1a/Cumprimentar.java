package pl1a;

import java.util.Scanner;

public class Cumprimentar {

    public static void main(String[] args) {
        String nome;
        int idade;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        nome = ler.nextLine();
        Pessoa p1 = new Pessoa(nome);
        System.out.println("Olá " + p1.getNome());
        System.out.println("Digite a sua idade " + p1.getNome());
        idade = ler.nextInt();
        p1.setIdade(idade);

        System.out.println(p1);

        /**p1.setIdade(20);
         System.out.println(p1);
         */
    }

}