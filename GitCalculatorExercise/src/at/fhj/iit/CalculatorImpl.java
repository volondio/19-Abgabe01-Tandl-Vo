package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

public class CalculatorImpl implements Calculator {

    List<Integer> list = new ArrayList<Integer>();

    @Override
    public int getMaximum() {
        int biggestNum=list.get(0);
        for(int i: list){
            if(biggestNum < i){
                biggestNum=i;
            }
        }
        System.out.println("Maximum: " + biggestNum);
        return biggestNum;
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
