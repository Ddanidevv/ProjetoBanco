package exercicio3;

public class TesteConta {
    public static void main(String[] args) {
        //construtor padrão
        Conta cc = new Conta();
        cc.saldo = 50.0;
        cc.agencia = 123;
        cc.numero = 1234;

        cc.depositar(1000);
        System.out.println(cc.verificaSaldo());


        Conta poupanca = new Conta(111,222,100);
        poupanca.retirar(50);

        System.out.println(poupanca.verificaSaldo());
    }
}
