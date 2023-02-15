class FibonacciDemo{
 public static void main(String[] args) {
 	int num=Integer.parseInt(args[0]);
 	int i,a=0,b=1,temp;
 	for(i=1;i<num;++i){
      temp=a+b;
      a=b;
      b=temp;
      System.out.print(" "+temp);

 	}
 }
}