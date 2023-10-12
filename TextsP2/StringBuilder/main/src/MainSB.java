public class MainSB {

  public static void main(String[] args){
    // Declare the string builder instance using the constructor and passing the value inside
      StringBuilder x = new StringBuilder("Hello World !!!");
      // System.out.println(x);


    // Declare the str1 instance without initialization
    StringBuilder y = new StringBuilder();
    //System.out.println(y); // 'y' is an empty string
    // using str1.append() method for initialization
    y.append("Hello World"); // adding the "Hello World" to the end of the original reference 'y'
   // System.out.println(y);

    y.append(" from Java course"); // StringBuilder instances are mutable
    //System.out.println(y);


    // Create a StringBuilder object with capacity
    StringBuilder z  = new StringBuilder(10);
   // System.out.println(z);
    // System.out.println("The Capacity of z is: " + z.capacity());
    z.append("123456789A1");// System.out.println("The Capacity of z is: " + z.capacity());
    //capacity without being predefined
    StringBuilder k  = new StringBuilder();
    System.out.println(k.capacity());
    System.out.println(k.length());
    k.append("abcdefgijklmnosbrt123456789qwert11pqwertzuiio");
    System.out.println(k.capacity());
    System.out.println(k.length());


  }

}
