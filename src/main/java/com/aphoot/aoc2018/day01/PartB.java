package com.aphoot.aoc2018.day01;

import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PartB {
    public static void main(String[] args) throws Exception{
        Integer duplicatedResult = null;
        Integer accumulator = 0;
        Set<Integer> resultSet = new HashSet<>();
        while(duplicatedResult == null){
            Iterator<Integer> itr = java.nio.file.Files.lines(Paths.get("src/main/resources/day01.txt"))
                    .map(Integer::parseInt)
                    .iterator();
            while(itr.hasNext()){
                accumulator += itr.next();
                if (resultSet.contains(accumulator)){
                    duplicatedResult = accumulator;
                    break;
                } else {
                    resultSet.add(accumulator);
                }
            }
        }

        System.out.println(duplicatedResult);


    }
}
