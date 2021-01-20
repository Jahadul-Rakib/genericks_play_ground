
package com.rakib.generics.interfaces;

public interface GenericInterface<K, V, T> {
    void setUpCalculatedValue(K k, V v);
    Integer totalCountedValue(T t);
}
