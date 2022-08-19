import java.util.Scanner;

public class somaTres {
    public static void main(String[] args) {
        int soma, i, a = 3;
        int[] num = new int[a];
        Scanner leia = new Scanner(System.in);

        for(i = 0; i < num.length; i++){
            System.out.print("Digite o número da "+(i+1)+"º posição: ");
            num[i] = leia.nextInt();
        }

        soma = num[0] + num[1] + num[2];
        System.out.print("Sua soma de 3 números é de: "+soma);

        leia.close();
    }
}
