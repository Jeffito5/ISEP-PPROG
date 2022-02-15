package pl2a;

/**
 * @author Luís Araújo
 */
public class Tempo {
    /**
     * hora
     */
    private int hora;
    /**
     * minuto
     */
    private int minuto;
    /**
     * segundo
     */
    private int segundo;
    /**
     * 3 variáveis por omissão
     */
    private static final int HORA_POR_OMISSAO = 0;
    private static final int MINUTO_POR_OMISSAO = 0;
    private static final int SEGUNDO_POR_OMISSAO = 0;

    /**
     * construtor sem parâmetros
     */
    public Tempo() {
        hora = HORA_POR_OMISSAO;
        minuto = MINUTO_POR_OMISSAO;
        segundo = SEGUNDO_POR_OMISSAO;

    }

    /**
     * construtor com os parâmetros hora, minuto e segundo
     *
     * @param hora
     * @param minuto
     * @param segundo
     */
    public Tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    /**
     * retorna a hora
     * @return
     */
    public int getHora(){
        return hora;
    }

    /**
     * retorna os minutos
     * @return
     */
    public int getMinuto(){
        return minuto;
    }

    /**
     * retorna os segundos
     * @return
     */
    public int getSegundo(){
        return segundo;
    }

    /**
     * define o tempo em horas, minutos e segundos
     * @param hora
     * @param minuto
     * @param segundo
     */
    public void setTempo(int hora, int minuto, int segundo){
        this.hora=hora;
        this.minuto=minuto;
        this.segundo=segundo;
    }

    /**
     * retorna a hora no formato hh:mm:ss
     * @return
     */
    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }

    /**
     * converte a hora para o formato AM/PM
     * @return
     */
    public String converterHoraAMPM(){
        String mensagem;
        if(hora<12){
            mensagem=hora + ":" + minuto + ":" + segundo + "AM";
        }else{
            mensagem=(hora-12) + ":" + minuto + ":" + segundo + "PM";
        }
        return mensagem;
    }

    /**
     * aumenta 1 segundo
     * @return
     */
    public String aumentarSegundo(){
        segundo++;
        segundo=segundo % 60;
        if(segundo==0){
            minuto++;
            minuto=minuto % 60;
            if(minuto==0){
                hora++;
                if(hora==24){
                    hora=0;
                }
            }
        }
        return hora + ":" + minuto + ":" + segundo;
    }

    /**
     * retorna uma string a dizer se o tempo é maior ou menor
     * @param outroTempo
     * @return
     */
    public String isMaior(Tempo outroTempo) {
        int countTempo1, countTempo2;
        boolean flag=false;
        countTempo1 = converter(hora, minuto, segundo);
        countTempo2 = outroTempo.converter(outroTempo.hora, outroTempo.minuto, outroTempo.segundo);
        if (countTempo1 > countTempo2){
            flag=true;
            return "True se o primeiro tempo é maior que o segundo: " + flag;
        }else{
            return "False se o segundo tempo é maior que o primeiro: " + flag;
        }
    }

    /**
     * converte as horas, minutos e segundos numa só unidade: segundos
     * @param hora
     * @param minuto
     * @param segundo
     * @return
     */
    public int converter(int hora, int minuto, int segundo) {
        int soma;
        hora = hora * 3600;
        minuto = minuto * 60;
        soma = hora + minuto + segundo;
        return soma;
    }

    /**
     * converte as horas, minutos e segundos numa só unidade: segundos
     * @param hora1
     * @param minuto1
     * @param segundo1
     * @return
     */
    public String isMaior(int hora1, int minuto1, int segundo1) {
        int countTempo1, countTempo2;
        boolean flag=false;
        countTempo1 = converter(hora, minuto, segundo);
        countTempo2 = converter(hora1, minuto1, segundo1);
        if (countTempo1 > countTempo2){
            flag=true;
            return "True se o primeiro tempo é maior que o segundo: " + flag;
        }else{
            return "False se se o segundo tempo é maior que o primeiro: " + flag;
        }
    }

    /**
     * calcula a diferença de tempos em segundos
     * @param outroTempo
     * @return
     */
    public int diferencaSegundos(Tempo outroTempo) {
        int countTempo1, countTempo2, diferenca;
        countTempo1 = converter(hora, minuto, segundo);
        countTempo2 = outroTempo.converter(outroTempo.hora, outroTempo.minuto, outroTempo.segundo);
        if (countTempo1 > countTempo2) {
            diferenca = (countTempo1 - countTempo2);
        } else {
            diferenca = (countTempo2 - countTempo1);
        }
        return diferenca;
    }

    /**
     * calcula a diferença de tempo em Tempo
     * @param outroTempo
     * @return
     */
    public String diferencaTempo(Tempo outroTempo) {
        int countTempo1, countTempo2, diferenca;
        countTempo1 = converter(hora, minuto, segundo);
        countTempo2 = outroTempo.converter(outroTempo.hora, outroTempo.minuto, outroTempo.segundo);
        if (countTempo1 > countTempo2) {
            diferenca = (countTempo1 - countTempo2);
        } else {
            diferenca = (countTempo2 - countTempo1);
        }
        return converter2(diferenca);
    }

    /**
     * coloca a diferenca no formato hh:mm:ss
     * @param diferenca
     * @return
     */
    public String converter2(int diferenca) {
        int horas = diferenca / 3600;
        int minutos = (diferenca - (horas * 3600)) / 60;
        int segundos = diferenca - (horas * 3600) - (minutos * 60);
        return horas + ":" + minutos + ":" + segundos;
    }
}

