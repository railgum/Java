import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
// import java.lang.System.Logger;
// import java.lang.System.Logger.Level;
// import java.util.logging.ConsoleHandler;
// import java.util.logging.Handler;
// import java.util.logging.SimpleFormatter;

public class Lecture2 {
  /**
   * @param args
   */
  public static void main(String[] args) {
    // var s = System.currentTimeMillis();
    // String stroka = ""; // 17 минут
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 1_000_000; i++) {
      // stroka = stroka + "+";
      sb.append("+"); // 53 миллисекунды
    }
    // System.out.println(System.currentTimeMillis() - s);
    // System.out.println(str);
    // System.out.println(sb);

    try {
      String pathProject = System.getProperty("user.dir");
      System.out.println(pathProject);
      String pathFile = pathProject.concat("/file.txt");
      System.out.println(pathFile);
      // File f3 = new File(pathFile);
      System.out.println("try");
    } catch (Exception e) {
      System.out.println("catch");
    } finally {
      System.out.println("finally");
    }

    try {
      String pathProject = System.getProperty("user.dir");
      String pathFile = pathProject.concat("/file.txt");
      File file = new File(pathFile);
      if (file.createNewFile()) {
        System.out.println("file.created");
      } else {
        System.out.println("file.existed");
      }
    } catch (Exception e) {
      System.out.println("catch");
    } finally {
      System.out.println("finally");

    }

    String line = "empty";
    try {
      String pathProject = System.getProperty("user.dir");
      String pathFile = pathProject.concat("/file.txt");
      File file = new File(pathFile);
      if (file.createNewFile()) {
        System.out.println("file.created");
      } else {
        BufferedReader bufReader = new BufferedReader(new FileReader(file));
        System.out.println("file.existed");
        line = bufReader.readLine();
        bufReader.close();
      }
    } catch (Exception e) {
      // e.printStackTrace();
    } finally {
      System.out.println(line);
    }

    String pathProject = System.getProperty("user.dir");
    String pathDir = pathProject.concat("/files");
    File dir = new File(pathDir);
    System.out.println(dir.getAbsolutePath());
    if (dir.mkdir()) {
      System.out.println("+");
    } else {
      System.out.println("-");
    }
    for (String fname : dir.list()) {
      System.out.println(fname);
    }


  }


}
