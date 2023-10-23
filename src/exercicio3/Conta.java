package exercicio3;

public class Conta {

  int agencia;
  int numero;
  double saldo;

  public Conta() {}

  public Conta(int agencia, int numero, double saldo) {
    super();
    this.agencia = agencia;
    this.numero = numero;
    this.saldo = saldo;
  }
  public void depositar(double valor) {
  //this.saldo = this.saldo + valor;
  this.saldo += valor;
  }

  public void retirar(double valor) {
    this.saldo -= valor;
  }

  public double verificaSaldo() {
    return this.saldo;
  }
}
