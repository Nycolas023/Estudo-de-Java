import java.util.Scanner;

public class depositoTriangulo {
    public static void main(String[] args) {
        double deposito, redimento, taxJuro;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o quanto depositou na conta: ");
        deposito = leia.nextDouble();

        System.out.print("Digite o quanto foi o rendimento na conta(em porcentagem): ");
        redimento = leia.nextDouble();

        System.out.print("Digite o quanto teve de taxa de juros na conta (em porcentagem): ");
        taxJuro = leia.nextDouble();


        deposito = deposito + (deposito * (redimento/100));
        double depositoAtual = deposito - (deposito * (taxJuro/100));

        System.out.print("seu deposito com o rendimento inicial: "+deposito+" seu deposito com a taxa de juros atual: "+depositoAtual);

        double area = (deposito*depositoAtual)/2;
        System.out.print("\nE a área do triângulo, usando como base o deposito e a altura como deposito atual é de: "+area);

        leia.close();
    }
}
