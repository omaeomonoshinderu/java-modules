package _02_Intro_To_Streams;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Java supports an alternate way to modify and operate on Collections,
 * e.g. Arrays, ArrayLists, HashMaps, etc. using the Stream interface.
 * 
 * Using Stream methods allows Java to potentially be more efficient with how
 * the operation is done. Here is an example:
 *   String[] words = {"These", "are", "some", "words!!!"};
 * 
 *   // 1. Using a for loop for iteration
 *   for (String word : words) {
 *       System.out.println(word);
 *   }
 * 
 *   // 2. Using streams for iteration
 *   Arrays.stream(words).forEach( (word) -> System.out.println(word) );
 * 
 * Both approaches print all the words in the string array. The difference is
 * the for loop explicitly tells Java how to iterate through the collection.
 * The stream approach lets Java determine the best way to iterate through the
 * Array and potentially use ways to split up the print tasks to make the
 * procedure faster and more efficient.
 * 
 * Certain stream methods operate on the collection and return a stream with
 * the changes, similar to how string methods return a new string. Here is an
 * example that counts the total number of characters of strings larger than 4:
 *   int totalCharacters = Arrays.stream(words)
 *                          .filter((word) -> word.length() > 4)
 *                          .map((word) -> word.length())
 *                          .reduce(0, (int1, int2) -> int1 + int2);
 * filter() and map() both return a stream so the methods can be called right
 * afterwards. reduce() returns an int  and closes the stream so it must be
 * called at the very end of a series of stream operations.
 * 
 * Below are examples of common stream methods.
 */
public class IntroToStreams {
    
    public static void main(String[] args) {
        class Car {
            String make;
            int mileage;
            
            Car(String make, int mileage){
                this.make = make;
                this.mileage = mileage;
            }
        }
        
        /*
         * How to create streams from different Collections
         */
        String[] strArr = {"one", "two", "three", "four"};
        Stream<String> arrStream = Arrays.stream(strArr);

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(-2);
        intList.add(3);
        Stream<Integer> listStream = intList.stream();

        List<Car> carList = new LinkedList<Car>();
        carList.add(new Car("Honda", 200000));
        carList.add(new Car("Ford", 60000));
        carList.add(new Car("Ferarri", 10000));
        Stream<Car> carListStream = carList.stream();

        ArrayDeque<Double> dQueue = new ArrayDeque<Double>();
        dQueue.add(1.1);
        dQueue.add(-1.1);
        dQueue.add(1295.008126);
        Stream<Double> dQueueStream = dQueue.stream();
        
        /*
         * forEach() - Apply operation to all elements
         */
        System.out.print("Array stream forEach(): ");
        Arrays.stream(strArr).forEach( (word) -> System.out.print(word + " ") );
        
        System.out.print("\nList stream forEach(): ");
        intList.stream().forEach( (i) -> System.out.print(i + " ") );
        
        /*
         * sorted() - Sort elements in natural order
         */
        System.out.println();
        System.out.print("\nArray stream sorted(): ");
        Arrays.stream(strArr).sorted().forEach((word) -> System.out.print(word + " "));
        
        System.out.print("\nList stream sorted(): ");
        intList.stream().sorted().forEach((i) -> System.out.print(i + " " ));
        
        /*
         * sorted((e)-> comparator) - Sort based on specific criteria
         */
        System.out.println();
        System.out.println("\nList sorted alphabetically by car name: ");
        carList.stream().sorted((car1, car2) -> car1.make.compareTo(car2.make))
                         .forEach((car) -> System.out.print(car.make + " "));
        
        System.out.println();
        System.out.println("\nList sorted from highest mileage to lowest: ");
        carList.stream().sorted((car1, car2) -> car2.mileage - car1.mileage)
                         .forEach((car) -> System.out.println(car.make + " " + car.mileage));
        
        /*
         * filter((e) -> condition) - keep items that return true for condition
         * count() - return number of items in the stream
         */
        long count = Arrays.stream(strArr)
                           .filter((word) -> word.contains("e"))
                           .count();
        System.out.println("\nNumber of words that contain the letter 'e': " + count);
        System.out.println(Arrays.toString(strArr));
        
        /*
         * reduce(initalVal, (accumulator, next) -> combine) - combine elements into single value
         */
        int totalMileage = intList.stream().reduce(0, (acc, n) -> {
            return acc + n;
        });
        System.out.println("\nSum of all ints in list: " + totalMileage);
        System.out.println(intList);
        
        /*
         * map((e) -> a new element) - scale or convert a stream of elements to another
         * collect(Collectors.toList()) - add stream elements to list and return
         */
        List<String> models = carList.stream()
                                      .map((car) -> car.make)
                                      .collect(Collectors.toList());
        System.out.println("\nMap list of cars to list of strings: " + models);
        
        /*
         * Stream method chaining, filter, map, and reduce
         */
        int totalCharacters = Arrays.stream(strArr)
                  .filter( (word) -> word.length() > 3 )
                  .map( (word) -> word.length() )
                  .reduce( 0, (int1, int2) -> int1 + int2);
        
        System.out.println("\nThe total number of characters for words"
                + " longer than 3 characters is: " + totalCharacters);
        System.out.println(Arrays.toString(strArr));
    }
}
