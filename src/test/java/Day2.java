import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day2 {

    @Test
    public void testPrintEvenNumbers() {
        for (int i = 1; i <= 10; i++) {
            if (i%2==0) System.out.println(i);
        }
    }

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

        String arrayConverted = Arrays.toString(array);
        System.out.println(arrayConverted);
    }

    private void swap(int[] array, int indexL, int indexR) {
        int temp = array[indexL];
        array[indexL] = array[indexR];
        array[indexR] = temp;
    }

    //TODO: convert solution code to have external "solution" method
    @Test
    public void testCountLetters() {
        String input = "hello world";
        int result = 0;
        for(char eachChar : input.toCharArray()){
            if(eachChar== 'l') result++;
        }
        System.out.println(result);
    }


    @Test
    public void testConstractors() {
       // vehicles.Car actor1 = new vehicles.Car("Actor1 Name", "Actor1 Lastname");

//
      //  System.out.println("name field's value:" + actor1.name);
       // System.out.println("surname field's value:" + actor1.surname);


      //  System.out.println("name field's value:" + actor2.name);
      //  System.out.println("surname field's value:" + actor2.surname);
    }

    //TODO: create an array of primitive data type objects
    @Test
    public void testArrayList() {
        String[] arrayOfStrings = new String[]{"Member1", "Member2"};


        List<String> arrayList = new ArrayList<>();

        arrayList.add("Member1");
        arrayList.add("Member2");
        arrayList.add("Member3");
        arrayList.add("Member4");
        arrayList.add("Member5");

        arrayList.remove("Member3");
    }

    @Test
    public void testConditionals() {
        String a = new String("Wow");
        String b = "Wow";
        String c = a;
        String d = c;

        boolean b1 = a.equals(b);
        boolean b2 = b.equals(b);
        boolean b3 = c == a;

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
