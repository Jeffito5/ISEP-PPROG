package pl1b;

import java.util.Calendar;

public class MainData {
    public static void main(String[] args) {

        /**
         * vai buscar a data de hoje
         */
        Calendar hoje = Calendar.getInstance();
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int mes = hoje.get(Calendar.MONTH) + 1;
        int ano = hoje.get(Calendar.YEAR);

        /**
         * Crie uma instância da classe Data com o nome data1 e que represente a data de hoje
         */
        Data data1 = new Data();
        data1.setData(ano, mes, dia);
        /**
         * Mostre data1 usando o formato por extenso.
         */
        System.out.println("A data de hoje é: " + data1.toString());
        /**
         * Crie uma outra instância da classe Data chamada data2 que guarde a data 25 de abril de 1974
         */
        Data data2 = new Data();
        data2.setData(1974, 04, 25);
        /**
         * Mostre data2 no formato "ano/mês/dia".
         */
        System.out.println(data2.toAnoMesDiaString());
        /**
         * Utilize o método de instância isMaior para confirmar que, de facto, data1 é mais recente do que data2.
         */
        System.out.println("True se for mais recente: " + data1.isMaior(data2));
        /**
         * Determine o número de dias entre data1 e data2.
         */
        System.out.println("O numero de dias sao: " + data1.calcularDiferenca(data2));
        /**
         * Determine o número de dias que faltam para o Natal, usando o método que recebe, por
         * parâmetro, o dia, o mês e o ano de uma data.
         */
        System.out.println("Faltam: " + data1.calcularDiferenca(2020, 12, 25) + " dias");
        /**
         * Determine o dia da semana em que ocorreu o dia 25 de abril de 1974
         */
        System.out.println("Dia da semana: " + data2.determinarDiaDaSemana());
        /**
         * Verifique se o ano 1974 foi bissexto, invocando o método de classe isAnoBissexto:
         * ▪ Através do objeto data2;
         * ▪ Através da classe Data.
         */
        System.out.println("True se for bissexto: " + Data.isAnoBissexto(data2.getAno()));
    }
}
