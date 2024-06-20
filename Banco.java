public class Banco {
    private Conta [] contas;
    private int numContas;

    public Banco(int capacidade){
        contas = new Conta[capacidade];
        numContas = 0;
    }
    public void adiciona(Conta c ){
        if (numContas < contas.length){
            contas[numContas] = c;
            numContas++;
        }else {
            System.out.println("Banco cheio, não é possível adicionar mais contas.");
        }
    }
    public Conta pagaConta(int indice){
        if (indice >= 0 && indice < numContas){
            return contas[indice];
        } else {
            System.out.println("Índice inválido.");
            return null;
        }
    }
    public int pegaTotalDeContas(){
        return numContas;
    }
}
