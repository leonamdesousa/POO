public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double taxa;

    public AtualizadorDeContas(double taxa){
        this.taxa = taxa;
    }

    public void roda(Conta conta){
        System.out.println("Saldo anterior: " + conta.getSaldo());
        conta.atualizaConta(taxa);
        System.out.println("Saldo atualizado: " + conta.getSaldo());
        saldoTotal += conta.getSaldo();
    }
    public double getSaldoTotal(){
        return saldoTotal;
    }
}

