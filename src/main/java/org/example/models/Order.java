package org.example.models;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class Order {

  private int id;

  private Date date;

  private User user;

  private Cart cart;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Cart getCart() {
    return cart;
  }

  public void setCart(Cart cart) {
    this.cart = cart;
  }
}
