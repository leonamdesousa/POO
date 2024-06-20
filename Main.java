import java.awt.event.ContainerAdapter;

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso da classe Conta
        Conta minhaConta = new Conta(1000.0);

        System.out.println("Saldo inicial: R$" + minhaConta.getSaldo());

        minhaConta.deposita(500.0);
        minhaConta.saca(200.0);

        System.out.println("Saldo após operações: R$" + minhaConta.getSaldo());

        minhaConta.atualizaConta(5.0); // Atualiza a conta com uma taxa de 5%

        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        AtualizadorDeContas atualizador = new AtualizadorDeContas(0.1);
        atualizador.roda(minhaConta);
        atualizador.roda(cc);
        atualizador.roda(cp);

        System.out.println("Saldo total no banco: R$" + atualizador.getSaldoTotal());

        }
    }