package com.saitej.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// new keyword
// new instance method of Class class
//clone() method
//deserialization
//new instance method of Constructor class
public class FiveWaysToCreateObject implements Cloneable {
    static String str = "Java";

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        FiveWaysToCreateObject new_keyword = new FiveWaysToCreateObject();
        System.out.println(new_keyword.str);
        System.out.println(new_keyword.hashCode());


        try {
            Class<?> clazz = Class.forName("com.saitej.basic.FiveWaysToCreateObject");
            Object newInstance = clazz.newInstance();
            System.out.println(newInstance.hashCode());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        FiveWaysToCreateObject obj = new FiveWaysToCreateObject();
        Object clone = null;
        try {
            clone = obj.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(clone.hashCode());


        try {
            Constructor<FiveWaysToCreateObject> declaredConstructor = FiveWaysToCreateObject.class.getDeclaredConstructor();
            FiveWaysToCreateObject obj1 = declaredConstructor.newInstance();
            System.out.println(obj1.hashCode());
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }

}

