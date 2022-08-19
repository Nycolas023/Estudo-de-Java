import java.util.Scanner;

public class ih {
    public static void main(String[] args) {
        String resp;

        Scanner input = new Scanner(System.in);

        System.out.println("Mostra seu anel ai pra ele, Marcos.");
        resp = input.next();
        resp = resp.toUpperCase();

        if (resp.equals("SIM")){
            System.out.print("iiiiiiiiiiiiiiiiih!!!!!!!!!!!!!!!");
        }

        else if (!resp.equals("SIM")){
            System.out.print("ufa");
        }
        input.close();
    }
}
