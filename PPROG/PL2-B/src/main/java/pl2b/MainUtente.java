package pl2b;

import java.util.Scanner;

/**
 * @author Luís Araújo
 */
public class MainUtente {
    public static void main(String[] args) {
        Utente u1 = new Utente("Luís Araújo", "Masculino", 20, 1.81f, 72);
        Utente u2 = new Utente("Pedro Ferreira", "Masculino", 25, 1.73f, 80);
        Utente u3 = new Utente("Joana Vieira", 27);
        Utente u4 = new Utente("Mariana Cunha", 19);
        Utente u5 = new Utente();
        Utente u6 = new Utente();

        Utente[] arr = new Utente[10];
        arr[0] = u1;
        arr[1] = u2;
        arr[2] = u3;
        arr[3] = u4;
        arr[4] = u5;
        arr[5] = u6;

        System.out.println("----------LISTAGEM DOS UTENTES----------\n");
        /**
         *  representação textual e legível de cada utente
         */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("\n----------LISTAGEM DO NOME, IMC E GRAU DE OBESIDADE----------\n");
        /**
         *  nome, valor do IMC e grau de obesidade de cada utente
         */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getNome() + " tem um IMC de: " + arr[i].indice() + " e um grau de obesidade: " + arr[i].grauDeObesidade());
            }
        }
        System.out.println("\n----------LISTAGEM DE UTENTES NÃO SAUDÁVEIS----------\n");
        /**
         * nome e o grau de obesidade de cada utente que não tenha a classificação “Saudável”
         */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && !arr[i].isSaudavel()) {
                System.out.println("Nome: " + arr[i].getNome()
                        + " Grau de obesidade: " + arr[i].grauDeObesidade());
            }
        }
        /**
         * nome e o grau de obesidade de cada utente após alteraçoes
         */
        System.out.println("\n----------LISTAGEM DO NOME, IMC E GRAU DE OBESIDADE APOS ALTERAÇOES----------\n");
        Utente.setMaximo(18);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getNome() + " tem um IMC de: " + arr[i].indice() + " e um grau de obesidade: " + arr[i].grauDeObesidade());
            }
        }
        /**
         * determinar o utente mais novo
         */
        System.out.println("\n----------UTENTE MAIS NOVO----------");
        u3.setIdade(u4.getIdade());
        Utente novoUtente = u3.determinarMaisNovo(u4);
        if (novoUtente == null) {
            System.out.println("Têm a mesma idade.");
        } else {
            System.out.println("Utente mais novo: " + novoUtente.getNome());
        }

    }
}

