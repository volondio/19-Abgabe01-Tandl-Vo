package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

public class CalculatorImpl implements Calculator {

    List<Integer> list = new ArrayList<Integer>();

    @Override
    public int getMaximum() {
        return 0;
    }

    @Override
    public int getMinimum() {
        return 0;
    }

    @Override
    public void addValue(int i) {
        list.add(i);
    }
}
