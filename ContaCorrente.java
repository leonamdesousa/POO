public class ContaCorrente extends Conta {
    public void atualiza(double saldoInicial) {
        super.atualizaConta(saldoInicial);
    }
    public void atuallizaConta(double taxaPercentual ){
        super.atualizaConta(taxaPercentual * 2);
    }
}
