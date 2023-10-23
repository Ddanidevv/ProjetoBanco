package exercicio1;

public class TesteConta {
    public static void main(String[] args) {
        Conta contaCorrente = new Conta();
        Conta contaPoupança = new Conta();
        Conta contaInvestimento = new Conta();

        contaCorrente.numero = 11;
        contaCorrente.saldo = 20.5;
        contaCorrente.cliente.nome = "Daniela";
        contaCorrente.cliente.idade = 50;

        contaPoupança.numero = 22;
        contaPoupança.saldo = 30;
        contaPoupança.cliente.nome ="Paula";
        contaPoupança.cliente.idade = 20;

        contaInvestimento.numero = 33;
        contaInvestimento.saldo = 50;
        contaInvestimento.cliente.nome = "Carla";
        contaInvestimento.cliente.idade = 46;

        System.out.println(contaCorrente.numero);
        System.out.println(contaCorrente.saldo);
        System.out.println(contaCorrente.cliente.nome);
        System.out.println(contaCorrente.cliente.idade);


    }
    
}
