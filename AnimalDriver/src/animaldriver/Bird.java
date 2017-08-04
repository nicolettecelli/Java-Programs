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
abstract class Bird extends Animal{
    double wingspan;
    boolean canFly;

    public Bird(String cry, int age, int lifespan, boolean gender, double wingspan, boolean canFly) {
        super(cry, age, lifespan, gender);
        this.wingspan = wingspan;
        this.canFly = canFly;
    }
    
    
    
    
    
}
