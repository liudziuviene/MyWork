package fourth_task;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    private List<Double> numbers = new ArrayList<>();

    public ListOfNumbers() {
        this.numbers = new ArrayList<>();
    }

    protected void addNumber(double number) {
        numbers.add(number);
    }

    protected double getAverage() {
        double suma = 0;
        if (numbers.isEmpty()) {
            return 0;
        }
        for (double element : numbers) {
            suma += element;
        }
        return suma / numbers.size();
    }

    @Override
    public String toString() {
        return "ListOfNumbers{" +
                "numbers=" + numbers +
                '}';
    }
}



