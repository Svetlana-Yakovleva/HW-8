import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int [] numbers = new int []{1, 2, 3};
        double [] fractions = new double[] {1.57, 7.654, 9.986};
        int [] money= new int[]{15, 16, 23, 44, 10};
        System.out.println("Задача 2");
        for (int index =0; index < numbers.length; index++) {
            if (index == numbers.length - 1) {
                System.out.println(numbers[index]);
                break;
            }
            System.out.print(numbers[index] + ", ");
        }

        for (int index =0; index < fractions.length; index++){
             if (index==fractions.length-1){
                 System.out.println(fractions[index]);
                 break;
             }
             System.out.print(fractions[index]+ ", ");
        }

        for (int index = 0; index< money.length; index++){
            if (index==money.length-1){
                System.out.println(money[index]);
                break;
            }
            System.out.print(money[index]+ ", ");
        }
        System.out.println(" Задача 3.");
        for (int index =numbers.length-1; index>=0; index--) {
            if (index<=0) {
                System.out.println( numbers[index]);
                break;
            }
            System.out.print(numbers[index]+", ");
        }
        for (int index = fractions.length-1; index>=0;index--){
            if (index<=0) {
                System.out.println(fractions[index]);
                break;
            }
            System.out.print(fractions[index]+ ", ");
        }
        for (int index = money.length-1; index>=0; index--){
            if (index<=0) {
                System.out.println(money[index]);
                break;
            }
            System.out.print(money[index]+ ", ");
        }
        System.out.println("Задача 4");
        for (int index =0; index < numbers.length; index++){
            if (numbers[index]%2==1){
                numbers[index]++;
            }
            System.out.print(numbers[index]+ " ");

        }

    }
}