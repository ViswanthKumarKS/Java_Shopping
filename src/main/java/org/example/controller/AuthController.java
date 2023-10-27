package org.example.controller;

import org.example.controller.Input.IAuthController;
import org.example.models.Role;
import org.example.models.User;
import org.example.utilis.AppException;
import org.example.utilis.StringUtil;
import org.example.view.Loginpage;
import org.example.controller.HomeController;
import org.example.view.RegisterPage;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static org.example.utilis.AppInput.enterInt;
import static org.example.utilis.AppInput.enterString;
import static org.example.utilis.FileUtili.getCredentialsFile;
import static org.example.utilis.Utilis.println;


public class AuthController implements IAuthController {

  private final AppController appController;
  private final Loginpage loginpage;
  private final RegisterPage registerPage;
  private final HomeController homeController;

  public AuthController(AppController appController) {
    this.appController = appController;


    loginpage = new Loginpage();
    homeController = new HomeController(this);
    registerPage = new RegisterPage();
  }

  @Override
  public void authMenu() {
    appController.printAuthMenu();
    int choice;
    try {
      choice = enterInt(StringUtil.ENTER_CHOICE);
      if (choice == 1) {
        login();
      } else if (choice == 2) {
        register();
      } else {
        invalidChoice(new AppException(StringUtil.INVALID_CHOICE));
      }
    } catch (AppException appException) {
      invalidChoice(appException);
    }


  }

  private void invalidChoice(AppException e) {
    println(e.getMessage());
    authMenu();
  }


  @Override
  public void login() {
    String email, password;
    email = enterString(StringUtil.ENTER_EMAIL);
    password = enterString(StringUtil.ENTER_PASSWORD);

    User u1 = validateUser(email, password);
    if (u1 != null) {
      homeController.printMenu();
    } else {
      loginpage.invalidCrdentials();
      authMenu();
    }


  }

  private User validateUser(String email, String password) {
    try {
      Scanner scanner = new Scanner(getCredentialsFile());
      while (scanner.hasNext()) {
        String value = scanner.next().trim();
        if (!value.startsWith("id")) {
          String[] userArray = value.split(",");
          if (userArray[2].equals(email) && userArray[3].equals(password)) {
            User user = new User();
            user.setId(Integer.parseInt(userArray[0]));
            user.setName(userArray[1]);
            user.setEmail(userArray[2]);
            user.setPassword(userArray[3]);
            if (user.getEmail().equals("admin123@gmail.com"))
              user.setRole(Role.Admin);
            else
              user.setRole(Role.User);
            return user;
          }
        }
      }
      scanner.close();
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    return null;
  }


  @Override
  public void register() {
    String email, name, password, conformpass;
    name = enterString(StringUtil.ENTER_NAME);
    email = enterString(StringUtil.ENTER_EMAIL);
    password = enterString(StringUtil.ENTER_PASSWORD);
    conformpass = enterString(StringUtil.ENTER_PASSWORD_AGAIN);

    if (password.equals(conformpass)) {
      try {
        FileWriter csvWriter = new FileWriter(getCredentialsFile(), true);
        int id = (int) (Math.random() * 100);
        csvWriter.append("\n");
        csvWriter.append(id + "," + name + "," + email + "," + password);
        csvWriter.flush();
        csvWriter.close();
        registerPage.printRegistrationSuccessful();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    } else {
      registerPage.passwordMisMatch();
    }
    authMenu();

  }

  @Override
  public void logout() {

  }
}
