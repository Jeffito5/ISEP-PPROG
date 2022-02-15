package pl6;

import java.util.Comparator;

/**
 * @author Luís Araújo
 */
public class ComparacaoTipoNome implements Comparator<Contribuinte> {
    @Override
    public int compare(Contribuinte c1, Contribuinte c2) {
        int c=c1.getClass().getName().compareTo(c2.getClass().getName());
        if(c<0){
            return -2;
        } else {
            if (c > 0) {
                return 2;
            } else {
                int com2=c1.getNome().compareTo(c2.getNome());
                if(com2<0){
                    return -1;
                }else {
                    if(com2>0){
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
        }
    }
}


