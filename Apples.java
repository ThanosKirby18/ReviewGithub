//this is the reference class
class Apple
{
  private String type;
  private double size;
  private boolean isTart;


  public Apple()
  {
    type = null;
    size = 0;
    isTart = false;
  }
  //toString
  public String toString()
  {
  String output = "Type " +
  type + "\nSize(inches diameter) " + size + "\nIs it Tart? " + isTart;
  return output;
  }
}