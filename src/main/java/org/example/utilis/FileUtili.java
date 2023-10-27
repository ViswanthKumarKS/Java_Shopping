package org.example.utilis;

import java.io.File;

public  class FileUtili {
  private static File credentialFile;
  private static File categoryFile;

  public static File getCredentialsFile()
  {
    if(credentialFile==null)
      credentialFile=new File("src/main/java/org/example/assests/ceredintals.csv");
    return credentialFile;
  }
  public static File getCategoryFile()
  {
    if(categoryFile==null)
      categoryFile=new File("org/example/assests/categories.csv");
    return categoryFile;

  }

}
