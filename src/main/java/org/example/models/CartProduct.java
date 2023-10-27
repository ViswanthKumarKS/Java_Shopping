package org.example.models;

public class CartProduct {

  private Product products;

  private int count;

  public Product getProducts() {
    return products;
  }

  public void setProducts(Product products) {
    this.products = products;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
}
