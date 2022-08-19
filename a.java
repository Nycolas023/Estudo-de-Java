import java.util.Scanner;
import java.text.DecimalFormat;

public class a {
        public static void main(String[] args) {

            Scanner leia = new Scanner(System.in);
            float a = 0, b = 0, c = 0;
            float p1 = 0, p2 = 0, p3 = 0, pt = 0;
            float med = 0;

            System.out.print("Digite sua primeira nota: ");
            a = leia.nextFloat();
            System.out.print("Digite seu primeiro peso: ");
            p1 = leia.nextFloat();

            System.out.print("Digite sua segunda nota: ");
            b = leia.nextFloat();
            System.out.print("Digite seu primeiro peso: ");
            p2 = leia.nextFloat();

            System.out.print("Digite sua terceira nota: ");
            c = leia.nextFloat();
            System.out.print("Digite seu primeiro peso: ");
            p3 = leia.nextFloat();

            pt = p1+p2+p3;
            med = (a+b+c)/pt;

            DecimalFormat frmt = new DecimalFormat();
            frmt.setMaximumFractionDigits(1);

            System.out.printf("\nA sua med é: "+frmt.format(med));

            leia.close();
        }
}
