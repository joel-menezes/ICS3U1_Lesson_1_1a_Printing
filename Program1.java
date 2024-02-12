class Program1 extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    // your code goes here

    
    int intRead = readInt("");
    int[] intNums = {readInt("")};
    for (int i = 0; i < intRead; i++){

    }

    int intSave = intRead;
    String strEnd = "";
    String strCont = "";
    System.out.println(intRead);
    while (intSave > 11){
      String blah = ""+intSave;
      strEnd = (String) blah.substring(blah.length() - 1);
      strCont = (String) blah.substring(0,blah.length() - 1);
      intSave = Integer.parseInt(strCont) - Integer.parseInt(strEnd) ;
      System.out.println(intSave);
      

    }
    if (intSave == 11){
      System.out.println("The number "+intRead+" is divisible by 11.");
    }
    else if (intSave < 11){
      System.out.println("The number "+intRead+" is not divisible by 11.");
    }
  }
}
