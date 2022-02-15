package pl4b;

/**
 * @author Luís Araújo
 */
public class MainMembrosEscolares {
    public static void main(String[] args) {
        Professor p1 = new Professor("Pedro Viana", 156924567, "Coordenador");
        Professor p2 = new Professor("Maria Ferreira", 184501356, "Assistente");
        Professor p3 = new Professor("Ana Guedes", 567123509, "Adjunto");
        Aluno a1 = new Aluno("Jõao Pedro", 148230576, 119274712);
        Aluno a2 = new Aluno("Mafalda Castro", 245013484, 119264954, true);

        MembroEscolar[] membroEscolars = new MembroEscolar[5];
        membroEscolars[0] = p1;
        membroEscolars[1] = p2;
        membroEscolars[2] = p3;
        membroEscolars[3] = a1;
        membroEscolars[4] = a2;

        System.out.println("LISTAGEM DOS PROFESSORES: NOME E CATEGORIA%n");
        for (int i = 0; i < membroEscolars.length; i++) {
            if (membroEscolars[i] != null && membroEscolars[i] instanceof Professor) {
                System.out.println("Professor: %s /" + membroEscolars[i].getNome() + " Categoria: %s%n" + ((Professor) membroEscolars[i]).getCategoria());
            }
        }

        System.out.println("LISTAGEM DOS ALUNOS NÃO BOLSEIROS: NÚMERO MECANOGRÁFICO%n");
        for (int i = 0; i < membroEscolars.length; i++) {
            if (membroEscolars[i] != null && membroEscolars[i] instanceof Aluno) {
                if (((Aluno) membroEscolars[i]).isBolsa() == false) {
                    System.out.println("Número mecanográfico: %d%n" + ((Aluno) membroEscolars[i]).getNumeroMecano());
                }
            }
        }

        System.out.println("LISTAGEM DOS NOMES DOS MEMBROS E CLASSE%n");
        for (int i = 0; i < membroEscolars.length; i++) {
            if (membroEscolars[i] != null) {
                System.out.println("Nome: %s /" + membroEscolars[i].getNome() + " Classe: %d%n" + membroEscolars[i].getClass());
            }
        }
        System.out.println("LISTAGEM DOS PROFESSORES: NOME E SALÁRIO%n");
        for (int i = 0; i < membroEscolars.length; i++) {
            if (membroEscolars[i] != null && membroEscolars[i] instanceof Professor) {
                System.out.println("Professor: %s /" + membroEscolars[i].getNome() + " Salário: %f%n" + ((Professor) membroEscolars[i]).calcularSalario());
            }
        }

        System.out.println("LISTAGEM DOS ALUNOS: NOME E BOLSA%n");
        for (int i = 0; i < membroEscolars.length; i++) {
            if (membroEscolars[i] != null && membroEscolars[i] instanceof Aluno) {
                if (((Aluno) membroEscolars[i]).isBolsa() == true) {
                    System.out.println("Aluno: %d /" + membroEscolars[i].getNome() + " Bolsa: %d%n" + ((Aluno) membroEscolars[i]).devolveBolsa());
                }
            }
        }
        float encargo = 0;
        System.out.println("VALOR TOTAL DOS ENCARGOS%n");
        for (int i = 0; i < membroEscolars.length; i++) {
            if (membroEscolars[i] != null && membroEscolars[i] instanceof Professor) {
                encargo = ((Professor) membroEscolars[i]).calcularSalario();
            } else {
                if (((Aluno) membroEscolars[i]).isBolsa() == true) {
                    encargo = ((Aluno) membroEscolars[i]).devolveBolsa();
                }
            }
        }
        System.out.println("Encargo= %f%n" + encargo);
    }
}
