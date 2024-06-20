public class Conta {
    private double saldo;

    // Construtor
    public Conta() {
        this.saldo = 1000;
    }
    //construtor de saldo inicial
    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    // Método para obter o saldo atual
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar dinheiro na conta
    public void deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar dinheiro da conta
    public void saca(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    // Método para atualizar a conta de acordo com uma taxa percentual
    public void atualizaConta(double taxaPercentual) {
        if (taxaPercentual >= 0) {
            double multiplicador = 1 + (taxaPercentual / 100.0);
            saldo *= multiplicador;
            System.out.println("Conta atualizada com sucesso. Nova saldo: R$" + saldo);
        } else {
            System.out.println("Taxa percentual inválida.");
        }
    }
}
