import org.testng.annotations.Test;

public class Day1 {

    @Test
    public void testFirstDayCode() {
        System.out.println("Hello, World!");
        System.out.println("Another Hello!");
    }

    @Test
    public void testIntegers() {
        int myNumber;
        myNumber = 7;

        System.out.println(myNumber);
    }

    @Test
    public void testChars() {
        char charVar = 'g';
        System.out.println(charVar);
    }

    @Test
    public void testStrings() {
        String s2 = "Who who who who!";

        System.out.println(s2);
    }

    @Test
    public void testPrintMessages() {
        int numberOfSeconds = 5;
        String message = "I wait for " + numberOfSeconds + " seconds";

        System.out.println(message);
    }

    @Test
    public void testLogicalOperators() {
        boolean b = false;
        b = true;

        boolean toBe = false;
        b = toBe || toBe;

        b = true || false || false;
        boolean c = true && false;

        System.out.println(b);
    }


    @Test
    public void testConditionalStatement(){
        boolean elementIsVisible = true;

        if(elementIsVisible == true){
            System.out.println("Click on the element");
        } else {
            System.out.println("Wait until visible");
        }
    }

    @Test
    public void testArrays() {
        int[] arrayOfIntegers = new int[10];

        arrayOfIntegers[0] = 1;
        arrayOfIntegers[1] = 2;

        System.out.println(arrayOfIntegers[1]);

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(arr[4]);
    }

    @Test
    public void testLoops() {
        for(int i=1; i<11; i++){
            System.out.println("i=" + i);
        }
    }

    @Test
    public void testForLoopArrays() {
        int[] array = {3, 2, 3, 4, 3, 6, 76, 8, 97, 140};

        for(int i=0; i< array.length; i++){
            System.out.println("array[" + i + "]="  + array[i]);
        }
    }

    @Test
    public void testWhileLoops() {
        boolean elementVisible = false;

        int timeWeHaveWait = 0;

        while(timeWeHaveWait < 15){
            System.out.println("wait for 5 seconds");

            timeWeHaveWait = timeWeHaveWait + 5;
        }
    }

    @Test
    public void testForEach() {
        int[] array = {3, 2, 3, 4, 3, 6, 76, 8, 97, 140};

        for(int eachElement : array){
            System.out.println(eachElement);
        }
    }

    public void printEverySecondElement(int[] inputArray){
        for(int i=0; i< inputArray.length; i=i+2){
            System.out.println("array[" + i + "]="  + inputArray[i]);
        }
    }

    @Test
    public void testExternalMethods() {
        int[] ints = {1,2,3,4,5,6,7,8,9,10};
        printEverySecondElement(ints);
    }
}