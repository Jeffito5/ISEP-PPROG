package vencimentos;

import java.util.Comparator;
import java.util.Locale;

/**
 * @author Luís Araújo
 */
public class Comparacao2 implements Comparator<Trabalhador> {

    @Override
    public int compare(Trabalhador t1, Trabalhador t2) {
        String n1 = t1.getNome();
        String n2 = t2.getNome();

        return n1.compareTo(n2);
    }
}


