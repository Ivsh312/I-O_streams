package gl9c;

import java.io.FileNotFoundException;
import java.io.FileReader;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ReadFile {

    private String fileName;

    public ReadFile(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ArrayList<Double> getNumbers() {
        ArrayList<Double> array = new ArrayList<Double>();
        double reading;
        FileReader f;
        Scanner scan;
        try {
            f = new FileReader(fileName);
            scan = new Scanner(f);
            scan.useLocale(Locale.ENGLISH);
            while (scan.hasNext()) {
                System.out.println(scan.hasNext());
                if (scan.hasNextDouble()) {
                    reading = scan.nextDouble();
                    array.add(reading);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("нет такого файла");
            exit(0);
        }
        return array;
    }
}
