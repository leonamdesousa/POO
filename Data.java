public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor da classe Data para inicializar os campos dia, mês e ano
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Getters para obter os valores dos campos dia, mês e ano
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
    public String formatarData(){
        return String.format("%02d/%02d/%04d",dia,mes,ano);
    }
}

