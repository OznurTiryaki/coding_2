package day64_july6;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethodOfJava8Collection {

  public static void main(String[] args) {
    
    List<Double> lst = new ArrayList<>();
    lst.add(2d);
    lst.add(5d);
    lst.add(8d);
    lst.add(13d);
    lst.add(12d);
    lst.add(111d);
    lst.add(7d);
    
//    for (Double each : lst) {
//      System.out.println("item value " + each);
//    }
    // foreach method is default method coming from Collection interface 
  lst.forEach(abc -> System.out.println("item value " + abc) );
  
  // remove anything less than 10 ; 
  lst.removeIf( each ->  each<10  ); 
  System.out.println( lst );
  
  // List<WebElement> items =  driver.findElements(By...); 
  //  items.removeIf( each -> each.getText().seeAsNumber < 100)  if after search it, I'm interested just more than 100, 
  // I will remove others  with lambda
    
    
    

  }

}
