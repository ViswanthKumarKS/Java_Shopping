package org.example.models;

import jdk.jfr.Category;

import java.sql.Timestamp;

public class Product {

  private int id;

  private String title;

  private String desc;

  private double price;

  private int stock;

  private Category category;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;

  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }
}
