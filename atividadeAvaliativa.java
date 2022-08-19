package com.company;
import java.util.Scanner;

public class Main {
    String resp;
    boolean respB;
    int a;
    int[] num = new int[10];
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Deseja iniciar o programa? (S/N)");
            while(true) {
                try {
                    resp = leia.nextLine();
                    if (resp == "S" || resp == "sim" || resp == "s") {
                        respB = true;
                        break;
                    } else if (resp == "não" || resp == "N" || resp == "n"){
                        respB = false;
                        break;
                        System.out.println("fim programa");
                    }
                } catch (Exception ex) {
                    System.out.println("Valor invalido. Tente novamente");
                }
            }
        }
    }
}