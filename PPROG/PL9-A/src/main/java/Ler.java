/**import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

/**
 * @author Luís Araújo
 */
/**public class Ler {
    public static Data lerData(Formatter nomeFicheiro) throws IOException {
        Scanner in = new Scanner(System.in);
        Data data1 = new Data();
        boolean dataInvalida = true;
        System.out.println("Data de aniverário (ano/mes/dia): ");
        do {
            try {
                String[] data = in.nextLine().trim().split("/");
                if (data.length != 3) {
                    throw new NumberFormatException();
                }
                int ano = Integer.parseInt(data[0]);
                int mes = Integer.parseInt(data[1]);
                int dia = Integer.parseInt(data[2]);
                data1.setData(ano, mes, dia);
                Escrever.escreverFicheiro(String.valueOf(data1));
                dataInvalida = false;
            } catch (NumberFormatException e) {
                System.out.println("Formato inválido");
                System.out.println("Digite novamente a data de aniversário(ano/mes/dia): ");

            } catch (DiaInvalidoException | MesInvalidoException e) {
                System.out.println(e.getMessage());
                System.out.println("Digite novamente a data de aniversário(ano/mes/dia): ");

            }
        } while (dataInvalida);
        return data1;
    }
}**/

