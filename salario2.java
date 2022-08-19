import java.util.Scanner;

public class salario2 {
    public static void main(String[] args) {
        double salario,salarioBase, grat = 50, impos = 0.10;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite seu salário base: ");
        salarioBase = leia.nextDouble();

        salario = salarioBase+grat;
        salario = salario-(salario*impos);

        System.out.print("Seu salário atual é de: R$"+salario);

        leia.close();
    }
}
