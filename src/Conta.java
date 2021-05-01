public class Conta {

    private double saldo;

    public Conta(double saldo) {
        this.saldo = 0;
    }

    public void deposito(double valor){
        this.saldo += valor;
    }
    public void saque(double valor){
        this.saldo -= valor;
    }

    public double saldo(){
        return this.saldo;
    }

}
