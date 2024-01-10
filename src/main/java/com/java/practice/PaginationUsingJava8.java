package com.java.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Math.min;

public class PaginationUsingJava8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int pageSize = 3;
        Map a = IntStream.range(0, (list.size() + pageSize - 1) / pageSize)
                .boxed()
                .collect(Collectors.toMap(i -> i,
                        i -> list.subList(i * pageSize, min(pageSize * (i + 1), list.size()))));

        System.out.println(a);
    }
}
