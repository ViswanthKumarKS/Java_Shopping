package org.example.controller;

import org.example.controller.Input.IHomeController;
import org.example.utilis.AppException;
import org.example.utilis.StringUtil;
import org.example.view.HomePage;

import static org.example.utilis.AppInput.enterInt;
import static org.example.utilis.AppInput.enterString;
import static org.example.utilis.Utilis.println;

public class HomeController implements IHomeController {

  private final HomePage homePage;
  private final AuthController authController;

  public HomeController(AuthController authController) {
    homePage = new HomePage();
    this.authController = authController;

  }

  public void printMenu() {
    homePage.printMenu();

    try {
      int choice = enterInt(StringUtil.ENTER_CHOICE);
      if (choice == 1) {
        CategoryController.printMenu();
      } else if (choice == 2) {

      } else if (choice == 3) {

      } else if (choice == 4) {

      } else if (choice == 5) {

      } else {
        invalidChoice(new AppException(StringUtil.INVALID_CHOICE));
      }


    } catch (AppException appException) {
      invalidChoice(appException);
    }
  }

  private void invalidChoice(AppException a) {
    println(a.getMessage());
    printMenu();
  }
}
