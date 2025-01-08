package class1;

import java.util.*;
import java.util.ArrayList;

public class JavaClass2{
    public static void main(String[] args) {

        // filter map reduce
        // 1 2 3 4 5 6 7 8 9 10
        ArrayList<Integer> nums = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10));

        nums.stream()
            .filter(n -> n%2==0)
            .forEach(System.out::println);
        
    }
}