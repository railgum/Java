package JavaException_lesson3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HomeWork3 {
  public static void main(String[] args) {
    checkForm();
  }

  /**
   * 
   */
  public static void checkForm() {
    String x = "Enter your full name, date of birth(dd.mm.yyyy), phone number(+71234567890) and gender(m/f)";
    System.out.println(x);
    try {
      Scanner scanner = new Scanner(System.in);
      String answer = scanner.nextLine();
      String[] words = answer.split(" ");
      String[] fullName = new String[3];
      System.arraycopy(words, 0, fullName, 0, 3);
      String dateOfBirth = words[3];
      String phoneNumber = words[4];
      String gender = words[5];
      System.out.println(dateOfBirth);
      System.out.println(phoneNumber);
      System.out.println(gender);

      if (words.length < 6) {
        try {
          throw new FormException("You have not entered all the data");
        } catch (FormException e) {
          e.printStackTrace();
        }
      }
      for (int i = 0; i < fullName.length; i++) {
        if (Pattern.matches("[a-zA-Z]", fullName[i])) {
          try {
            throw new FormException("Full name should consist only of letters");
          } catch (FormException e) {
            e.printStackTrace();
          }
        }
      }
      
      if (Pattern.matches("\d{2}\.\d{2}\.\d{4}", dateOfBirth)){
        try {
          throw new FormException("The date of birth format is incorrect");
        } catch (PatternSyntaxException e) {
          e.printStackTrace();
        }
      }
      if (Pattern.matches("\+\d{11}"gm, phoneNumber)) {
        try {
          throw new FormException("The phone number format is incorrect")
        } catch (PatternSyntaxException e) {
          e.printStackTrace();
        }
      }
      
      if (gender != "m" || gender != "f") {
        try {
          throw new FormException("In normal countries there are only 2 genders");
        } catch (FormException e) {
          e.printStackTrace();
        }
      }
       scanner.close();
    } finally {
    }
  }

}
