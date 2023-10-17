import java.util.Locale;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double n100, n50, n20, n10, n5, n2, n1;
        double r100, r50, r20, r10, r5, r2, r1;
        double valor;
        double n05, r05, n025, r025, n010, r010, n005, r005, n001, r001;
        double moedas;

        valor = sc.nextDouble();

        n100 =(int) (valor / 100);
        r100 = valor % 100;

        if (n100 == 0){
           n50 = (int) valor/50;
           r50 = valor %50;
        } else {
            n50 = (int) r100 / 50;
            r50 = r100 % 50;
        }
        n20 =(int) r50 / 20;
        r20 = r50 % 20;

        n10 =(int) r20 / 10;
        r10 = r20 % 10;

        n5 =(int)  r10 / 5;
        r5 = r10 % 5;

        n2 =(int) r5 / 2;
        r2 = r5 % 2;

        n1 =(int) r2 / 1;
        r1 = r2 % 1;

        n05 =  r1 / 0.50;
        r05 = r1 % 0.50;

        n025 = r05 / 0.25;
        r025 = r05 % 0.25;

        n010 = r025 / 0.10;
        r010 = r025 % 0.10;

        n005 = r010 / 0.05;
        r005 = r010 % 0.05;

        n001 = r005 / 0.01;
        r001 = r005 % 0.01;




        System.out.printf("""
                NOTAS:
                %.0f nota(s) de R$ 100.00
                %.0f nota(s) de R$ 50.00
                %.0f nota(s) de R$ 20.00
                %.0f nota(s) de R$ 10.00
                %.0f nota(s) de R$ 5.00
                %.0f nota(s) de R$ 2.00
                MOEDAS:
                %.0f moeda(s) de R$ 1.00
                %.0f moeda(s) de R$ 0.50
                %.0f moeda(s) de R$ 0.25
                %.0f moeda(s) de R$ 0.10
                %.0f moeda(s) de R$ 0.05
                %.0f moeda(s) de R$ 0.01
                """, n100, n50, n20, n10, n5, n2, n1, n05, n025, n010, n005, n001);


        sc.close();
    }
}