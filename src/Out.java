import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

public class Out {


    public void searchRelationshipToConsole(Person name, GeoTree geoTree, Relationship relationship){
        System.out.println(new Reserch(geoTree).spend(name,relationship));
    }
    public void searchBirthdayToConsole(Person name, GeoTree geoTree){
        System.out.println(new Reserch(geoTree).bd(name));
    }
    public void saveFile(Person name, GeoTree geoTree, Relationship relationship, String path){
        try(FileOutputStream fos=new FileOutputStream(path + LocalDate.now()))
        {
            byte[] buffer = new Reserch(geoTree).spend(name,relationship).toString().getBytes();

            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
