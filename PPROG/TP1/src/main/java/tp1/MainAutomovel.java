package tp1;

public class MainAutomovel {
    public static void main(String[] msris) {
        Automovel a1 = new Automovel("11-11-AA","Toyota",1400);
        System.out.println("3\na)");
        System.out.println(a1);
        System.out.println("\nb)");
        System.out.printf("Matricula: %s",a1.getMatricula());
        System.out.printf("\nc)\nQuantidade de Automoveis criadas: %d\n",Automovel.getTotalAutomoveis());
        Automovel a2 = new Automovel("22-22-BB","Audi");
        System.out.println("f)\n"+a2+"\n");
        a2.setCilindrada(1800);
        System.out.println("h)\n"+a2);
        System.out.printf("\ni)\nQuantidade de Automoveis criadas: %d\n",Automovel.getTotalAutomoveis());
        System.out.printf("j)\nDiferença de cilindrada: %d\n",a2.calcularDiferencaCilindrada(a1));
        System.out.println("\nk)\n");
        if(a1.isCilindradaMaior(a2)) {
            System.out.printf("A matricula do maior: %s\n",a1.getMatricula());
        }else {
            System.out.printf("A matricula do maior: %s\n",a2.getMatricula());
        }
        System.out.println("\nA cilindrada de a1 é maior que 2000 cc?\nR: "+a1.isCilindradaMaior(2000)+"\n");
    }
}
