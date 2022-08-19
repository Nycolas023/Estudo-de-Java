import java.util.Scanner;
public class teste {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        float a = 0, b = 0, c = 0, med = 0;
        float[] arr = new float[3];

        for (int i = 0; i < 3; i++){
            System.out.print("Escreva sua "+(i+1)+"º nota: ");
            arr[i] = leia.nextInt();
            med = (arr[0]+arr[1]+arr[2])/3;
        }
        System.out.println("\nA sua med é: "+med);

        /*Scanner leia = new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        a = leia.nextInt();
        System.out.println("Digite sua segundo nota: ");
        b = leia.nextInt();
        System.out.println("Digite sua terceiro nota: ");
        c = leia.nextInt();

        med = (a+b+c)/3;

        System.out.println("--------------------------------");
        System.out.println("A soma dos quatro numeros é: "+med);
        System.out.println("--------------------------------");*/

        leia.close();
    }
}