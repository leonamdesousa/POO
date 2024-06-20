public class Main5 {
        public static void main(String[] args) {
            for (int n = 1; n <= 10; n++) {// fiz um laço  para fatorial de 1 á 10
                int fatorial = 1;
                for (int i = 1; i <= n; i++) {// fiz um laço para fatorial
                    fatorial *= i;
                }
                System.out.println("Fatorial de " + n + " é " + fatorial);
            }
        }
    }


