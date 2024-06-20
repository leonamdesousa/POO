public class ContaPoupanca extends Conta {
    public void ContaPouoanca(double saldoIncial){
        super.atualizaConta(saldoIncial);
    }
    public void atualizaConta(double taxaPercentual ){
        super.atualizaConta(taxaPercentual * 3);
    }
}


