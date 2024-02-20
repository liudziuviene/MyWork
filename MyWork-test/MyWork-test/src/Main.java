public class Main {
    public static void main(String[] args) {
        Integer[] numbersArray = {1, 2, 3};
        String[] stringsArray = {"Hello", "world"};
        printArray(numbersArray);
        printArray(stringsArray);
    }

    private static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
