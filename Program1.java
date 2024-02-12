import java.lang.reflect.Array;
import java.util.Arrays;

class Program1 extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    // your code goes here

    
    int intRead = readInt("");
    int[] intNums = {};
    for (int i = 0; i < intRead; i++){
      int[] intNums2 = Arrays.copyOf(intNums, intNums.length+1);
      intNums2[intNums.length] = readInt("");
      intNums = intNums2;
    }
    for (int i = 0; i < intNums.length;i++){
    int intSave = intNums[i];
    String strEnd = "";
    String strCont = "";
    System.out.println(intNums[i]);
    while (intSave > 11){
      String blah = ""+intSave;
      strEnd = (String) blah.substring(blah.length() - 1);
      strCont = (String) blah.substring(0,blah.length() - 1);
      intSave = Integer.parseInt(strCont) - Integer.parseInt(strEnd) ;
      System.out.println(intSave);
      

    }
    if (intSave == 11){
      System.out.println("The number "+intNums[i]+" is divisible by 11.");
    }
    else if (intSave < 11){
      System.out.println("The number "+intNums[i]+" is not divisible by 11.");
    }
  }
}
}
