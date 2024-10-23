package org.example.lambda_streams.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        /* I have an array of some numbers.
        I want to do some operations like this:
        1. Remove all the odd numbers -> O(N) Done
        2. Square the remaining numbers -> O(N) Done
        3. Sort the array -> O(NlogN)
        4. Remove duplicates -> O(N) Done
        5. Print the final values -> O(N)
         */

        List<Integer> li = Arrays.asList(234,356,231,456,986809,546,34,23,1,12,986809,546,34,23);

        HashSet<Integer> hs = new HashSet<>(li);

        List<Integer> li1 = new ArrayList<>(hs);

        List<Integer> ms = new ArrayList<>();
        for(int i=0; i<li1.size(); i++){
            int num = li1.get(i);
            if(num % 2 == 0){
                ms.add(num*num);
            }
        }

        Collections.sort(ms);

        for(int num: ms){
            System.out.println(num);
        }


        li.stream()
                .filter(n -> n%2==0)
                .map(n -> n*n)
                .distinct()
                .sorted()
                .forEach(n -> System.out.println(n));

        //Filter -> removing/filtering some element

        // Given a list of strings, print all the strings that start with letter "B"
        // and print them at the end

        List<String> strings = Arrays.asList("ABC", "BAC", "XYZ");
        Stream<String> stream = strings.stream();
        stream.filter(s -> s.startsWith("B"))
                .forEach(s -> System.out.println(s));

        // Map can be used in 2 ways:
        // 1. Change the data
        // 2. Change the data type

        // Given a list of strings, figure out the length of
        // the strings and print the even ones

        System.out.println("**************");
        List<String> strings1 = Arrays.asList("ABCD", "BACWE", "AYZWER");
        strings1.stream()
                .map(s -> s.length())
                .filter(n -> n%2 == 0)
                .forEach(n -> System.out.println(n));


        // How many strings start with A?
        long count =  strings1.stream()
                .filter(s -> s.startsWith("A"))
                .count();
        System.out.println("*********************");
        System.out.println(count);

        // Given a list of strings, figure out their lengths and
        // return a list of the lengths

        List<Integer> collect = strings1.parallelStream()
                .map(s -> s.length())
                .collect(Collectors.toList());
    }
}
