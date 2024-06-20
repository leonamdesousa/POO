public class Main7 {
    public static void main(String[] args) {
        int n = 13; // Número de termos da sequência a serem calculados
        int a = 0;
        int b = 1;

        System.out.println("Os primeiros"+ n +"termos de sequência de Fibonacci são:");

        for( int i = 0; i < n; i++){
            System.out.println(a+" " );
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }
}
