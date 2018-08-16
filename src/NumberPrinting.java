public class NumberPrinting {
 public void printPattern(){
  int var=1;
  for(int i =0;i<6;i++){
   for(int j =0;j<i;j++){
    System.out.print(var++ + " ");
   }
   System.out.println("");
  }
 }
 
 
 public static void main(String[] args) {
	 NumberPrinting np = new NumberPrinting();
  np.printPattern();
 }

}