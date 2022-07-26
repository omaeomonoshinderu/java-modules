package _03_Sorting_With_Streams;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
<<<<<<< HEAD
import java.util.stream.IntStream;
=======
import java.util.stream.Collectors;
>>>>>>> df8eace4919e068a985369b73a480744d8aadc7f
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

/*
 * Use streams to complete both sort methods:
 * 1. Sort the array from smallest to largest
 *    Use the .toArray() stream method to return an array
 * 2. Sort the list alphabetically from a -> z.
 *    Use the .collect(Collectors.toList()) stream method to return a list
 */
public class StreamSorter {
<<<<<<< HEAD
	public static void main(String[] args) {
		Integer[] nums = new Integer[50];
		for(int i = 0; i < nums.length; i++) {
			Random rGen = new Random();
			nums[i] = rGen.nextInt();
		}
		int number = IntStream.range(0, 500).sum();
		//1. Convert the Integer array to Stream object.
		
		//2. Use the sorted method of the stream to sort the numbers.
		
		//3. Use the forEach method with a lambda to print all the elements of the sorted Stream.
		//   They should be in ascending order.
	}
=======

    int[] sortArray(int[] arr) {
        return null;
    }

    List<String> sortList(List<String> list) {
        return null;
    }
    
    // =================== DO NOT MODIFY THE CODE BELOW ======================
    
    @Test
    void TestSort1(){
        // 50 random ints from 0 to 100
        int[] nums = new Random().ints(50, 0, 101)
                                 .toArray();
        
        nums = sortArray(nums);
        
        Arrays.stream(nums).forEach((i) -> System.out.print(i + " "));
        
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i + 1] ) {
                System.err.println("nums[" + i + "] = " + nums[i] + "> nums[" + (i+1) + "]");
                assertTrue(false);
            }
        }
    }

    @Test
    void TestSort2(){
        List<String> list = Stream.of("these", "are", "just", "some", "random", "strings")
                                  .collect(Collectors.toList());
        
        list = sortList(list);
        System.out.println();
        System.out.println(list);
        
        assertEquals(list.get(0), "are");
        assertEquals(list.get(1), "just");
        assertEquals(list.get(2), "random");
        assertEquals(list.get(3), "some");
        assertEquals(list.get(4), "strings");
        assertEquals(list.get(5), "these");
    }
>>>>>>> df8eace4919e068a985369b73a480744d8aadc7f
}

// 0. Lambdas and Streams
	// Better explanations and examples
// 1. Binary Numbers and Operations
	//  Intro to binary
	//  Encrypt & Decrypt, 
	//  Robot interface, (Daniel has ideas)
// 2. File IO
//     
// 3. Threads
// 4. Sockets/API - setup server - 
//     Central Socket Server ( Mike has code)

