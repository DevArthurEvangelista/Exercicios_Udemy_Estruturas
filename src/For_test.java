import java.util.Scanner;

public class For_test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int n = input.nextInt();
        for (int i =0; i<n; i++){
            double a = input.nextDouble();
            double b = input.nextDouble();
            if(a != 0 && b != 0){
                Double soma = a/b;
                System.out.printf("%.1f",soma);
            } else if (b == 0 ) {
                System.out.println("Divisão invalida");
            } else if (a == 0) {
                Double soma = a/b;
                System.out.printf("%.1f",soma);
            }
        }

    }
}

