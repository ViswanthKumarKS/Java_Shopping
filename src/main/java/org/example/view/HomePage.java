package org.example.view;

import org.example.controller.HomeController;
import org.example.utilis.StringUtil;

import static org.example.utilis.Utilis.println;

public class HomePage {

  public void printMenu()
  {
    println(StringUtil.HOME_WELCOME);
    println(StringUtil.HOME_MENU);
  }

}
