package com.aphoot.aoc2018.day01;

import java.nio.file.Paths;
import java.util.Optional;

public class PartA {
    public static void main(String[] args) throws Exception{
        Optional<Integer> optionalSum = java.nio.file.Files.lines(Paths.get("src/main/resources/day01.txt"))
                .map(Integer::parseInt)
                .reduce((x,y)->x+y);

        optionalSum.ifPresent(System.out::println);
    }
}
