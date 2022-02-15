package pl4a;

/**
 * @author Luís Araújo
 */
public class MainContadores {
    public static void main(String[] args) {
        ContadorGas g1 = new ContadorGas("Pedro Ferriera", 12);
        ContadorGas g2 = new ContadorGas("Ana Barbosa", 17);
        ContadorGas g3 = new ContadorGas("Bruno Rocha", 10);
        TarifarioSimples e1 = new TarifarioSimples("Mariana Almeida", 1200, 5.7f);
        TarifarioBiHorario e2 = new TarifarioBiHorario("João Silva", 500, 158);
        TarifarioSimples e3 = new TarifarioSimples("Bárbara Dantas", 1700, 7.8f);

        Contador[] contador = new Contador[10];

        contador[0] = g1;
        contador[1] = g2;
        contador[2] = g3;
        contador[3] = e1;
        contador[4] = e2;
        contador[5] = e3;

        System.out.println("\nContadores:");
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] != null) {
                System.out.println(((Contador) contador[i]));
            }
        }

        System.out.println("\nTotal de contadores de eletricidade: " + ContadorEletrico.getNumContador());

        System.out.println("\nContadores Bi-partidos:");
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] instanceof TarifarioBiHorario) {
                System.out.println(((Contador) contador[i]).getId());
            }
        }

        System.out.println("\nCustos");
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] != null) {
                System.out.println(contador[i].getId() + ": " + contador[i].calcularCusto() + " euros");
            }
        }

        float max = 0;
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] != null && contador[i] instanceof ContadorGas) {
                if (max < ((ContadorGas) contador[i]).calcularCusto()) {
                    max = ((Contador) contador[i]).calcularCusto();
                }
            }
        }
        System.out.println("Maior valor: %f%n" + max);

        String[] nomes = new String[10];
        System.out.println("\nClientes");
        nomes[0] = contador[0].getNome_cliente();
        int totalClientes = 1;
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] != null) {
                boolean duplicado = false;
                int j = 0;
                while (j < totalClientes && !duplicado) {
                    if (contador[i].getNome_cliente().equalsIgnoreCase(nomes[j])) {
                        duplicado = true;
                    }
                    j++;
                }
                if (!duplicado) {
                    nomes[totalClientes] = contador[i].getNome_cliente();
                    totalClientes++;
                }
            }
        }
        for (int i = 0; i < totalClientes; i++) {
            System.out.println(nomes[i]);
        }
    }
}