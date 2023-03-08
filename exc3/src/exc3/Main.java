
package exc3;

import java.util.Scanner;
/**
 *
 * @author penel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       // 3) Crie um programa para ler os 3 lados de um triângulo, ao final imprima sua área, seu 
       //    perímetro e o tipo de triângulo. Isósceles, Escaleno ou Equilátero
       
       Scanner leitura = new Scanner(System.in);
       
       double lado1, lado2, lado3, area, peri;
       
        System.out.println("Para calcular a área do triangulo, seu perimetro e qual seu tipo");
        System.out.println("Insira o primeiro lado");
        lado1 = leitura.nextDouble();
        
        System.out.println("Insira o segundo lado");
        lado2 = leitura.nextDouble();
        
        System.out.println("Insira o terceiro lado");
        lado3 = leitura.nextDouble();
        
        if(lado1 == lado2 && lado2 == lado3 && lado3 == lado1){
            System.out.print("Triângulo equilátero!");
            area = (Math.pow(lado1,2)* Math.sqrt(3)) / 4;
            peri = lado1 * 3;
            System.out.printf("Area: %f", area);
            System.out.printf("Perímetro: %f", peri);
        }
        if(lado1 != lado2 && lado2 != lado3 && lado3 != lado1){
            
            System.out.print("Triângulo ecaleno!\n");
            peri = lado1 + lado2 + lado3;
            area = Math.sqrt((peri/2)*(((peri/2) - lado1)*((peri/2) - lado2)*((peri/2) - lado3)));
            System.out.printf("Area: %f\n", area);
            System.out.printf("Perímetro: %f", peri);
        }
        
    }
    
}
