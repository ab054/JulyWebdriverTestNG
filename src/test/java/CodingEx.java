import org.testng.annotations.Test;
import vehicles.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class CodingEx {

    @Test
    public void printHelloAtEvenNumbers() {
        for (int i = 1; i <= 10; i++) {
            if (i%2==0) System.out.println("hello world");
        }
    }

    @Test
    public void swapTwoNumbersInArray() {
        int[] array = {1,2,3,4};
        swap(array, 1, 2);
        System.out.println(Arrays.toString(array));
    }


    @Test
    public void testName() {
        int[] array = {1};
        swap(array, 1, 2);
        System.out.println(Arrays.toString(array));

    }

    private void swap(int[] array, int indexL, int indexR) {
        //here is your code

    }

    @Test
    public void testCountLetters() {
        String input = "aaaabbbbbb";
        int result = 0;
        for(char eachChar : input.toCharArray()){
            if(eachChar== 'l') result++;
        }
        System.out.println(result);
    }


    @Test
    public void testContructor() {
        Car actor1 = new Car("Mazda 3", 2019);
    }

    @Test
    public void testArray() {
        int[] array = new int[10];
        String[] array1 = new String[10];
        Car[] carsArray = new Car[10];


        array[1] = 5;

        ArrayList<Integer> arrayList = new ArrayList<>();


        arrayList.add(1);
        arrayList.add(1);

        arrayList.size();
        arrayList.get(0);

    }
}
