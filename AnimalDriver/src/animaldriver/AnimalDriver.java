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
public class AnimalDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal[] animals = new Animal[15];
        
        for(int i=0; i<15; i++){
            if(i<5)
                animals[i]= new Zebra("Neigh", 0, true );
            
                else if(i<10)
                animals[i]= new Wolf("Howl", 0, true);
            
                else if(i<15)
                        animals[i]= new Pigeon("Squeek", 3,true, 10, true);
            }
        
        for(int i=0;i<15;i+=4){
            animals[i].ageYear();
            if(!animals[i].isAlive())
                animals[i]=null;
        }
        
        for(Animal ani : animals){
            
            if(ani!=null)
            System.out.println(ani.getAge());
            else
                System.out.println("dead");
        }
        
    }
    
}
