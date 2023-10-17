import java.util.Scanner;

public class Exerciciowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidade = 0;
        int alcool= 0;
        int gasolina = 0;
        int diesel = 0;

        while(quantidade!= 4){
            quantidade = input.nextInt();

            if (quantidade == 1){
                ++alcool;
            } else if (quantidade == 2) {
                ++gasolina;
            } else if (quantidade ==3) {
                ++diesel;
            } else if (quantidade == 4) {
                break;

            }
        }
        System.out.printf("""
                MUITO OBRIGADO
                Alcool: %d
                Gasolina: %d
                Diesel: %d
                """,alcool,gasolina,diesel);


    }
}
