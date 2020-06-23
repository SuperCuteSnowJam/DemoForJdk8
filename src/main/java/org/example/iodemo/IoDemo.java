package org.example.iodemo;


import java.io.File;
import java.io.FileReader;


public class IoDemo {

    public static void main(String[] args) {

        File file = new File("C:\\person_file\\常用信息记录.txt");
        try {
            FileReader fr = new FileReader(file);
            char[] buf = new char[3];
            int head = 0;
            while((head = fr.read(buf)) > 0){
                System.out.print(new String(buf,0,head));

            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }




    }

}
