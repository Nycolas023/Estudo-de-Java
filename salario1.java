import java.util.Scanner;

public class salario1 {
    public static void main(String[] args) {
        double salario,salarioBase, grat = 0.05, impos = 0.07;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite seu salário base: ");
        salarioBase = leia.nextDouble();

        salario = salarioBase+(salarioBase*grat);
        salario = salario-(salario*impos);
        System.out.print("Seu novo salario é de: R$"+salario);

        leia.close();
    }
}
