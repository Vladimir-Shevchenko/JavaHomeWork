package com.pb.shevchenko.hw6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class VetСlinic {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Animal[] animals = {new Cat(), new Dog(), new Horse()};


        Constructor<Veterinarian > constructor = Veterinarian .class.getConstructor();
        Veterinarian  vet = constructor.newInstance();

        for (Animal a:animals) {
         vet.treatAnimal(a);
        }

    }
}
