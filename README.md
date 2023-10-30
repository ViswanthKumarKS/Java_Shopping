# Java_Shopping
                     Java-Shopping

This application has the following sections:
  1.Assests
  2.Controlleer
  3.Models
  4.Util
  5.View
  6.App
  In Assests we can contain
   -Cerdentials.csv:
      -It can be stored the details of the user like email,password,name.
   -Category.csv
      It can be contain what are the categories it can be contained.
   -Products.csv
      -It can be contain the product details.

  Controller can be contains
      AppController
      -It contains welcome page and AuthController
      AuthController
      -In Auth controller Contain login and register and validatedUser
      -In register i faced the challenge by reading the file from csv file i have to creater filewrite for entering the deatlis like id,name,password,Reenter password.
     
      
      HomeController
      -In homeController it can  be contain the home welcome 
      -It can contain 5 types
      1.Categories
              CategortyController
      -In CategoryController contains printMenu().
      -In can display the categories it can be having dress and mobile category
      2.Products
              ProductController
        -In  products it can be displayed the what are products given by defaultly.
        -It can be provied the choice and enter the choice and it can be entered by it can be added by add to cart
        In add to cart the product will be added to the cart.
      3.Cart
              CartController
        -By defaultly the cart will be empty.
        -We can print the message the cart is empty
        -After adding the product the it can be provided the productId,name,Totalprice.
        -later it can be provided the Two methods.
            -CheckOut()
               In checkout we can do checkout the cat will be empty and the product will be added successfully in the orders.
          -Back()
               In back we can go back to Home page.
    4.Orders
           OrderController
      -In order controller it can be the product will be orderd is successfully.
      -In order details we can use the date format and what time can be it placed.
      -In order we can go back the order will be placed successfully.
    5.Logout
       In logout we can go back to the login
      Challenges faced:
      -In addtocart i faced the challenges create the new user cart and add the products into the cart and addedinto the cart

      
      
           
      
      
      
    
      
