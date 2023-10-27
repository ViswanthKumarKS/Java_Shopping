package org.example.models;

import java.sql.Timestamp;

public class Category {

  private int id;

  private String Categoryname;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCategoryname() {
    return Categoryname;
  }

  public void setCategoryname(String categoryname) {
    Categoryname = categoryname;
  }
}
