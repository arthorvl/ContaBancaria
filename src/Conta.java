public class Conta {

    private double saldo;

    public Conta() {
        this.saldo = 0;
    }

    public boolean deposito(double valor){
        if(valor <= 0){
            return false;
        }
        this.saldo += valor;
        return true;
    }
    public boolean saque(double valor){
        if(valor <= 0){
            return false;
        }
        if(valor >= this.saldo){
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public double saldo(){
        return this.saldo;
    }

}
