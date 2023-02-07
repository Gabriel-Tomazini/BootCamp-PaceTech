package BootCampConvesao;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double oleo, balan;
        double total = 0;
        int opMenu;
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        
        do{
        
        System.out.print("\n|-------------------------|\n");
        System.out.print("|1 - Troca de Oleo (R$250)|\n");
        System.out.print("|2 - Balanceamento (R$100)|\n");
        System.out.print("|3 - Total                |\n");
        System.out.print("|4 - sair                 |\n");
        System.out.print("|-------------------------|\n");
        System.out.print("Digite uma op??o: \n");
        opMenu = scan.nextInt();
         
        limpaTela();
         
        switch(opMenu){
             
            case 1:
                 
                System.out.print("Oleo adicionado ao total!\n");
                total = total + 250;
                 
                break;
                 
            case 2:  
                 
                System.out.print("Balanceamento adicionado ao total!\n");
                total = total + 100;
                 
                break;
                 
            case 3:
                 
                System.out.print("Total da sua compra: R$" + total);
                 
                break;
                
            case 4:
                 
                System.out.print("|-----------------------------|\n");
                System.out.print("| Obrigado pela Prefer?ncia <3|\n");
                System.out.print("|-----------------------------|\n");
                System.exit(0);
         }
        
        }while(opMenu != 0);
    }
    
     public static void limpaTela(){
        for (int i = 0; i <= 25; i++) 
        {
            System.out.println("\n");
        }
    }
}