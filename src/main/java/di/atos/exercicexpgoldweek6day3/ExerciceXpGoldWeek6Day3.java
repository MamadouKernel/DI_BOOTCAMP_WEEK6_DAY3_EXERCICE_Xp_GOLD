/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package di.atos.exercicexpgoldweek6day3;

import java.util.Scanner;

/**
 *
 * @author KONATE-MK
 */
public class ExerciceXpGoldWeek6Day3 {

    public static void main(String[] args) {
        System.out.println("======= Exercice 1 ====== ");
        
        System.out.println("entrer un nombre : ");
        Scanner sc = new Scanner(System.in);
        int userEntry = sc.nextInt();
        
        int nbre1 = 0;
        int nbre2 = 1;
        int fib;
        System.out.println(nbre1);
        System.out.println(nbre2);
        for(int i = 1; i < userEntry; i++) {
            fib = nbre1 + nbre2;
            nbre1 = nbre2;
            nbre2 = i;
            System.out.println(fib);
        }
        
        System.out.println("======== Exercice 2 =======");
        
        double log = 1;
        
        System.out.println("nbre log :");
        int logNumber = sc.nextInt();
        
        double i = 1;
        
        while(i < logNumber) {
            if(i % 2 == 0) {
                log = log - (1/i);
            }else {
                log = log + (1/i);
            }
            i++;
        }
        
        System.out.println("le logarithme de " + userEntry + " est : " + log);
        
        
        System.out.println("========= Exercice 3 ========");
        
        System.out.println("vous allez entrer un suite de nombre selon votre choix, si vous en avez marre appuyer sur entrer");
        int userNbre = sc.nextInt();
        int nbrePos = 0;
        int nbreNeg = 0;
        int nbreZero = 0;
        
        while(String.valueOf(userNbre).length() != 0) {
            if(userNbre > 0) {
                nbrePos++;
            } else if(userNbre < 0) {
                nbreNeg++;
            }else {
                nbreZero++;
            }
            System.out.println("saisissez un nombre : ");
            userNbre = sc.nextInt();
        }
        System.out.println("le nombre de nombre positive est : " + nbrePos + 
                "le nombre de nombre négative est : " + nbreNeg +
                "le nombre de zero rentré est : " + nbreZero);
        
    }
}






/**
 *
 * @author KONATE-MK
 */