public class Main {
    public static void main(String[] args) {
        AreaCalculavel quadrado = new Quadrado(5.5);
        AreaCalculavel retangulo = new Retangulo(8.4, 6.7 );

        // Calcule e imprima as áreas
        System.out.println("Área do Quadrado: " + quadrado.calcularArea());
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());

        Conta contaCorrente = new ContaCorrente(1000);
        Conta contaPoupanca = new ContaPoupanca(2000);
        ContaInvestimento contaInvestimento = new ContaPoupancaInvestimento(3000);

        contaCorrente.depositar(500);
        contaCorrente.sacar(200);
        System.out.println("Saldo da Conta Corrente: " + contaCorrente.getSaldo());

        contaPoupanca.depositar(1000);
        contaPoupanca.sacar(400);
        System.out.println("Saldo da Conta Poupança: " + contaPoupanca.getSaldo());

        contaInvestimento.depositar(2000);
        contaInvestimento.sacar(600);
        System.out.println("Saldo da Conta Poupança Investimento: " + contaInvestimento.getSaldo());
        System.out.println("Rendimento da Conta Poupança Investimento: " + ((ContaPoupancaInvestimento) contaInvestimento).calcularRendimento());
    }
}