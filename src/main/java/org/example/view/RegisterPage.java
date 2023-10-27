package org.example.view;

import org.example.utilis.StringUtil;

import static org.example.utilis.Utilis.println;

public class RegisterPage {
  public void printRegistrationSuccessful() {
    try {
      println("#---------------------#");
      println(StringUtil.REGISTRATION_SUCCESSFUL);
      println("#---------------------#");
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  public void passwordMisMatch() {
    try {
      println("#---------------------#");
      println(StringUtil.PASSWORD_MISMATCH);
      println("#---------------------#");
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
