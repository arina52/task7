import java.util.Scanner;

public class BiArray {
    int[][] biArray = new int[7][2];
    public void Init(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Introduceti 14 numere:");
        for (int i = 0; i < biArray.length; i++) {
            for(int j=0; j<biArray[i].length; j++){
                int num = obj.nextInt();
                biArray[i][j] = num;
            }
        }
    }
    public int Sum() {
        int sum = 0;
        for (int i = 0; i < biArray.length; i++) {
            for(int j=0; j<biArray[i].length; j++){
                sum+=biArray[i][j];
            }
        }
        return sum;
    }
    public double Average(){
        return (double) Sum()/(biArray.length*biArray[0].length);
    }
}
