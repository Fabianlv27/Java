/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ceiling;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author CEEP
 */
public class Ceiling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               TreeSet<Integer> numbers=new TreeSet<>();
        numbers.add(6);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(9);
        Iterator<Integer> iterator = numbers.iterator();
         while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println("Número: " + number);
        }

        System.out.println("First: "+ numbers.first());
        System.out.println("Last: "+ numbers.last());
        System.out.println("Floor (3): "+ numbers.floor(3));
        System.out.println("Ceiling (3): "+ numbers.ceiling(3));
        System.out.println("Higher (3): "+ numbers.higher(3));
        System.out.println("lower (3): "+ numbers.lower(3));
        System.out.println("PollFirst: "+ numbers.pollFirst());
        System.out.println("PollLast: "+ numbers.pollLast());
        System.out.println("HeadSet: "+ numbers.headSet(3));
        System.out.println("TailSet: "+ numbers.tailSet(3));
        Iterator<Integer> des = numbers.descendingIterator();

        while (des.hasNext()) {
            System.out.println("Numero: " + des.next());
            
        }
        for (Integer n : numbers) {
            System.out.print("\t"+ n);
        }
    }
    
}
