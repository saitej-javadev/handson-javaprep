package com.saitej.basic;

// new keyword
// new instance method of Class class
//clone() method
//deserialization
//new instance method of Constructor class
public class FiveWaysToCreateObject implements Cloneable {
    String str;

    public FiveWaysToCreateObject() {
       str="Java";
    }


    public static void main(String[] args)  {

        // Using Class class newInstance() method
      /*  try {
            Class<?> clazz  = Class.forName("com.saitej.basic.FiveWaysToCreateObject");
            Object classObj = clazz.newInstance();
            System.out.println(classObj.hashCode());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }*/



       // Using new keyword
        /*FiveWaysToCreateObject newKeywordObj = new FiveWaysToCreateObject();
        System.out.println(newKeywordObj.str);*/



        //Using Constructor class newInstance() method
       /* try {
            Constructor<FiveWaysToCreateObject> constructor = FiveWaysToCreateObject.class.getConstructor();
            FiveWaysToCreateObject constructorObj = constructor.newInstance();
            System.out.println(constructorObj.str);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }*/


       // using clone() method from Object class
      /*  FiveWaysToCreateObject createObject = new FiveWaysToCreateObject();
        Object cloneObj = null;
        try {
            cloneObj = createObject.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(cloneObj.hashCode());*/


    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}



