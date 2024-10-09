import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(nums);

        int result = 0;
        for(int n : nums){
            if (n%2 == 0) {
                n = n * 2;
                result += n;
            }
        }
        System.out.println(result);

        System.out.println();
        System.out.println("Enhanced for loop...");

        for(Integer n : nums){
            System.out.println(n);
        }

        System.out.println("For each method...");
        nums.forEach(n -> System.out.println(n));

        System.out.println();
        System.out.println();

        // Below commented code shows how for each code is drived

//        System.out.println("For each method with customized consumer interface");
//
//        Consumer<Integer> con = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer n) {
//                System.out.println(n);
//            }
//        };
//        nums.forEach(con);

//        Consumer<Integer> con = (Integer n) ->  System.out.println(n);



        System.out.println();
        // Printing elements using for each and lambda function
        System.out.println("For each with lambda...");
        nums.forEach(System.out::println);

        System.out.println();
        System.out.println("Stream API...");

        // Creating Stream API object to print elements

        // using objects
        Stream<Integer> s1 = nums.stream();
//        s1.forEach(n -> System.out.println(n));

        try{
//            s1.forEach(n -> System.out.println(n));

        }
        catch (IllegalStateException e){
            System.out.println("Can't run stream API more than once..."); // Can
            System.out.println(e);
        }
        System.out.println();

        Stream<Integer> streamFilter = s1.filter(n -> n%2 == 0);
        try {
//            streamFilter.forEach(n -> System.out.println(n));
        } catch (Exception e) {
            System.out.println("Can't run stream API with filter for now because stream is already called. To call stream api with filter please first comment above for each stream api...");
        }

        System.out.println();
        Stream<Integer> streamMap = streamFilter.map(n -> n * 2);
        try {
            streamMap.forEach(n -> System.out.println(n));
        } catch (Exception e) {
            System.out.println("Can't run stream API with filter for now because stream is already called. To call stream api with filter please first comment above for each stream api...");
        }

        System.out.println();


        // Enhanced way
        // Without Objects
//        Predicate<Integer> p = n -> n%2 == 0;

        int sum = nums.stream()
                .filter(n -> n%2 == 0)
                .map(n -> n * 2)
                .reduce(0 , (c , e) -> c + e);
//                .forEach(n -> System.out.println(n));
        System.out.println("Sum of doubled even numbers: " + sum);

//        Function<Integer , Integer> f = n-> n*2;
        System.out.println();
        Stream<Integer> sortedValues = nums.stream().filter(n -> n%2 == 0).sorted();
        sortedValues.forEach(n -> System.out.println(n));





    }
}
