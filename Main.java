import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String resp;
        boolean respB = true;
        int a;

            float media=0;
                Scanner leia = new Scanner(System.in);
                System.out.println("Deseja iniciar o programa? (S/N)");
                resp = leia.nextLine();



                while(respB) {

                    String sResp = resp.toUpperCase();

                    int c, c2, contadorMenor = 0;

                    if (sResp.equals("S") || sResp.equals("SIM")) {
                        System.out.println("Coloque quantos numeros deseja inserir: ");
                        a = leia.nextInt();

                        int[] num =  new int[a];

                        for (int i = 0; i < num.length; i++) {
                            System.out.println("adicione um numero: ");
                            num[i] = leia.nextInt();
                            media = media + num[i];
                            if(num[i] < 6){
                                contadorMenor++;
                            }
                        }
                        c2 = 0;
                        c = 1;
                        for ( int i=0; i<a; i++) {
                            System.out.println("Este é seu numero de posição " + c + ":  " + num[i]);
                            c++;
                            c2++;
                        }
                        for ( int i=0; i<a; i++) {
                            System.out.println("Esta é sua lista invertida: " + num[num.length-1-i]);
                        }
                    } else if (sResp.equals("NÃO") || sResp.equals("N")) {
                        respB = false;
                        System.out.println("Programa encerrado.");
                        break;
                    } else {
                        System.out.println("Valor invalido! tente novamente iniciando o programa.");
                        break;
                    }

                    media = media / c2;
                    System.out.println("Sua média é de {"+media+"}");
                    System.out.println("E {"+contadorMenor+"} numeros são menores que 5");

                    System.out.println("Deseja continuar ainda? ");
                    resp = leia.nextLine();
                }
                leia.close();
        }
}



