import java.util.Scanner;

public class salario20prc {
    public static void main(String[] args) {
        double slr;

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        slr = leia.nextFloat();

        slr = slr+(slr*0.25);

        System.out.print("Seu salario com um aumento é de: "+slr);

        leia.close();
    }
}