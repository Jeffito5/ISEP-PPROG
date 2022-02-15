package pl6;

import java.util.Comparator;

/**
 * @author Luís Araújo
 */
public class ComparacaoTipo implements Comparator<Contribuinte> {
    @Override
    public int compare(Contribuinte c1, Contribuinte c2) {
        String tipo1=c1.getClass().getName();
        String tipo2=c2.getClass().getName();
        return tipo1.compareTo(tipo2);
    }
}
