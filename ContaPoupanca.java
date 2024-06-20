public class ContaPoupanca implements Conta{
    private double saldo;

    public ContaPoupanca(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
