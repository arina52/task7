public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        array.Init();
        System.out.println("Suma array-ului = "+array.Sum());
        System.out.println("Media array-ului = "+array.Average());
        BiArray biArray = new BiArray();
        biArray.Init();
        System.out.println("Suma array-ului bidimensional = "+biArray.Sum());
        System.out.println("Media array-ului bidimensional ="+biArray.Average());
    }
}