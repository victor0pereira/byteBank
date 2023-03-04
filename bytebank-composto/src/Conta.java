public class Conta {
        // Saldo, Agencia, Numero, titular
        //Neste caso, colocamos o private em saldo poís assim niguém consegue alterar o valor diretamente, somente usando merodos
        private double saldo;
        int agencia, numero;
        Cliente titular = new Cliente();

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
        public double pegaSaldo(){
            return this.saldo;
        }
}
