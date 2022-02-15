package pl3b;

import sun.security.krb5.internal.crypto.Des;

/**
 * @author Luís Araújo
 */
public class MainImpostos {
    public static void main(String[] args) {
        System.out.println("Teste de Impostos%n");

        Reformado r = new Reformado("José Santos", "Porto", 1000.00f, 500.00f);
        TrabalhadorContaOutrem tco = new TrabalhadorContaOutrem("João Santos", "Lisboa", 800.00f, 100.00f, "CML");
        TrabalhadorContaPropria tcp = new TrabalhadorContaPropria("Carla Santos", "Porto", 1500.00f, 1000.00f, "Advogada");
        Desempregado d = new Desempregado("Manuel Santos", "Braga", 150.00f, 4);

        Contribuinte[] contrib = new Contribuinte[10];
        contrib[0] = r;
        contrib[1] = tco;
        contrib[2] = tcp;
        contrib[3] = d;

        System.out.println("Listagem de impostos a pagar pelos contribuintes");
        for (int i = 0; i < contrib.length; i++) {
            if (contrib[i] != null) {
                System.out.println(contrib[i] + "\n... tem a pagar "
                        + contrib[i].calcularImposto()
                        + " euros de imposto\n");
            }
        }

        System.out.println("Listagem de desempregados");
        for (int i = 0; i < contrib.length; i++) {
            if (contrib[i] instanceof Desempregado) {
                System.out.println(contrib[i] + "\n... tem a pagar "
                        + contrib[i].calcularImposto()
                        + " euros de imposto\n");
            }
        }

        Desempregado.setTaxaOR(0.5f);

        System.out.println("Listagem de desempregados com a nova taxa");
        for (int i = 0; i < contrib.length; i++) {
            if (contrib[i] instanceof Desempregado) {
                System.out.println(contrib[i] + "\n... tem a pagar "
                        + contrib[i].calcularImposto()
                        + " euros de imposto\n");
            }
        }
    }
}
