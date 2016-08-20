/*
  All information about code below you can read in file README.md
  Всю информацию о коде ниже вы можете прочесть в файле README.md
*/


// "Files.java" category:

//    SearchForText - Preparing...
class SearchForText{
  public static void main(String[] args){
    if(args.length == 2)searchText("");
    else System.out.println("Specify two command line arguments:\nfirst is for file and second for text to search.\nFor example: java SearchForText 'File.txt' 'stringtosearchfor'");
  }
  private static long[] searchText(String fileName, String text){
    long[] textPositions = new long[0];
    return textPositions;
  }
}
