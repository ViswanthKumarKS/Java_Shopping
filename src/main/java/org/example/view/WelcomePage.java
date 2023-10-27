package org.example.view;

import org.example.utilis.StringUtil;


import static org.example.utilis.Utilis.println;


public class WelcomePage {

  public void welcome() {

    println(StringUtil.WELCOME_MESSAGE);

  }

  public void printAuthMenu() {
    println(StringUtil.AUTH_MENU);
  }
}

