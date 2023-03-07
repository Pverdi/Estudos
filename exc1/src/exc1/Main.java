package exc1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        
        double xA, yA, xB, yB, distancia;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Para calcular a distância entre dois pontos no plano cartesiano");
        
        System.out.print("Insira o x de A: ");
        xA = ler.nextDouble();
        System.out.print("Insira o y de A: ");
        yA = ler.nextDouble();
        
        System.out.print("Insira o x de B: ");
        xB = ler.nextDouble();
        System.out.print("Insira o y de B: ");
        yB = ler.nextDouble();
        
        distancia =  Math.sqrt(Math.pow(xB - xA,2) + Math.pow(yB - yA, 2));
        
        System.out.println("Resultado");
        System.out.printf("%.4f%n", distancia);
    }
}