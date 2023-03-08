package Lesson_2.Homework.Geo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

public interface Out {


    public void printToConsole(String data){
        System.out.println(data);
    }
    public void saveFile(String data, String path){
        try(FileOutputStream fos=new FileOutputStream(path + LocalDate.now()))
        {
            byte[] buffer = data.getBytes();

            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
