package com.rakib.generics.interfaces;



public class GenericImplimentedClass<K, V, T> implements GenericInterface<String, String, Integer> {

    @Override
    public void setUpCalculatedValue(String s, String s2) {
        System.out.println("Printed Value From " + s + " And " + s2);
    }

    @Override
    public Integer totalCountedValue(Integer i) {
        if (i != null){
            return i+i;
        }
        return 0;
    }

}
