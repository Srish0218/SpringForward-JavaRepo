class Student {
    String name;
    int age;
    int grade;
    int UID;

    // Corrected getName method to return the object's name field
    public String getName() {
        return name;
    }
}

public class array {
    public static void main(String[] args) {
//         1D Array Example
        int num[] = {1, 2, 3};
        num[1] = 5;
        System.out.println("Updated value of num[1]: " + num[1]);

        int nums[] = new int[4];
        nums[0] = 3;
        nums[1] = 4;
        nums[2] = 5;
        nums[3] = 6;
        System.out.println("Value of nums[3]: " + nums[3]);

        // Printing all elements of the nums array
        System.out.println("Printing all elements of the nums array:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums[" + i + "]: " + nums[i]);
        }

        for(int n : nums) {
            System.out.println(n);
        }

        // 2D Array Example
        int num2[][] = new int[3][4];
        System.out.println("Adding random elements to the 2D array (num2):");
        for (int j = 0; j < num2.length; j++) {
            for (int k = 0; k < num2[j].length; k++) {
                num2[j][k] = (int) (Math.random() * 100);
                System.out.print(num2[j][k] + " ");
            }
            System.out.println();
        }

        // 3D Array Example
        int num3[][][] = new int[3][4][5];
        System.out.println("\nAdding random elements to the 3D array (num3):");
        for (int m = 0; m < num3.length; m++) {
            for (int n = 0; n < num3[m].length; n++) {
                for (int o = 0; o < num3[m][n].length; o++) {
                    num3[m][n][o] = (int) (Math.random() * 100);
                    System.out.print(num3[m][n][o] + " ");
                }
                System.out.println();
            }
            System.out.println("----- End of depth " + (m + 1) + " -----");
        }

        // String array
        String stu[] = new String[2];
        stu[0] = "A";
        stu[1] = "B";
        for (int i = 0; i < stu.length; i++) {
            System.out.print(stu[i] + " ");
        }
        System.out.println();

        // Student array and object creation
        Student stu1 = new Student();
        stu1.name = "Srishti";
        stu1.age = 22;
        stu1.grade = 23;
        stu1.UID = 42;

        Student stu2 = new Student();
        stu2.name = "Kuki";
        stu2.age = 25;
        stu2.grade = 26;
        stu2.UID = 43;

        Student stu3 = new Student();
        stu3.name = "Monu";
        stu3.age = 27;
        stu3.grade = 28;
        stu3.UID = 44;

        Student stu4 = new Student();
        stu4.name = "Satyam";
        stu4.age = 35;
        stu4.grade = 35;
        stu4.UID = 45;

        // Array of Student objects
        Student stdents[] = new Student[4];
        stdents[0] = stu1;
        stdents[1] = stu2;
        stdents[2] = stu3;
        stdents[3] = stu4;

        // Printing details of each student
        System.out.println("Details of students:");
        for (int i = 0; i < stdents.length; i++) {
            System.out.println("Name: " + stdents[i].name + ", Age: " + stdents[i].age +
                    ", Grade: " + stdents[i].grade + ", UID: " + stdents[i].UID);
        }
        System.out.println();

        // Testing the getName method
        Student test = new Student();
        test.name = "Srishti";
        String name = test.getName();
        System.out.println("Test name: " + name);

        System.out.println();

        for(Student st : stdents ){
            System.out.println(st.getName() + " " + st.age + " " + st.grade + " " + st.UID);
        }
    }
}
