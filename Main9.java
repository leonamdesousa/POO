public class Main9 {
    public static void main(String[] args) {
        int linhas = 50;

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();  // Pula para a próxima linha
            }
        }
    }