import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        numberForeDZ();
    }

    public static void numberForeDZ() {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        string = string.trim();
        if(string.isEmpty())
            throw new IllegalArgumentException("Строка пустая!");
        else
            System.out.println(string);
        }


    public static void numberOneDZ(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дробное число ");
        if (in.hasNextFloat()){
            float f = in.nextFloat();
            System.out.println(f);
        }
        else {
            System.out.println("Попробуйте снова");
        }
    }
    public static void taskOneSeminar(){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter ");
        if (in.hasNextInt()){
            int index = in.nextInt();
            if (index < arr.length){
                arr[index] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
