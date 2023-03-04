package CriaConta.Java;
import Conta.Java.Conta;

public class TesteMetodo {
    public static void main(String[] args){
        Conta contaDoZe = new Conta();
        contaDoZe.saldo = 100;
        System.out.println(contaDoZe.saldo);
        contaDoZe.deposita(50);
        System.out.println(contaDoZe.saldo);
        contaDoZe.sacar(50);
        System.out.println("Saldo do Zé é de " + contaDoZe.saldo);

        Conta contaDaMaria = new Conta();
        contaDaMaria.deposita(1000);
        System.out.println("Saldo da MAria é de " + contaDaMaria.saldo);
        contaDaMaria.transfere(100, contaDoZe);
        System.out.println("Saldo da MAria é de " + contaDaMaria.saldo);
        System.out.println("Saldo da zé é de " + contaDoZe.saldo);
    }
}
