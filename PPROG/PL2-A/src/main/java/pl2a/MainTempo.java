package pl2a;

/**
 * @author Luís Araújo
 */
public class MainTempo {
    public static void main(String[] args) {
        /**
         * criar uma nova instância de tempo
         */
        Tempo t1 = new Tempo();
        t1.setTempo(5, 30, 12);
        /**
         * mostrar o tempo no formato hh:mm:ss AM (ou PM)
         */
        System.out.println(t1.converterHoraAMPM());
        /**
         * acrescentar 1 segundo ao t1
         */
        t1.aumentarSegundo();
        /**
         * mostrar o tempo no formato hh:mm:ss AM (ou PM)
         */
        System.out.println(t1.converterHoraAMPM());
        /**
         * criar uma nova instância de tempo: t2
         */
        Tempo t2=new Tempo();
        t2.setTempo(18,5,20);
        /**
         * verificar se o t1 é maior que t2
         */
        System.out.println(t1.isMaior(t2));
        /**
         * verificar se o t1 é maior que 23:07:04
         */
        System.out.println(t1.isMaior(23,7,4));
        /**
         * determinar a diferença entre t1 e t2 em segundos
         */
        System.out.println(t1.diferencaSegundos(t2));
        /**
         * determinar a diferença entre t1 e t2 em Tempo
         */
        System.out.println(t1.diferencaTempo(t2));
    }
}
