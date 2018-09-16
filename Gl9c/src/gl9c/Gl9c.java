package gl9c;

import java.util.ArrayList;

public class Gl9c {
    //quicksort
    //create files with random numbers
    //read files and sort numers
    public static void main(String[] args) {
        String fileName = "GENERATOR.txt";
        Generate numbers = new Generate(9);
        WriteInFile write = new WriteInFile(fileName);
        write.writing(numbers);
        ReadFile reading = new ReadFile(fileName);
        ArrayList array = reading.getNumbers();
        System.out.println(array);
        QSort sort = new QSort(array);
        sort.qsort();
        System.out.println(sort.getArray());        
    }
    
}
