package org.example.controller;

import org.example.controller.Input.ICategoryController;
import org.example.utilis.StringUtil;
import org.example.view.CategoryPage;

import java.io.*;
import java.util.Scanner;

import static org.example.utilis.FileUtili.getCategoryFile;
import static org.example.utilis.Utilis.println;

public class CategoryController implements ICategoryController {
  CategoryPage categoryPage;

  public CategoryController() {
    categoryPage=new CategoryPage();

  }

  public static void printMenu() {
    println(StringUtil.CATE_WELCOME);
    CategoryPage.printMenu();
    String CategoryName;
    try {
      Scanner sc=new Scanner(getCategoryFile());
      while(sc.hasNext());
      String value=sc.next()

    }catch(IOException e)
    {

    }

  }
}
