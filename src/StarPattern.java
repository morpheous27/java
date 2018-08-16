
public class StarPattern {
 
 public void printPattern(){
  for(int i =0;i<3;i++){
   for(int j=0;j<=i;j++){
    System.out.print("*");
   }
   System.out.println();
  }
  // reverse
  for(int k =1;k<=2;k++){
   for(int l=2;l>=k;l--){
  
    System.out.print("*");
   }
   System.out.println();
  }
 
 }
 public static void main(String[] args) {
  StarPattern s= new StarPattern();
  s.printPattern();
 }
}