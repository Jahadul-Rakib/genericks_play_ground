package com.rakib.generics.classes;

import lombok.Data;

import java.util.List;

@Data
public class CustomList<T> {
    private List<T> list;
}
