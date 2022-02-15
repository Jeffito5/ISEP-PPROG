import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Luís Araújo
 */
public class Escrever {

    public static void escreverFicheiro(String nome, Data data, String nomeFicheiro) throws IOException {
        FileWriter myWriter = new FileWriter(nomeFicheiro);
        myWriter.write(nome + ";" + data);
        myWriter.close();
    }
}
