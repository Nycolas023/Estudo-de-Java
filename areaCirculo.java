import java.util.Scanner;

public class areaCirculo {
    public static void main(String[] args) {
        double area, raio;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o raio do seu circulo: ");
        raio = leia.nextDouble();

        area = 3.1415 * (raio*raio);

        System.out.println("A área do seu circulo é: "+area);

        leia.close();
    }
}
