package fourth_task;

public class MainFourth {
    public static void main(String[] args) {
        ListOfNumbers list1 = new ListOfNumbers();
        ListOfNumbers list2 = new ListOfNumbers();
        ListOfNumbers list3 = new ListOfNumbers();
        list1.addNumber(12.5d);
        list1.addNumber(20.5d);
        list1.addNumber(50d);
        list2.addNumber(40.3d);
        list2.addNumber(40.3d);
        list2.addNumber(40.3d);
        list3.addNumber(100.2d);
        list3.addNumber(100d);
        list3.addNumber(80.2d);
        ListOfNumbers result1 = findWithMaxAverage(list1, list2, list3);
        ListOfNumbers result2 = findWithMaxAverage(list1, list2);
        System.out.println(result1);
        System.out.println(result2);
    }

    private static ListOfNumbers findWithMaxAverage(ListOfNumbers... lists) {
        ListOfNumbers listWithMaxAverage = null;
        double maxAverage = Double.MIN_VALUE;
        for (ListOfNumbers list : lists) {
            double currentAverage = list.getAverage();
            if (currentAverage > maxAverage) {
                maxAverage = currentAverage;
                listWithMaxAverage = list;
            }
        }
        return listWithMaxAverage;
    }
}
