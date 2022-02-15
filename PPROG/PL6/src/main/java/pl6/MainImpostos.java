package pl6;

import sun.security.krb5.internal.crypto.Des;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Luís Araújo
 */
public class MainImpostos {
    public static void main(String[] args) {
        /**System.out.println("Teste de Impostos%n");

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
        }**/
        //1. 2.
        List<Contribuinte> contribuintes=new ArrayList<Contribuinte>();
        contribuintes.add(new Desempregado("Lito Vidal", "Lisboa", 230, 1));
        contribuintes.add(new Reformado("Valter Cubilhas", "Olival", 600, 400));
        contribuintes.add(new Desempregado("Paulo Santos", "Braga", 150, 4));
        contribuintes.add(new TrabalhadorContaOutrem("Ana", "Ovar", 1800, 300, "CMM"));
        contribuintes.add(new Reformado("Jaime Magalhães", "Porto", 1500, 100));
        contribuintes.add(new TrabalhadorContaOutrem("Salvio", "Seixal", 8000, 1000, "SSB"));
        contribuintes.add(new TrabalhadorContaPropria("Mário", "Guarda", 1500, 300, "Eletricista"));
        contribuintes.add(new Reformado("Aníbal Silva", "Coimbra", 1000, 500));
        contribuintes.add(new TrabalhadorContaOutrem("João", "Lisboa", 800, 100, "CML"));
        contribuintes.add(new TrabalhadorContaPropria("Carla", "Porto", 15000, 1000, "Advogado"));
        contribuintes.add(new Desempregado("Maria Sá", "Afife", 230, 8));

        //3.
        System.out.println("Listagem dos contribuintes\n");
        for(Contribuinte contribuinte : contribuintes){
            System.out.println(contribuinte);
        }

        //4. 5.
        Desempregado d1=new Desempregado("Lito Vidal", "Lisboa", 230, 1);
        contribuintes.remove(d1);
        for(Contribuinte contribuinte : contribuintes){
            System.out.println(contribuinte);
        }

        //6. 7.
        contribuintes.remove(d1);
        for(Contribuinte contribuinte : contribuintes){
            System.out.println(contribuinte);
        }

        //8 a)
        Desempregado d2=new Desempregado("Paulo Santos", "Braga", 150, 4);
        contribuintes.add(d2);
        System.out.println(contribuintes.get(1).equals(contribuintes.get(10)));

        //8 b)
        System.out.println(contribuintes.get(0).equals(contribuintes.get(2)));

        //8 c)
        System.out.println(contribuintes.get(0).equals(contribuintes.get(1)));

        //9 a)
        System.out.println("Ordem inversa do tipo\n");
        ComparacaoTipo criterio1=new ComparacaoTipo();
        Collections.sort(contribuintes, Collections.reverseOrder(criterio1));
        System.out.println(contribuintes);

        //9 b)
        System.out.println("Ordem alfabética inversa dos tipos de contribuintes\n");
        ComparacaoTipoNome criterio2=new ComparacaoTipoNome();
        Collections.sort(contribuintes, criterio2);
        System.out.println(contribuintes);

    }

}
