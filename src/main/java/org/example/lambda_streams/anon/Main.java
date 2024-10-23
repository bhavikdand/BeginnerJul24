package org.example.lambda_streams.anon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,8,6,7,4,3,5,6,7,9,0);

        Comparator<Integer> ci = new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        };
    }
}
