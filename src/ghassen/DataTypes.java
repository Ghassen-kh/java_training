package ghassen;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class DataTypes {
    public static void main(String[] args){
        int intNumber = 308_000;
        float floatNumber = 9_000f;
        long longNumber = 6_000_000;
        String string = "125.25";
        //TODO: Print the numeric data types int and float with storage name and value
        System.out.print("intNumber : " + intNumber + "\tfloatNumber :" + floatNumber);
        System.out.print("\tlongNumber : " + longNumber);
        System.out.print("\tString variable : " + string);
        float floatNumber2 = Float.parseFloat(string);
        System.out.print("\tFloat to string : " + floatNumber2);
        float result = floatNumber2 + 100;
        System.out.print("\tresult addition : " + result);
        String text1 = Double.toString(result);
        System.out.print("\tFloat to string : " + text1);
        int number = 25;
        String intToString = Integer.toString(number);
        System.out.print("\tint to string : " + intToString + "\n");
        /*build a keyboard input :
        System.out.print("Type the name of the best developer:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print(name + " is the best developer");*/
        //test the import statement for the local date:
        LocalDate birthDate = LocalDate.of(1996, Month.OCTOBER, 15);
        System.out.print("\n birthdate of Ghassen is  : " + birthDate);
        test testing=new test();
        System.out.print("\n");
        testing.printTest();
        // Implement four random integers between 1 and 600 with a seed value of 3:
        Random random =new Random(4);
        for (int i=0;i<4;i++){
            System.out.print("\n"+random.nextInt(600)+ " "+"\n");
        }
        //The math class example
        double baseValue =15.6;
        double powerValue = 4.7;
        System.out.printf("%.3f",Math.pow(baseValue,powerValue));
        // Class example :
        System.out.printf("\n");
        Dog dog1=new Dog();
        dog1.getName();
        //Instantiate an object named 'mobilePhone'
        System.out.printf("\n");

        MobilePhone mobilePhone=new MobilePhone("samsung",500);
        //Encapsulation example :
        System.out.printf("\n");
        mobilePhone.setPrice(300);
        //ArrayList example : implements elements that are all of the same data type
        //Implement an arraylist of type string named 'planets'
        ArrayList<String> planets =new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        System.out.printf("\n");
        for (String planet:planets){
            System.out.print(planet+" ");
        }
        /* Debugging Example :
        //1 2 3 4 5 6 7 8 9 10 11 *** Number indices ***
        //1 1 2 3 5 8 13 21 34 55 89 *** First 11 Fibonacci numbers ***
        //PROBLEM STATEMENT : Implement the debugging to handle the exception, StackOverFlowError
        //EXAMPLE SOLUTION:
        //Return x<= 2 ? 1 : getFibonacci(x-1)+getFibonacci(x-2);
        //Fibonacci value at index 8: 21
        */
        System.out.printf("\n");
        int y=11;
        System.out.print("Fibonacci value at index "+y+" is "+getFibonacci(y));
        //Lambda expression: to print 'Hello, lambda'
        //EXAMPLE SOLUTION :
        //Thread thread1=new Thread(() -> System.out.print("Hello, lambda"));
        System.out.printf("\n");
        Thread thread1 = new Thread(() -> System.out.print("Hello, lambda."));
        thread1.run();
        //Implement a lambda to remove even numbers from a list :
        //EXAMPLE SOLUTION :
        //values.removeIf(i -> i % 2 ==0);
        System.out.printf("\n");
        ArrayList<Integer> values = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        values.removeIf(i -> i % 2 == 0);
        values.forEach(i->System.out.print(i+" "));
        //Streams : to sort words alphabetically Streams :list of values
        //Implement the stream() to print words in alphabetical order :
        //EXAMPLE SOLUTION :
        //cities.stream().sorted(Comparator.naturalOrder()).forEach(e-> System.out.print(c+" "));
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Kef","Mannouba","Ben Arous","Gabes","Ariana","Tunis"));
        System.out.printf("\n");
        cities.stream().sorted(Comparator.naturalOrder()).forEach(c -> System.out.print(c+" "));
        //Implement the stream() to print an int using the filter, map, reduce pattern
        //EXAMPLE SOLUTION :
        // int sum = numbers.stream().filter(i -> i<8.map(e -> e*3).reduce(0,(partAnswer,y) -> partAnswer + y);
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(6,7,8,9));
        int sum=numbers.stream()
                .filter(i -> i<8)
                .map(e -> e*3)
                .reduce(0,(partAnswer,z)-> partAnswer+z);
        System.out.printf("\n");
        System.out.print(sum);
    }

    private static long getFibonacci(int x) {
        return  x<=2 ? 1 : getFibonacci(x-1)+getFibonacci(x-2);    }
    }
