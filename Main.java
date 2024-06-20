import java.util.concurrent.atomic.DoubleAdder;
public class Main {
    //Quesões de 1 á 2:
    public static void main (String[] args){
        Data dataEntrada1 = new Data(01,01,2023);
        // Questão 6:
        // No print no lugar de data de entrada substitua por ("") para escrever a data de entrada manualmente, o mesmo vale para o print do funcionario2.
        Funcionario funcionario1 = new Funcionario("leonam", "bar", 2000.0, dataEntrada1,"12345678910");
        System.out.println("Salário anual do "+funcionario1.getDepartamento()+": "+ funcionario1.calcularGanhoAnual());
        System.out.println("Salário com aumento podera ser  "+funcionario1.getSalario());
        funcionario1.recerbeAumento(100.0);
        System.out.println("Salário do "+ funcionario1.getDepartamento() +" atual é de "+ funcionario1.getSalario());

    //Questão 3:
        funcionario1.mostra();

    //Questão 4:
        //Nesta questão ele puxa o funcionario 1 criado acima e compara com o funcionario2 criado nesta questão.

        Data dataEntrada2 = new Data(1,1,2023);
        Funcionario funcionario2 = new Funcionario("João ", "vendas", 5000.0,dataEntrada2, "123456789");

        System.out.println("Comparação usando ==: " + (funcionario1 == funcionario2)); // Resultado será falso

        Funcionario referenciaFuncionario2 = funcionario2; // Criando outra referência para funcionario2

        System.out.println("Comparação usando == após criar nova referência: " + (funcionario2 == referenciaFuncionario2)); // Resultado será Verdadeiro

        System.out.printf("Data formatada: "+ dataEntrada1.formatarData());
    }
}

