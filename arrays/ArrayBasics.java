package arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        // array declaration
        int[] arr; // dataType[] arrayName
        double arr1[];
        String[] arr2;

        // allocate memory
        // arr = {1,3,5,7}; // error because array constants can only be used in
        // intializers.
        arr1 = new double[5];

        // declaration and initialization
        int[] age = new int[3];
        age[0] = 15; // index starts from 0
        age[1] = 22;
        age[2] = 18;

        // access array elements
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);

        // looping through array elements
        // for loop
        System.out.println("Using for Loop:");
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        // for each loop
        System.out.println("Using for-each Loop:");
        for (int a : age) {
            System.out.println(a);
        }
    }
}
