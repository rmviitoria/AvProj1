package avprojetoex1;

import java.util.Scanner;

public class AvProjetoEx1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int queijo, carne, presunto, quantidade;
        queijo = 50;
        carne = 50;
        presunto = 100;
        System.out.println("Coloque a quantidade de hamburguers:");
        quantidade = ler.nextInt();
        
        queijo = quantidade * queijo;
        presunto = quantidade * presunto;
        carne = quantidade * carne;
        
        System.out.println("O valor dos produtos são:"
        +"\n" +"Queijo"+queijo +"g"
        +"\n" +"Presunto"+presunto +"g"
        +"\n" +"Carne"+carne +"g");

    }

}
