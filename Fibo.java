class Fibo{
 public static void main(String[] args) {
 	int num=Integer.parseInt(args[0]);
 	int i,a=num,b=1,temp;
 	for(i=b; i<num; ++i){
     
      temp=a+b;
      a=b;
      b=temp;
      System.out.print(" "+temp);

 	}
 }
}