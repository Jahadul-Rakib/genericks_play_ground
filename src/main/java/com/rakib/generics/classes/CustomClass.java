package com.rakib.generics.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomClass<K,V> {
    private K k;
    private V v;
}
