package com.saitej.practise.privateconstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestPrivateConstructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Class.forName("com.saitej.practise.privateconstructor.PrivateConstructor");
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        constructor.newInstance();

    }
}
