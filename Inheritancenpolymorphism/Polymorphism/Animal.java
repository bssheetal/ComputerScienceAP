package Inheritancenpolymorphism.Polymorphism;

public class Animal {
     public void animalSound() {
        System.out.println("The animal makes a sound");
      }

      public void giveshot(Animal a)
      {
        a.animalSound();
      }
    }
    
    class Pig extends Animal {
      @Override
      public void animalSound() {
        System.out.println("The pig says: wee wee");
      }
    }
    
     class Dog extends Animal {
      @Override
      public void animalSound() {
        System.out.println("The dog says: bow wow");
      }

} 
