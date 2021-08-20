package com.test2.singletonimpl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonReflection {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getSingletonObject();
        try {
            Class<?> clazz = Class.forName("com.test2.singletonimpl.Singleton");
            Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
            declaredConstructors[0].setAccessible(true);
            //creating second instance of singleton using reflection...
            //This breaks the singleton rule
            Singleton singleton2 = (Singleton) declaredConstructors[0].newInstance();
            //Both hashcodes are different 
            System.out.println(singleton1.hashCode() + " " + singleton2.hashCode());

 

        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}