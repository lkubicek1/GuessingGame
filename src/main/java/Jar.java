import java.util.Random;

public class Jar{
  private String itemName;
  private int maxItems;
  private int actualItems;
  Random rand = new Random();
  
  public Jar(String itemName, int maxItems){
    this.itemName = itemName;
    this.maxItems = maxItems;
  }
  
  public void fill(){
    this.actualItems = rand.nextInt(this.maxItems) + 1;
  }
  
  public String getItemName(){
    return this.itemName;
  }
  
  public int getMaxItems(){
    return this.maxItems;
  }
  
  public int getActualItems(){
    return this.actualItems;
  }  
}