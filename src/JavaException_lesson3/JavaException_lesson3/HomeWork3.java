package JavaException_lesson3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HomeWork3 {
  public static void main(String[] args) throws FormException {
    checkForm();
  }

  public static void checkForm() throws FormException {
    String x = "Enter your full name, date of birth (dd.mm.yyyy), phone number (81234567890) and gender (m/f) separated by a space";
    System.out.println(x);
    Scanner scanner = new Scanner(System.in);

    // BufferedWriter writer = new BufferedWriter(new FileWriter(file));
    try (scanner) {
      String answer = scanner.nextLine();
      String[] words = answer.split(" ");
      String[] fullName = new String[3];
      String dateOfBirth = null;
      String phoneNumber = null;
      String gender = null;
      ArrayList<String> checkWords = new ArrayList<>();
      // System.out.println(dateOfBirth);
      // System.out.println(phoneNumber);
      // System.out.println(gender);
      if (words.length < 6) {
        throw new FormException("You have not entered all the data");
      } else {
        System.arraycopy(words, 0, fullName, 0, 3);
        dateOfBirth = words[3];
        phoneNumber = words[4];
        gender = words[5];
      }

      for (int i = 0; i < fullName.length; i++) {
        if (!Pattern.matches("[a-zA-Z]+", fullName[i])) {
          throw new FormException("Full name should consist only of letters");
        } else {
          fullName[i] = "<" + fullName[i] + ">";
          checkWords.add(fullName[i]);
        }
        //System.out.println(Arrays.toString(fullName));
      }


      if (!Pattern.matches("[0-9]{2}.[0-9]{2}.[0-9]{4}", dateOfBirth)) {
        throw new FormException("The date of birth format is incorrect");
      } else {
        dateOfBirth = "<" + dateOfBirth + ">";
        checkWords.add(dateOfBirth);
      }

      if (!Pattern.matches("[0-9]{11}", phoneNumber)) {
        throw new FormException("The phone number format is incorrect");
      } else {
        phoneNumber = "<" + phoneNumber + ">";
        checkWords.add(phoneNumber);
      }

      if (gender == "m" || gender == "f") {
        throw new FormException("In normal countries there are only 2 genders");
      } else {
        gender = "<" + gender + ">";
        checkWords.add(gender);
      }


      
    }
    // catch (IOException e) {
    // e.printStackTrace();

  }
}
