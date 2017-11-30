/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author JOSE JAVIER
 */
public class LadosDelTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int desigual = 0, lado1, lado2, lado3;
    Scanner ingreso = new Scanner(System.in);

    System.out.println("Desigualdad Triangular");
    System.out.print("Ingresa el lado 1: ");
    lado1 = ingreso.nextInt();
   
    System.out.print("Ingresa el lado 2: ");
    lado2 = ingreso.nextInt();
   
    System.out.print("Ingresa el lado 3: ");
    lado3 = ingreso.nextInt();
   
    if((lado1 + lado2) < lado3){
      desigual++;
    }
    if((lado1 + lado3) < lado2){
      desigual++;
    }
    if((lado2 + lado3) < lado1){
      desigual++;
    }
    if (desigual > 0){
      System.out.println("No es un triangulo valido");
    }
    else{
      tipo(lado1,lado2,lado3);
    }
   
    }
 
  public static void tipo(int lado1, int lado2, int lado3){
    if(lado1 == lado2 && lado1 == lado3){
      System.out.println("Es equilatero");
    }
    if(lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado1 != lado2 || lado2 == lado3 && lado2 != lado1){
      System.out.println("Es isosceles");
    }
    if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
      System.out.println("Es escaleno");
    }
     
  }
}
