import java.util.Scanner;

public class salarioAumento {
    public static void main(String[] args) {
        double slr, porc;

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        slr = leia.nextFloat();

        System.out.print("Digite a porcentagem do seu aumento: ");
        porc = leia.nextInt();

        porc = porc/100.0;
        double slrAum = porc*slr;
        slrAum = slrAum+slr;

        System.out.println("Seu novo salario é de: "+slrAum);

        leia.close();
    }
}
