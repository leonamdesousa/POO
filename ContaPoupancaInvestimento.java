public class ContaPoupancaInvestimento implements ContaInvestimento {
    private double saldo;

    public ContaPoupancaInvestimento(double saldoInicial) {
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

    @Override
    public double calcularRendimento() {
        // Implemente o cálculo de rendimento específico para Conta Poupança Investimento
        return saldo * 0.03; // Exemplo simples de rendimento
    }
}
