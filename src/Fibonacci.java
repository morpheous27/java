public class Fibonacci {
 
 public void fibonacci(){
  int first=0;
  int second =1;
  
  for(int i =0;i<10 ;i++){
   int sum = first+second;
   System.out.print((sum) + " ");
   first=second;
   second=sum;
  }
  
 }
 
 public static void main(String[] args) {
  Fibonacci fb = new Fibonacci();
  fb.fibonacci();
  
 }

}


