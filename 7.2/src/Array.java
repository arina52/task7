import java.util.Scanner;
public class Array {
    int[] intArray = new int[10];

    public void Init() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Introduceti 10 numere:");
        for (int i = 0; i < intArray.length; i++) {
            int num = obj.nextInt();
            intArray[i] = num;
        }
    }
    public int Sum(){
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        return sum;
    }
    public double Average(){
        double average = (double)Sum()/intArray.length;
        return average;
    }
}
