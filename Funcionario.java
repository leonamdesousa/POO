public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;

    //Esse comentário abaixo é para a dataEntrada da questão 1 e 2;
    //private String dataEntrada;
    //Esse private Data é da questão 6;
    private Data dataEntrada;
    private String rg;

    public Funcionario(String nome,String departamento, double salario, Data dataEntrada,String rg){
    this.nome = nome;
    this.departamento = departamento;
    this.salario = salario;
    this.dataEntrada = dataEntrada;
    this.rg = rg;
    }

    // Calcular o aumento
    public void recerbeAumento(double aumento){
        salario += aumento;
    }

    // Calcular o ganho Anual sem o aumento
    public double calcularGanhoAnual() {
        return salario * 12;
    }
    // Getters e setters (opcional, dependendo das necessidades )
    public String getDepartamento() {
        return departamento;
    }
    public double getSalario() {
        return salario;
    }
    // Esse public é referente a questão 1 á 5;
    // public Sting dataEntrada() {
    //  return dataEntrada;
    //  }
    //Esse private Data é da ques~;tão 6;
    public Data getdataEntrada(){
        return dataEntrada;
    }
    public String getRg() {
        return rg;
    }
    public void setSalario(double salario) {
        this.salario = salario;
        }
    public void mostra() {
        System.out.println("Nome: "+this.nome+" Departamento: "+this.departamento+" Salário: "+this.salario+" Data de entrada: "+this.dataEntrada.getDia()+"/"+this.dataEntrada.getMes()+"/"+this.dataEntrada.getAno()+
                //Esse this.dataEntrada é da questão 1 e 2;
                //this.dataEntrada
                " RG: "+this.rg);
    }

}

