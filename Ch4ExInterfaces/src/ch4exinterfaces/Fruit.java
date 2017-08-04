/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch4exinterfaces;

/**
 *
 * @author instructor
 */
public class Fruit implements Comparable<Fruit>
{
    String name;
    String color;
    double weight;
    int popularity;

    public Fruit(String name, String color, double weight, int popularity) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.popularity = popularity;
    }
    
    public int compareTo(Fruit aFruit)
    {
        Fruit otherFruit = aFruit;
       // return name.compareTo(otherFruit.name);
        if (popularity > otherFruit.popularity)
            return 1;
        else if (popularity < otherFruit.popularity)
            return -1;
        else
            return 0;
        
    }
    
    public String toString()
    {
        return name;
    }
    
}
