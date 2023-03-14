package exc2;

import java.util.Scanner;
/**
 *
 * @author penel
 */
public class Main {

    public static void main(String[] args) {
        
        //2) Escreva um programa que carregue dois valores A e B pelo teclado e imprima todos os números ímpares entre A e B.

        Scanner leitura = new Scanner(System.in);
        
        int a, b;
        
        System.out.println("Informe dois numeros para imprimir os ímpares entre eles");
        
        System.out.println("Insira o primeiro número: ");
        a = leitura.nextInt();
        
        System.out.println("Insira o segundo número: ");
        b = leitura.nextInt();
        
        for(int i = a; i <= b; i++){
            if(i % 2 != 0){
                System.out.println(i);
            
            }
        
        }
        
    }
    
}