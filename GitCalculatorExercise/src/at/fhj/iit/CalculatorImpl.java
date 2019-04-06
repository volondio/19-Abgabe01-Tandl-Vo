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
        int smallestNum=list.get(0);
        for(int i: list){
            if(smallestNum>i){
                smallestNum=i;
            }
        }
        System.out.println("Minimum: "+smallestNum);
        return smallestNum;
    }

    @Override
    public void addValue(int i) {
        list.add(i);
    }
}
