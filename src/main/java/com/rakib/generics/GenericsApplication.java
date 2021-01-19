package com.rakib.generics;

import com.rakib.generics.classes.CustomClass;
import com.rakib.generics.classes.CustomList;
import lombok.val;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

@SpringBootApplication
public class GenericsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenericsApplication.class, args);

        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");
        stringList.add("F");
        stringList.add("G");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(23);
        integerList.add(24);
        integerList.add(21);
        integerList.add(244);
        integerList.add(22);

        CustomList<String> stringCustomList = new CustomList<>();
        stringCustomList.setList(stringList);
        stringCustomList.getList().forEach(System.out::println);

        CustomList<Integer> integerCustomList = new CustomList<>();
        integerCustomList.setList(integerList);
        AtomicReference<Integer> integer = new AtomicReference<>(0);
        for (Integer integers : integerCustomList.getList()) {
            integer.updateAndGet(v -> v + integers);
        }
        System.out.println(integer);


        CustomClass<String, String> customClass = new CustomClass<>("Name", "Rakib");
        System.out.println(customClass);

    }

}
