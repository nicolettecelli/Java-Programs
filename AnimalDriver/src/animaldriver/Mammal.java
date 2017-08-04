/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaldriver;

/**
 *
 * @author Adam
 */
abstract class Mammal extends Animal //oh look at that mammal! 
{
    int limbs;
    
    public Mammal(String cry, int age, int lifespan, boolean gender, int limbs) {
        super(cry, age, lifespan, gender);
        this.limbs = limbs;
        
    }
    
    
    
    
    
}
