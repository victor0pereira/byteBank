package Conta.Java;

public class Conta {
    // Saldo, Agencia, Numero, titular
    public double saldo;
    public int agencia, numero;
    public String titular;

    public void deposita(double valor){
         this.saldo += valor;
    }
    public boolean sacar (double valor) {
        if(this.saldo >= valor ){
            this.saldo -= valor;
            return true;
        }else {
            return false;
        }
    }
    // metodos
    public void transfere(double valor, Conta destino){
        if (this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
        }
    }
}
