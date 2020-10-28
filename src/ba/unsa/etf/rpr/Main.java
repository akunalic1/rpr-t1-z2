package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int broj){
        int suma=0;
        while(broj!=0){
            suma=broj%10+ suma;
            broj=broj/10;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner ulaz=new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        int n=ulaz.nextInt();
        System.out.println("brojevi koji su djeljivi sa sumom svojih cifara su: ");
        for(int i=1; i<n+1; i++){
            if(i%sumaCifara(i)==0) System.out.print(i + " ");
        }
    }
}
