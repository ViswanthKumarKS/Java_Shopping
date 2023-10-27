package org.example.utilis;

import java.util.InputMismatchException;

import static org.example.utilis.AppScanner.getScanner;

public class AppInput {
  public static String enterString(String msg) {
    Utilis.print(msg);
    return getScanner().nextLine();
  }

  public static int enterInt(String msg) throws AppException {
    Utilis.print(msg);
    int input;
    try {
      input = Integer.parseInt(AppScanner.getScanner().nextLine());
    } catch (Exception e) {
      throw new AppException("Invalid Input,Please enter a valid Input");
    }
    return input;
  }
}
