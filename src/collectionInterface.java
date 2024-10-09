import java.util.*;

// Class representing a Friend with a name and ID, implementing Comparable for custom sorting
class Friends implements Comparable<Friends> {
    int ID;
    String name;

    public Friends(String name, int ID) {
        this.ID = ID;
        this.name = name;
    }

    // Overriding toString to display friend details
    public String toString() {
        return "Friend's name: " + name + ", ID: " + ID;
    }

    // Custom sorting based on ID in descending order
    @Override
    public int compareTo(Friends o) {
        return this.ID < o.ID ? -1 :  1;
    }
}

public class collectionInterface {
    public static void main(String[] args) {
        System.out.println("Collections...");

        // Using a Collection interface with ArrayList implementation
        Collection<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(8);
        nums.add(3);
        nums.add(2);
        System.out.println("Initial Collection (nums): " + nums);

        // Checking if the collection contains a specific element
        System.out.println("Collection contains 3: " + nums.contains(3));

        // Removing an element from the Collection
        nums.remove(8);
        System.out.println("Collection after removing 8: " + nums);

        // Converting Collection to Array
        Integer[] numsArray = nums.toArray(new Integer[0]);
        System.out.println("Array from Collection: " + Arrays.toString(numsArray));

        // Clearing the Collection
        nums.clear();
        System.out.println("Is Collection empty after clearing? " + nums.isEmpty());

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("\nList...");

        // Using List interface with ArrayList implementation
        List<Integer> nums1 = new ArrayList<>();
//        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        nums1.add(1);
        nums1.add(6);
        nums1.add(2);
        nums1.add(11);
        nums1.add(1); // List allows duplicates
        System.out.println("Initial List (nums1): " + nums1);

        // Adding elements at a specific index
        nums1.add(2, 99);
        System.out.println("List after adding 99 at index 2: " + nums1);

        // Replacing an element at a specific index
        nums1.set(3, 55);
        System.out.println("List after setting index 3 to 55: " + nums1);

        // Removing an element by index
        nums1.remove(2);
        System.out.println("List after removing element at index 0: " + nums1);
        nums1.removeFirst();
        System.out.println("List after removing first element: " + nums1);
        nums1.removeLast();
        System.out.println("List after removing last element: " + nums1);

        // Sorting the List in descending order
        Collections.sort(nums1);
        Collections.reverse(nums1);
        System.out.println("List sorted in descending order: " + nums1);

        // Custom sorting by last digit
        Comparator<Integer> com = (o1, o2) -> o1 % 10 > o2 % 10 ? 1 : -1; // lambda function and ternary operator

//        Comparator<Integer> com = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (o1 > o2) {
//                    return 1;
//
//                }else {
//                    return -1;
//                }
//            }
//        };

        nums1.sort(com);
        System.out.println("List sorted by the last digit of each element: " + nums1);


        System.out.println("List with string object");
        List<Friends> dost = new ArrayList<>();
        dost.add(new Friends("Srishti" , 2957));
        dost.add(new Friends("Satyam" , 4354));
        System.out.println(dost);
        System.out.println();

        // Iterating with a for-each loop
        System.out.println("Iterating with a for-each loop");
        for (Friends f : dost) {
            System.out.println(f);
        }

        // Sorting Friends by ID
        Comparator<Friends> comp = (f1, f2) -> f1.ID < f2.ID ? -1 : 1;

        dost.sort(comp);
        System.out.println("List sorted by the ID of each Friend: " + dost);

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("\nSet...");

        // Using Set interface with HashSet implementation
        Set<Integer> nums2 = new HashSet<>();
        nums2.add(2);
        nums2.add(11);
        nums2.add(18);
        nums2.add(211);
        nums2.add(2); // Duplicates are ignored in Set
        System.out.println("Unordered Set (nums2): " + nums2);

        // Checking if Set contains a specific element
        System.out.println("Set contains 211: " + nums2.contains(211));

        // Removing an element from the Set
        nums2.remove(11);
        System.out.println("Set after removing 11: " + nums2);

        // Converting Set to List
        List<Integer> setToList = new ArrayList<>(nums2);
        System.out.println("Set converted to List: " + setToList);

        // Using TreeSet for a sorted Set
        Set<Integer> nums3 = new TreeSet<>(nums2);
        nums3.add(7);
        System.out.println("Sorted Set (TreeSet): " + nums3);

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("\nMap...");

        // Using Map interface with HashMap implementation
        Map<String, Integer> students = new HashMap<>();
        students.put("Srishti", 2);
        students.put("Satyam", 11);
        students.put("Sam", 18);
        students.put("Sami", 21);
        System.out.println("Initial Map (students): " + students);

        // Updating a value in the Map
        students.put("Srishti", 25);
        System.out.println("Updated value for key 'Srishti': " + students.get("Srishti"));

        // Removing an entry by key
        students.remove("Sam");
        System.out.println("Map after removing key 'Sam': " + students);

        // Checking if Map contains a key or a value
        System.out.println("Map contains key 'Satyam': " + students.containsKey("Satyam"));
        System.out.println("Map contains value 21: " + students.containsValue(21));

        // Iterating over Map entries using entrySet
        System.out.println("Iterating over Map entries:");
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Using LinkedHashMap to maintain insertion order
        Map<String, Integer> orderedStudents = new LinkedHashMap<>();
        orderedStudents.put("Alex", 1);
        orderedStudents.put("Brian", 3);
        orderedStudents.put("Charles", 4);
        orderedStudents.put("David", 5);
        System.out.println("Ordered Map (LinkedHashMap): " + orderedStudents);

        // Using TreeMap for a sorted Map based on keys
        Map<String, Integer> sortedStudents = new TreeMap<>(students);
        System.out.println("Sorted Map (TreeMap) by keys: " + sortedStudents);

        System.out.println();
    }
}
