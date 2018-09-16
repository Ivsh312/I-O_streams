package gl9c;

import java.util.ArrayList;
import java.util.Random;

public class QSort {

    private ArrayList<Double> array;
    public static final Random RND = new Random();
    
    public ArrayList<Double> getArray() {
        return array;
    }

    public QSort(ArrayList<Double> array) {
        this.array = array;
        System.out.println(array.size());
    }

    public void qsort() {
        algoritmSort(0, array.size() - 1);
    }
    void sort(int start, int stop) {
         int index = algoritmSort(start, stop);
         if (start < index - 1)
             sort(start, index - 1);
         if (index < stop)
             sort(index, stop);
}
    private int algoritmSort(int start, int stop) {
        int i, j, oporn;
        i = start;
        j = stop;
        oporn = start + (stop - start)/2;
        while (i <= j) {
            while ( array.get(i) < array.get(oporn)) {
                i++;
            }
            while (array.get(j) > array.get(oporn)) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        System.out.println("i "+i+"j "+j);
        return i;
    }
    private void swap(int i, int j) {
        double tmp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, tmp);
    }
}
