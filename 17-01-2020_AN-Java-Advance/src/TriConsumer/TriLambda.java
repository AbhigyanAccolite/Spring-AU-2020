// Java Program to demonstrate 
// BiConsumer's andThen() method 
package TriConsumer;

import java.util.ArrayList; 
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer; 

interface TriConsumer<T, U, V> {
    
    void accept(T t, U u, V v);
    default TriConsumer<T, U, V> andThen(TriConsumer<? super T, ? super U, ? super V> after) {
        Objects.requireNonNull(after);

        return (l, r, s) -> {
            accept(l, r, s);
            after.accept(l, r, s);
        };
    }
  
public class TriLambda{ 
    public static void main(String args[]) 
    { 
  
        // Create first list 
        List<Integer> lista = new ArrayList<Integer>(); 
        lista.add(2); 
        lista.add(1); 
        lista.add(3); 
  
        // Create second list 
        List<Integer> listb = new ArrayList<Integer>(); 
        listb.add(2); 
        listb.add(1); 
        listb.add(2);
        
        List<Integer> listc = new ArrayList<Integer>(); 
        listc.add(2); 
        listc.add(1); 
        listc.add(1); 
  
        // TriConsumer to compare 3 lists of integers 
        TriConsumer<List<Integer>, List<Integer>, List<Integer> > equals = (list1, list2, list3) -> 
        { 
            if (list1.size() != list2.size() && list3.size() != list1.size()) { 
                System.out.println("False"); 
            } 
            else { 
                for (int i = 0; i < list1.size(); i++) {                	
    			if (list1.get(i) != list3.get(i) && list2.get(i) != list3.get(i)) { 
    				System.out.println("False"); 
    				return; 
    			}                	
                }             
            } 
        	System.out.println("True");
        }; 
  
        // BiConsumer to print 2 lists 
        TriConsumer<List<Integer>, List<Integer>, List<Integer> > disp = (list1, list2, list3) -> 
        { 
            list1.stream().forEach(a -> System.out.print(a + " ")); 
            System.out.println(); 
            list2.stream().forEach(a -> System.out.print(a + " ")); 
            System.out.println(); 
            list3.stream().forEach(a -> System.out.print(a + " "));
            System.out.println(); 
        }; 
  
        // Using addThen() method 
        equals.andThen(disp).accept(lista, listb, listc); 
    	} 
	}
}