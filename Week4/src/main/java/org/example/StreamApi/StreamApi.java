package org.example.StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,2,3,9,8,7,4,5,6,1,22,31,94,86,7,4,52,6,9,8,7,46,52,6,1,2,3,9,8);

        List<Integer> list=integers.stream()
                .filter(x -> x%2==0)
                .map(x->x*2)
                .sorted()
                .skip(2)
                .distinct()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(list);

        System.out.println(
                list.stream().reduce(0,(x,y)->x+y));
        System.out.println("count : "+ integers.stream()
                .filter(x->x%2==0)
                .count());

        System.out.println("max : "+ integers.stream()
                .filter(x->x%2==0)
                .max(Comparator.naturalOrder()));

        System.out.println("min : "+ integers.stream()
                .filter(x->x%2==0)
                .min(Comparator.naturalOrder()));

//        System.out.println(
//                integers.stream()
//                        .map(x->String.valueOf(x))
//                        .reduce("",(result,i)->result.concat(i)));

        String str=integers.stream()
                .map(String::valueOf)
                .reduce("", String::concat);
        System.out.println(str);

        integers.stream()
                .filter(x->x%2==1)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }
}

















