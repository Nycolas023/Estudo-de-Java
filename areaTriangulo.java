import java.util.Scanner;

public class areaTriangulo {
    public static void main(String[] args) {
        double b, a, area;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a altura do seu triângulo: ");
        a = leia.nextDouble();

        System.out.print("Digite a base do seu triângulo: ");
        b = leia.nextDouble();

        area = (b*a)/2;
        System.out.print("A área do seu triângulo é: "+area);

        leia.close();
    }
}
