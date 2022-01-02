package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSequence {

    private List<Integer> numbers = new ArrayList<>();

    public NumberSequence(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public NumberSequence(int count, int minValue, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(minValue, maxValue + 1));
        }
    }

    public List<Integer> closeToAverage(int value) {
        double average = getAverage();
        List<Integer> numbersCloseToAverage = new ArrayList<>();
        for (int actual : numbers) {
            if (Math.abs(actual - average) <= value + 0.000000001d) {
                numbersCloseToAverage.add(actual);
            }
        }
        return numbersCloseToAverage;
    }

    private double getAverage() {
        double sum = 0;
        for (int actual : numbers) {
            sum += actual;
        }
        return sum / numbers.size();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
