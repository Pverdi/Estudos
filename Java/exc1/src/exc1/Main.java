package exc1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        
        double resultado;
        Ponto a = new Ponto();
        Ponto b = new Ponto();
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Para calcular a distância entre dois pontos no plano cartesiano");
        
        System.out.print("Insira o x de A: ");
        a.setX(ler.nextDouble());
        System.out.print("Insira o y de A: ");
        a.setY(ler.nextDouble());
        
        System.out.print("Insira o x de B: ");
        b.setX(ler.nextDouble());
        System.out.print("Insira o y de B: ");
        b.setY(ler.nextDouble());
        
 
        
        resultado = calculaDistancia(a.x, b.x, a.y, b.y);
        System.out.println("Resultado");
        System.out.printf("%.4f%n", resultado);
    }
    
    public static double calculaDistancia(double xa, double xb, double ya, double yb){
            return Math.sqrt(Math.pow(xb - xa,2) + Math.pow(yb - ya, 2));
    } 

    }


