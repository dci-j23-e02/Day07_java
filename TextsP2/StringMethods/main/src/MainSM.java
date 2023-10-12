public class MainSM {

  public static void main(String[] args){
      // Java String substring()
    String str1 = "The gold sun is in the heart of the blue sky";

    // extract the sun from the str1
    // extract starting from index 9 to index 11 ( before index 12)
    // string.substring(int startIndex, int endIndex)
    String str2 = str1.substring(9,12);
    //System.out.println(str1); // the original reference is kept
    //System.out.println(str2); // we have only a snapshot as a copy to other variable 'str2'


    // Java String trim()

    String str3 = "    Learning Java is a fun !!!\t";
    System.out.println(str3);
    System.out.println(str3.trim());



  }

}
