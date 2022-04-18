/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppRacional;


import java.util.Scanner;


/**
 *
 * @author mpeht
 */
public class AppRacional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
         System.out.println("Forneça o primeiro número racional");

        System.out.print("Valor do numerador: ");
        int numerador = sc.nextInt();
        System.out.print("Valor do denominador: ");
        int denominador = sc.nextInt();

    Racional AppRacional = new Racional(numerador, denominador);

    System.out.println("Forneça o segundo número racional");
    System.out.print("Valor do numerador: ");
    numerador = sc.nextInt();
    System.out.print("Valor do denominador: ");
    denominador = sc.nextInt();

    Racional racional2 = new Racional(numerador, denominador);
    sc.close();

    Racional racional3 = AppRacional.adicao(racional2);

    Racional racional4 = AppRacional.subtracao(racional2);

    Racional racional5 = AppRacional.multiplicacao(racional2);

    Racional racional6 = AppRacional.divisao(racional2);

    System.out.print(AppRacional + " + " + racional2 + " = ");
    System.out.println(racional3 + " (" + racional3.Formatar(4) + ")");

    System.out.print(AppRacional + " - " + racional2 + " = ");
    System.out.println(racional4 + " (" + racional4.Formatar(4) + ")");

    System.out.print(AppRacional + " * " + racional2 + " = ");
    System.out.println(racional5 + " (" + racional5.Formatar(4) + ")");

    System.out.print(AppRacional + " / " + racional2 + " = ");
    System.out.println(racional6 + " (" + racional6.Formatar(4) + ")");
  }
}