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

//we need an interface for "alive" because not only animals have lifespans
abstract class Animal implements isAlive {
   private String cry;
   private  int age;
   private int lifespan;
   private boolean gender;

    public Animal(String cry, int age, int lifespan, boolean gender) {
        this.cry = cry;
        this.age = age;
        this.lifespan = lifespan;
        this.gender = gender;
    }

   public void ageYear(){
       this.age++;
   }
    
    public boolean isAlive(){
       return age>= lifespan;
   }
   
   
    /**
     * @return the cry
     */
    public String getCry() {
        return cry;
    }

    /**
     * @param cry the cry to set
     */
    public void setCry(String cry) {
        this.cry = cry;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the lifespan
     */
    public int getLifespan() {
        return lifespan;
    }

    /**
     * @param lifespan the lifespan to set
     */
    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    /**
     * @return the gender
     */
    public boolean isGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(boolean gender) {
        this.gender = gender;
    }
   
   






}
