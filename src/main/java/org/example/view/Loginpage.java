package org.example.view;

import static org.example.utilis.Utilis.println;

public class Loginpage {
  public void invalidCrdentials() {
    try {
      println("#---------------------#");
      println("Invalid Credentials!!!");
      println("#---------------------#");
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}



