import java.util.ArrayList;
import java.util.List;

/**
 * @author Luís Araújo
 */
public class MainEmpregado {
    public static void main(String[] args) {
        Data d1 = Data.dataAtual();
        System.out.println(d1.toAnoMesDiaString() + "\n");

        Tempo t1 = new Tempo(17, 25, 45);
        Tempo t2 = new Tempo(10, 46, 53);
        System.out.println(t1 + "\n");
        System.out.println(t2 + "\n");

        Empregado e1 = new Empregado("João", "Freitas", d1, t1, t2);
        Empregado e2 = new Empregado("Maria", "Vieira", d1, t1, t2);
        System.out.println(e1 + "\n");
        System.out.println(e2 + "\n");

        e1.setDataContrato(25, 4, 2018);
        System.out.println(e1 + "\n");
        System.out.println(e2 + "\n");

        d1.setData(2019, 5, 2);
        t1.setTempo(19, 2, 34);
        t2.setTempo(11, 39, 33);
        System.out.println(d1.toAnoMesDiaString() + "\n");
        System.out.println(t1 + "\n");
        System.out.println(t2 + "\n");
        e1.setDataContrato(d1);
        e1.setHoraEntrada(t2);
        e1.setHoraSaida(t1);
        System.out.println(e1 + "\n");
        System.out.println(e2 + "\n");

        e2.setDataContrato(3, 2, 2018);
        e2.setHoraEntrada(9, 0, 0);
        e2.setHoraSaida(15, 0, 0);
        System.out.println(e2 + "\n");

        List<Empregado> empregados = new ArrayList<>();
        empregados.add(e1);
        empregados.add(e2);
        listar(empregados);
        System.out.println("\n");
        listar2(empregados);
    }

    private static void listar(List<Empregado> empregados) {
        for (Empregado empre : empregados) {
            if (empre != null) {
                System.out.printf("Nome: %s %s \n", empre.getPrimeiroNome(), empre.getUltimoNome());
            }
        }
    }

    private static void listar2(List<Empregado> empregados) {
        for (Empregado empre : empregados) {
            if (empre != null) {
                System.out.printf("Nome: %s %s / Número de horas de trabalho por semana: %.2f / Antiguidade: %d \n", empre.getPrimeiroNome(), empre.getUltimoNome(),
                        empre.calcularHorasSemanais(), empre.tempoDeContrato());
            }
        }
    }
}
