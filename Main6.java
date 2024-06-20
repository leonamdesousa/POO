public class Main6 {
    public static void main (String[]args){
        for (int n = 1; n <= 20 ; n++) {// fiz um laço  para fatorial de 1 á 10
            long fatorial = 1;
            for (int i = 1; i <= n; i++) {// fiz um laço para fatorial
                fatorial *= i;
            }
            System.out.println("Fatorial de " + n + " é " + fatorial);
        }
    }
}// quando troca o int pelo long depois que passa do valor de 30 alguns dos resultados se tornam negativos.