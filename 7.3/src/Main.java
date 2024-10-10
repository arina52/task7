public class Main {
    public static void main(String[] args) {
        int[] original = {3, 1, 1, 9, 0};

        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        System.out.println("Array-ul copie:");
        for (int i=0; i<copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
