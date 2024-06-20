public class Main8 {
    public static void main(String[] args) {
        int x = 13;  // valor teste inicial
        System.out.println("Sequência de Collatz para " + x + ": ");
        while (x != 1) {
            System.out.print(x);
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = 3 * x + 1;
            }

            if (x != 0) {
                System.out.print(" -> ");
            }
        }
        System.out.println(x);// Imprime o último valor (1)
    }
}
