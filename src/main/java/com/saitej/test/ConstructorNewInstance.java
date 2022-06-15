package com.saitej.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorNewInstance {
      String name;
    public ConstructorNewInstance() {
        name = "Java";
    }
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Constructor<ConstructorNewInstance> constructor = ConstructorNewInstance.class.getConstructor();
        ConstructorNewInstance newInstance = constructor.newInstance();
        System.out.println(newInstance.name);

    }
}
