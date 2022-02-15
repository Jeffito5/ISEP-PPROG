import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Luís Araújo
 */
public class Main {
    public static void main(String[] args) {
        List<Quadro> quadros = new ArrayList<>();
        Data d1 = new Data(2010, 5, 24);
        Data d2 = new Data(1970, 12, 2);
        Data d3 = new Data(2000, 4, 10);
        Data d4 = new Data(1990, 7, 19);
        Data d5 = new Data(2003, 9, 22);
        Quadro q1 = new Quadro("Renascimento", "Paulito Asciendi", d1);
        Quadro q2 = new Quadro("Vanguardista", "Armanda Tarmi", d2);
        Quadro q3 = new Quadro("Arcaico", "Benji Rowler", d3);
        Quadro q4 = new Quadro("Renascimento", "Benjamin Raike", d4);
        Quadro q5 = new Quadro("Renascimento", "Alexa Varski", d5);

        quadros.add(q1);
        quadros.add(q2);
        quadros.add(q3);
        quadros.add(q4);
        quadros.add(q5);

        listar(quadros);
        Data d6 = new Data(2021, 4, 25);
        Exposicao e1 = new Exposicao("Exposição 1", d6, q1);
        Exposicao e2 = new Exposicao("Exposição 2", d6, q1);
        Exposicao e3 = new Exposicao("Exposição 3", d6, q5);

        List<Exposicao> exposicao = new ArrayList<>();

        exposicao.add(e1);
        exposicao.add(e2);
        exposicao.add(e3);

        listar(exposicao);

        q1.setNome_autor("Bianca Normani");
        listar(quadros);
    }

    /**private static void listar(List<Quadro> quadros) {
        for (Quadro quad : quadros) {
            if (quad != null) {
                System.out.printf("Nome: %s / Designação: %s / Ano de criação: %s\n", quad.getNome_autor(), quad.getDesignacao(), quad.getDataContrato());
            }
        }
    }

    private static void listar2(List<Exposicao> exposicao) {
        for (Exposicao exp : exposicao) {
            if (exp != null) {
                System.out.printf("Designação: %s / Ano de realização: %s / Quadro: %s\n", exp.getDesignacao(), exp.getAnoRealizacao(), exp.toString());
            }
        }
    }**/
    public static void listar(List conjunto){
        Collections.sort(conjunto);
        for(Object o : conjunto){
            System.out.println(o);
        }
    }
}
