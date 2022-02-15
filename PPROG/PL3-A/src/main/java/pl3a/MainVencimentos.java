package pl3a;

/**
 * @author Luís Araújo
 */
public class MainVencimentos {
    public static void main(String[] args) {
        /**
         * objeto da classe TrabalhadorPeca
         */
        TrabalhadorPeca tp = new TrabalhadorPeca("Jorge Silva", 53, 62);
        /**
         * objeto da classe TrabalhadorComissao
         */
        TrabalhadorComissao tc = new TrabalhadorComissao("Susana Ferreira", 650.00f, 4.25f, 2731.50f);
        /**
         * objeto da classe TrabalhadorHora
         */
        TrabalhadorHora th = new TrabalhadorHora("Carlos Miguel", 168, 4.50f);
        /**
         * contentor de objetos da classe Object
         */
        Object[] array = new Object[10];
        /**
         * guardar os objetos no array
         */
        array[0] = tp;
        array[1] = tc;
        array[2] = th;
        /**
         * Listagem das representações textuais dos trabalhadores;
         */
        System.out.println("LISTAGEM DOS TRABALHADORES:\n");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i].toString() + "\n");
            }
        }
        /**
         * Listagem das representações textuais apenas dos trabalhadores à hora;
         */
        System.out.println("LISTAGEM APENAS DOS TRABALHADORES À HORA\n");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (array[i] instanceof TrabalhadorHora) {
                    System.out.println(array[i].toString() + "\n");
                }
            }
        }
        /**
         * Listagem dos nomes dos trabalhadores existentes, acompanhadas dos respetivos vencimentos
         * (com duas casas decimais).
         */
        System.out.println("LISTAGEM DOS NOMES DOS TRABALHADORES JUNTAMENTE COM O SEU VENCIMENTO\n");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                    System.out.println(((Trabalhador) array[i]).getNome() + " tem um vencimento de " + ((Trabalhador) array[i]).calcularVencimento() + "\n");
                }
        }
        /**
         * Substitua o tipo Object do array pelo tipo Trabalhador
         */
        Trabalhador[] array2 = new Trabalhador[10];
        array2[0] = tp;
        array2[1] = tc;
        array2[2] = th;
        /**
         * Simplifique o código das listagens
         */
        System.out.println("LISTAGEM DOS TRABALHADORES:\n");
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] != null) {
                System.out.println(array2[i] + "\n");
            }
        }
        System.out.println("LISTAGEM APENAS DOS TRABALHADORES À HORA\n");
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] != null && array2[i] instanceof TrabalhadorHora) {
                System.out.println(array2[i] + "\n");
            }
        }
        System.out.println("LISTAGEM DOS NOMES DOS TRABALHADORES JUNTAMENTE COM O SEU VENCIMENTO\n");
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] != null) {
                System.out.println(array2[i].getNome() + " tem um vencimento de " + array2[i].calcularVencimento() + "\n");
            }
        }
    }
}
