package com.pb.shevchenko.hw6;

import java.util.Objects;

public class Dog extends Animal {

    String name;
   String food = "cats";

   String location = "garden";

    public void makeNoise(){
        System.out.println("Woof");
    }
    public void eat(){
        System.out.println("Dog eats");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
