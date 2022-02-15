import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

/**
 * @author Luís Araújo
 */
public class MainAniversarios {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Formatter ficheiro = new Formatter();
        boolean nomeFicheiroInvalido;
        String nome;
        //NOME
        System.out.println("\nIntroduza o nome do ficheiro: ");
        do {
            nomeFicheiroInvalido = false;
            try {
                String nomeFicheiro = in.nextLine();
                ficheiro = new Formatter(nomeFicheiro);
                System.out.println("Ficheiro criado");

            } catch (FileNotFoundException e) {
                System.out.println("Formato inválido");
            }
        } while (nomeFicheiroInvalido);
        System.out.println("Nome (''ENTER PARA TERMINAR''): ");
        do{
            nome = in.nextLine();
        }while(!nome.isEmpty());

        //DATA
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
                dataInvalida = false;
            } catch (NumberFormatException e) {
                System.out.println("Formato inválido");
                System.out.println("Digite novamente a data de aniversário(ano/mes/dia): ");

            } catch (DiaInvalidoException | MesInvalidoException e) {
                System.out.println(e.getMessage());
                System.out.println("Digite novamente a data de aniversário(ano/mes/dia): ");

            }
        } while (dataInvalida);
        Escrever.escreverFicheiro(nome, data1, String.valueOf(ficheiro));
        System.out.println("Aplicação terminada");
    }
}

