import java.util.Scanner;

class Main4 {
    public static void main(String[] args) {
        int f = 1;

        Scanner input = new Scanner(System.in);
        int qt = input.nextInt();

        for (int i = 1;i <= qt; i++){
            f = f * i;}
        System.out.println(f);
        }
    }

