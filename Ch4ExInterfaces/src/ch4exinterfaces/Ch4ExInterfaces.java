/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch4exinterfaces;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author instructor
 */
public class Ch4ExInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner keyboard = new Scanner(System.in);
       Fruit[] myFruits = new Fruit[12];
       Fruit banana = new Fruit("Banana", "yellow", .5, 6);
       Fruit orange = new Fruit("Orange", "orange", .2, 5);
       Fruit cherry = new Fruit("Cherry", "red", .7, 8);
       Fruit mango = new Fruit("Mango", "orange", .9, 10);
       Fruit dragon_fruit = new Fruit("DF", "white", .5, 7);
       Fruit apple = new Fruit("Apple", "red", .5, 3);
       Fruit kiwi = new Fruit("Kiwi", "green", .2, 8);
       Fruit tomatoe = new Fruit("Tomatoe", "red", .6, 7);
       Fruit olive = new Fruit("Olivea", "green", .5, 2);
       Fruit blueberry = new Fruit("Blueberry", "blue", .8, 9);
       Fruit watermelon = new Fruit("Watermelon", "red", .55, 9);
       Fruit lemon = new Fruit("Lemon", "yellow", .6, 1);
       
       myFruits[0] = banana;
       myFruits[1] = mango;
       myFruits[2] = orange;
       myFruits[3] = cherry;
       myFruits[4] = apple;
       myFruits[5] = tomatoe;
       myFruits[6] = olive;
       myFruits[7] = blueberry;
       myFruits[8] = watermelon;
       myFruits[9] = lemon;
       myFruits[10] = kiwi;
       myFruits[11] = dragon_fruit;
       
       Arrays.sort(myFruits);
       
       for (int i = 0; i < myFruits.length; i++)
       {
           System.out.println(myFruits[i]);
       }
       
       
       Fruit fav1, fav2;
       
       System.out.println("What is your favorite fruit?");
       String strFav1 = keyboard.next();
       System.out.println("What is your friend's favorite fruit?");
       String strFav2 = keyboard.next();
       keyboard.nextLine();
       
       switch (strFav1)
       {
           case "banana":
           case "Banana":
           case "BANANA":
               fav1 = new Fruit("Banana", "yellow", .5, 6);
               break;
           case "orange":
           case "Orange":
           case "ORANGE":
               fav1 = new Fruit("Orange", "orange", .2, 5);
               break;
           case "Cherry":
           case "cherry":
           case "CHERRY":
               fav1 = new Fruit("Cherry", "red", .7, 8);
               break;
           case "Mango":
           case "mango":
           case "MANGO":
                fav1 = new Fruit("Mango", "orange", .9, 10);
                break;
           default:
               fav1 = new Fruit("Dragon Fruit", "white", .5, 9);
                
        }
       
        switch (strFav2)
       {
           case "banana":
           case "Banana":
           case "BANANA":
               fav2 = new Fruit("Banana", "yellow", .5, 6);
               break;
           case "orange":
           case "Orange":
           case "ORANGE":
               fav2 = new Fruit("Orange", "orange", .2, 5);
               break;
           case "Cherry":
           case "cherry":
           case "CHERRY":
               fav2 = new Fruit("Cherry", "red", .7, 8);
               break;
           case "Mango":
           case "mango":
           case "MANGO":
                fav2 = new Fruit("Mango", "orange", .9, 10);
                break;
           default:
               fav2 = new Fruit("Dragon Fruit", "white", .5, 9);
                
        }
       
       if (fav1.compareTo(fav2) == 0)
           System.out.println("You both have same popularity of fruits");
       else if (fav1.compareTo(fav2) > 0)
           System.out.println(fav1 + " has a higher popularity than " + fav2);
       else 
           System.out.println(fav2 + " has a higher popularity than " + fav1);
       
       
       
       
    }
    
}
