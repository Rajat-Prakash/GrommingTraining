package org.example.CollectorsExample;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

public class CollectorsExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "too", "bar", "toe","world", "too", "bar");

        // toList
        List<String> list = words.stream()
                .filter(s -> s.length() < 4)
                .collect(Collectors.toList());
        System.out.println(list);

        // toSet
        Set<String> set = words.stream()
                .filter(s -> s.length() < 4)
                .collect(Collectors.toSet());
        System.out.println(set);

        //Map
        Map<String, Long> map=words.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

        Map<String,Integer> diffLength=words.stream()
                .distinct()
                .collect(Collectors.toMap(Function.identity(),s->s.length()));
        System.out.println(diffLength);

        // toCollection
        TreeSet<String> treeSet = words.stream()
                .filter(s -> s.length() < 4)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeSet);

        LinkedList<String> linkedList = words.stream()
                .distinct()
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(linkedList);

        // joining
        String joined = words.stream()
                .filter(s -> s.length() < 4)
                .collect(Collectors.joining(", "));
        System.out.println(joined);

        // counting
        long count = words.stream()
                .filter(s -> s.length() < 4)
                .collect(Collectors.counting());
        System.out.println(count);

        DoubleSummaryStatistics result=words.stream()
                .collect(summarizingDouble(String::length));
        System.out.println("avg. : "+ result.getAverage()
                            + "  Count : "+result.getCount()
                            + "  Max. : "+result.getMax()
                            + "  Min. : "+result.getMin()
                            + "  Sum : "+result.getSum());

        // summingInt
        int sum = words.stream()
                .filter(s -> s.length() < 4)
                .collect(Collectors.summingInt(String::length));
        System.out.println(sum);

        // averagingDouble
        double average = words.stream()
                .filter(s -> s.length() < 4)
                .collect(Collectors.averagingDouble(String::length));
        System.out.println(average);

        // maxBy
        Optional<String> max = words.stream()
                .collect(Collectors.maxBy(String::compareTo));
        System.out.println(max);

        // minBy
        Optional<String> min = words.stream()
                .collect(Collectors.minBy(Comparator.naturalOrder()));
        System.out.println(min);

        // groupingBy
        Map<Integer, List<String>> groups = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groups);

        // partitioningBy
        Map<Boolean, List<String>> partitions = words.stream()
                .collect(Collectors.partitioningBy(s -> s.length() < 4));
        System.out.println(partitions);
    }
}

