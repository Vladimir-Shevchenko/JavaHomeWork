package com.pb.shevchenko.hw6;

import java.util.Objects;

public class Cat extends Animal{

    String name;
    String food = "mice";
    String location = "house";

    public void makeNoise(){
        System.out.println("Meow");
    }
    public void eat(){
        System.out.println("Cat eats");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
