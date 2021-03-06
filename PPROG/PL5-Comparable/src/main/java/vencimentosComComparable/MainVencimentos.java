package vencimentosComComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainVencimentos {

    public static void main(String[] args) {

        TrabalhadorComissao tc = new TrabalhadorComissao("Susana Ferreira",
                500.0f, 1500.0f, 6f);
        TrabalhadorPeca tp = new TrabalhadorPeca("Jorge Silva", 20, 30);
        TrabalhadorHora th = new TrabalhadorHora("Carlos Miguel", 160, 3.5f);

        List<Trabalhador> trabs = new ArrayList<>();
        trabs.add(tc);
        trabs.add(tp);
        trabs.add(th);

        System.out.println("### Trabalhadores ###");
        listar(trabs);

        System.out.println("\n###### Ordenação de Objetos Comparable ######");

        System.out.println("\n\t# Figuras por Ordem Crescente de Vencimentos #");
        Collections.sort(trabs);
        listarForEach(trabs);

        System.out.println("\n\t# Figuras por Ordem Decrescente de Vencimentos #");
        Collections.sort(trabs, Collections.reverseOrder());
        listarForEach(trabs);

    }

    private static void listar(List<Trabalhador> trabs) {
        for (Trabalhador trab : trabs) {
            if (trab != null) {
                System.out.printf("%s, vencimento = %.2f€%n", trab.getNome(),
                        trab.calcularVencimento());
            }
        }
    }

    private static void listarForEach(List<Trabalhador> lista) {
        for (Trabalhador trabs : lista) {
            System.out.printf("%s Área: %.1f %n", trabs.toString(), trabs.calcularVencimento());
        }
    }
}
