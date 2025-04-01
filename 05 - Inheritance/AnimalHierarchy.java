class Animal {
   void makeSound(){
       System.out.println("Animal is making sound.");
   }
}
class Dog extends Animal{
   @Override
   void makeSound(){
       System.out.println("Dog is barking");
   }
}
class Cat extends Animal{
   @Override
   void makeSound(){
       System.out.println("Cat is meowing");
   }
}
class Bird extends Animal{
   @Override
   void makeSound(){
       System.out.println("Bird is singing");
   }
}
public class AnimalHierarchy {
   public static void main(String[] args){
       Animal animal = new Animal();
       animal.makeSound();
       Dog dog = new Dog();
       dog.makeSound();
       Cat cat = new Cat();
       cat.makeSound();
       Bird bird = new Bird();
       bird.makeSound();
   }
}
