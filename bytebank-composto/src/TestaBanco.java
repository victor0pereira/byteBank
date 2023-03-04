public class TestaBanco {
    public static void main(String[] args) {
        Cliente ze = new Cliente();
        ze.nome = "ze";
        ze.cpf = "222.222.222-22";
        ze.profissao = "Bicheiro";

        Conta contaDoZe = new Conta();
        contaDoZe.deposita(1000);
        System.out.println(contaDoZe.pegaSaldo());

        // associa o cliente ze a conta ContaDoZe
        contaDoZe.titular = ze;
        System.out.println(contaDoZe.titular.nome);
    }
}
