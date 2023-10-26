package exercicio3;
/**
 * Classe que abstrai uma Conta Bancaria
 * @daniela
 * @version 1.0
 */
public class Conta {
/**
 * Número da Agencia
 */
  int agencia;
  /**
   * Número da conta
   */
  int numero;
  /**
   * Saldo da Conta
   */
  double saldo;

  public Conta() {

  }

  public Conta(int agencia, int numero, double saldo) {
    super();
    this.agencia = agencia;
    this.numero = numero;
    this.saldo = saldo;
  }

  /**
   * Deposita um valor ao saldo da conta
   * @param valor Valor a ser depositado
   */
  public void depositar(double valor) {
  //this.saldo = this.saldo + valor;
  this.saldo += valor;
  }

/** Retira um valor do saldo da conta
 * @param valor Valor a ser retirado
 */
  public void retirar(double valor) {
    this.saldo -= valor;
  }

/**
 * Verificar o saldo da conta
 * @return Valor do saldo da conta
 */
  /*public double verificaSaldo() {
    return this.saldo;
  }*/
  public int getNumero() {
    return numero;
    }
    public void setNumero(int numero) {
    this.numero = numero;
    }
    public int getAgencia() {
    return agencia;
}
public void setAgencia (int agencia){
  this.agencia = agencia;
}
public double getSaldo(){
  return saldo;
}

public void SetSaldo (double saldo){
  this.saldo = saldo;
}
}
