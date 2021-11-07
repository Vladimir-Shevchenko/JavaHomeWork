package com.pb.shevchenko.hw6;

import java.util.Objects;

public class Horse extends  Animal{

    String name;
    String food = "grass";
    String location = "field";

    public void makeNoise(){
        System.out.println("Igo go");
    }
    public void eat(){
        System.out.println("Horse eats");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(name, horse.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
