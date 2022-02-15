package pt.isep.tp9.listatelefonica.model;

import java.io.*;

public class FicheiroListaTelefonica {

    public static final String NOME_FICHEIRO = "ListaTelefonica.ltf";

    public FicheiroListaTelefonica() {
    }

    public ListaTelefonica ler() {
        return ler(NOME_FICHEIRO);
    }

    public ListaTelefonica ler(String nomeFicheiro) {
        return ler(new File(nomeFicheiro));
    }

    // grava e lê a partir de ficheiros binários
    public ListaTelefonica ler(File ficheiro) {
        ListaTelefonica listaTelefonica;
        try {
            ObjectInputStream in = new ObjectInputStream( // lê a partir do ficheiro já criado
                    new FileInputStream(ficheiro));
            try {
                listaTelefonica = (ListaTelefonica) in.readObject(); // lê
            } finally {
                in.close(); // fecha a leitura
            }
            return listaTelefonica;
        } catch (IOException | ClassNotFoundException ex) {
            return new ListaTelefonica();
        }
    }
///////////////////////////////////////////////////////////////////

    public boolean guardar(ListaTelefonica listaTelefonica) {
        return guardar(NOME_FICHEIRO, listaTelefonica);
    }
    
    public boolean guardar(String nomeFicheiro, ListaTelefonica listaTelefonica) {
        return guardar(new File(nomeFicheiro), listaTelefonica);
    }
//////////////////////////////////////////////////////////////////
    public boolean guardar(File ficheiro, ListaTelefonica listaTelefonica) {
        try {
            ObjectOutputStream out = new ObjectOutputStream( //criar o ficheiro. ObjectOutputStream- dispositivo que guarda objetos
                    new FileOutputStream(ficheiro));
            try {
                out.writeObject(listaTelefonica); //grava a lista
            } finally {
                out.close(); // fecha o ficheiro
            }
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
}