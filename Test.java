/*
  All information about code below you can read in file README.md
  Всю информацию о коде ниже вы можете прочесть в файле README.md
*/


// "Files.java" category:
//
//    SearchForText - Preparing...
class SearchForText{
  public static void main(String[] args){
    System.out.print("Filename: "); String fileName = "";
    try{
      int c;
      while((c=System.in.read())!=10)
        fileName+=(char)c;
      if(fileName.charAt(fileName.length()-1)==13)
        fileName=fileName.substring(0,fileName.length()-1);
    }catch(java.io.IOException ioe){
      System.out.println("Error while reading filename!");
      return;
    }
    System.out.println("Text to search(\"stopinput\" - to stop): "); String[] text = new String[0];
    try{
      int c;
      while(true){
        String ntext = "";
        while((c=System.in.read())!=10)
          ntext+=(char)c;
        if(ntext.charAt(ntext.length()-1)==13)
          ntext=ntext.substring(0,ntext.length()-1);
        if(ntext.equals("stopinput"))break;
        String[] nt = new String[text.length+1];
        for(int d = 0; d < text.length; d++)
         nt[d] = text[d];
        nt[nt.length-1] = ntext;
      }
    }catch(java.io.IOException ioe){
      System.out.println("Error while reading text to search!");
      return;
    }
    searchText(fileName,text);
  }
  
  
  private static long[][] searchText(String fileName, String[] text){
    long[] textPositions = new long[text.length()][0];
    return textPositions;
  }
}
