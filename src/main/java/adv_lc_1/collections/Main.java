package adv_lc_1.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Queue<String> q = new PriorityQueue<>();
        Map<String, String> map = new HashMap<>();

        list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        Arrays.binarySearch(arr, 5);
        int position = Collections.binarySearch(list, 8);
        if(position < 0){
            System.out.println("Element not found");
        }

        Collections.shuffle(list);
        Collections.sort(list);


    }
}
