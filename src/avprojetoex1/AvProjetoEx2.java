package avprojetoex1;

import java.util.Scanner;

public class AvProjetoEx2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int numeroCliente, saldo, saldoAtual, debito, credito;
        System.out.println("Coloque o numero do cliente:");
        numeroCliente = ler.nextInt();
        System.out.println("Coloque o saldo do cliente:");
        saldo = ler.nextInt();
        System.out.println("Coloque o debito do cliente:");
        debito = ler.nextInt();
        System.out.println("Coloque o credito do cliente:");
        credito = ler.nextInt();
        
        saldoAtual = credito - debito + saldo;
        
        if (saldoAtual >= 0){
            System.out.println("Seu saldo é de:" +saldoAtual
            +"\n Seu saldo da conta é positivo!!");} else {
            System.out.println("o seu saldo é de"+saldoAtual
                    +"\n saldo da conta é negativo");}
        
            
    }

}
