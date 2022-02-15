/**
 * @author Luís Araújo
 */
public class Empregado {
    private String primeiroNome;
    private String ultimoNome;
    private Data dataContrato;
    private Tempo horaEntrada;
    private Tempo horaSaida;

    private static final String PRIMEIRO_NOME_POR_OMISSAO = "Sem primeiro nome";
    private static final String ULTIMO_NOME_POR_OMISSAO = "Sem último nome";

    public Empregado(String primeiroNome, String ultimoNome, int anoContrato, int mesContrato, int diaContrato,
                     int horaEntrada, int minutoEntrada, int horaSaida, int minutoSaida) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.dataContrato = new Data(anoContrato, mesContrato, diaContrato);
        this.horaEntrada = new Tempo(horaEntrada, minutoEntrada);
        this.horaSaida = new Tempo(horaSaida, minutoSaida);
    }

    public Empregado(String primeiroNome, String ultimoNome, Data dataContrato, Tempo horaEntrada, Tempo horaSaida) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.dataContrato = new Data(dataContrato);
        this.horaEntrada = new Tempo(horaEntrada);
        this.horaSaida = new Tempo(horaSaida);
    }

    public Empregado(String primeiroNome, String ultimoNome, Data dataContrato) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.dataContrato = new Data(dataContrato);
    }

    public Empregado() {
        primeiroNome = PRIMEIRO_NOME_POR_OMISSAO;
        ultimoNome = ULTIMO_NOME_POR_OMISSAO;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public Data getDataContrato() {
        return new Data(dataContrato);
    }

    public void setDataContrato(Data dataContrato) {
        this.dataContrato = new Data(dataContrato);
    }

    public void setDataContrato(int diaContrato, int mesContrato, int anoContrato) {
        this.dataContrato = new Data(anoContrato, mesContrato, diaContrato);
    }

    public Tempo getHoraEntrada() {
        return new Tempo(horaEntrada);
    }

    public void setHoraEntrada(Tempo horaEntrada) {
        this.horaEntrada = new Tempo(horaEntrada);
    }

    public void setHoraEntrada(int hora, int minuto, int segundo) {
        this.horaEntrada = new Tempo(hora, minuto, segundo);
    }

    public Tempo getHoraSaida() {
        return new Tempo(horaSaida);
    }

    public void setHoraSaida(Tempo horaSaida) {
        this.horaSaida = new Tempo(horaSaida);
    }

    public void setHoraSaida(int hora, int minuto, int segundo) {
        this.horaSaida = new Tempo(hora, minuto, segundo);
    }

    @Override
    public String toString() {
        return String.format("Primeiro nome: %s\n" +
                        "Ultimo nome: %s\n" +
                        "Data de Contrato: %s\n" +
                        "Hora de Entrada: %s\n" +
                        "Hora de Saída: %s\n", primeiroNome, ultimoNome,
                dataContrato.toAnoMesDiaString(), horaEntrada.toStringHHMMSS(),
                horaSaida.toStringHHMMSS());
    }

    public float calcularHorasSemanais() {
        final int NUMERO_HORAS_DO_DIA = 24;
        final int NUMERO_SEGUNDOS_DA_HORA = 3600;
        final int NUMERO_DIAS_TRABALHO_SEMANA = 5;

        int segundos = horaSaida.diferencaEmSegundos(horaEntrada);
        if (horaEntrada.isMaior(horaSaida)) {
            segundos = NUMERO_HORAS_DO_DIA * NUMERO_SEGUNDOS_DA_HORA - segundos;
        }
        return (float) (segundos / NUMERO_SEGUNDOS_DA_HORA * NUMERO_DIAS_TRABALHO_SEMANA);
    }

    public int tempoDeContrato() {
        Data d1 = Data.dataAtual();
        int anos = d1.getAno() - dataContrato.getAno();

        if (anos > 0 && (dataContrato.getMes() > d1.getMes()) || (dataContrato.getMes() == d1.getMes() && dataContrato.getDia() > d1.getDia())) {
            anos--;
        }

        return anos;
    }

}
