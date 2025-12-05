public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();

        a.speak();
        d.speak();
        c.speak();
    }
}

class Animal {
    public void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Cat meows");
    }
}
