package vencimentos;

import java.util.Comparator;

/**
 * @author Luís Araújo
 */
public class Comparacao1 implements Comparator<Trabalhador> {

        @Override
        public int compare(Trabalhador t1, Trabalhador t2) {
            float v1 = t1.calcularVencimento();
            float v2 = t2.calcularVencimento();

            if (v1 < v2) {
                return -1;
            } else if (v1 > v2) {
                return 1;
            } else {
                return 0;
            }
        }
}
