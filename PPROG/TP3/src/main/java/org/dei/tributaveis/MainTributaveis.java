package org.dei.tributaveis;

import jdk.swing.interop.SwingInterOpUtils;

public class MainTributaveis {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("22-33-CC", 1000, "encarnado");
        System.out.println(v1);

        Veiculo v2 = new Veiculo("44-55-DD", 2500, Cores.AZUL);
        System.out.println(v2);

        Veiculo v3 = new Veiculo("11-22-BB", 1400, Veiculo.VERDE);
        System.out.println(v3);

        Moradia m1 = new Moradia("Rua do Bocage", 90, Moradia.CINZNTO);
        System.out.println(m1);

        Cores c = m1;
        c = v1;

        Tributavel[] tributavels = new Tributavel[4];
        tributavels[0] = v1;
        tributavels[1] = v2;
        tributavels[2] = v3;
        tributavels[3] = m1;

        double total=0;
        for(int i=0;i< tributavels.length;i++){
            if(tributavels[i]!=null){
                total+=tributavels[i].calcularImposto();
            }
        }

    }
}
