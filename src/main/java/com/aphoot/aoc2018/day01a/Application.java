package com.aphoot.aoc2018.day01a;

import java.nio.file.Paths;
import java.util.Optional;

public class Application {
    public static void main(String[] args) throws Exception{
        Optional<Integer> optionalSum = java.nio.file.Files.lines(Paths.get("src/main/resources/day01a.txt"))
                .map(Integer::parseInt)
                .reduce((x,y)->x+y);

        optionalSum.ifPresent(System.out::println);
    }
}
