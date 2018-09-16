/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gl9c;

import java.io.*;
import java.util.ArrayList;

public class WriteInFile {

    private String fileName;

    public WriteInFile(String fileName) {
       this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void writing(Generate generate) {
        ArrayList<Double> array = generate.getRandom();
        File f = new File(fileName);
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        String b;
        try {
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            for (double a : array) {
                b = (String.valueOf(a))+" ";
                pw.printf(b);
            }
        } catch (IOException e) {
            System.err.println("oшибка открытия потока");
        } finally {
            try {
                pw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
