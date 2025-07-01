package principal;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um numero de 0-1000 ");
            int x = sc.nextInt();
            for (int i = 1; i <= x; i++) {
                if(i % 2 != 0){


                System.out.println("Todos os numeros de 1 até :" + x +" "+ i);
                }
            }



    }
}