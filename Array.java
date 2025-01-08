package class1;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Array{
    
        @SuppressWarnings("unchecked")
        public static void main(String[] args) {
            
            ArrayList list1 = new ArrayList();   // list1 is reference variable that is pointing to the ArrayList
            list1 = new ArrayList();             // here the list1 is now refereing to the new ArrayList()
            list1.add(10);
            list1.add(25.5);
            list1.add("JAva");
            list1.add(true);
    
    
            System.out.println(list1);
            System.out.println(list1.size());
            
    
    
            // Generic list 
    
            ArrayList <String> list2 = new ArrayList<>(List.of("Apple", "Banana", "Grapes"));
            System.out.println(list2);
    
    
            for (String str : list2) {
                System.out.println(str);
            }
    
    
            
            list2.forEach(e->{
                System.out.println(e+"e");
            });

            list2.forEach(System.out::println);

            list2.sort(null);



    }
}

