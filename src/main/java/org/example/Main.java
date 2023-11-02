package org.example;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("wuffi", 5);
        Dog dog2 = new Dog("waldi", 7);

        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println(Dog.CARNIVORE);
        System.out.println(Dog.calculateNextAge(9));

    }
}