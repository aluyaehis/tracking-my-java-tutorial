public class Animal {
    String name;

    Animal(String name){
        this.name = name;
        System.out.println("Animal constructor called. Name: " + name);
    }

    void makeSound(){
        System.out.println("Animal makes a sound.");
    }
}
