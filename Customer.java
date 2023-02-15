 class Customer{
	private int cid;
	private String cname;
	private double balence;
	private String city;
	private  static String sbi ="SBI" ;

	public Customer(int cid,String cname,double balence,String city){
		this.cid=cid;
		this.cname=cname;
		this.balence=balence;
		this.city=city;
	}
	void getCustomer(){
		System.out.println(cid+""+cname+""+balence+""+city+""+sbi);
	}
	void simpleInterest(){
		//this.balence=balence;
		double si;
		si=(balence*5*8.85)/100;
		System.out.println("simple interest = "+si);
	}


	class ClassicCustomer extends Customer{
	void withdraw(){
	double withdrawamaount;
	Scanner sc=new Scanner(System.in);
	withdrawamaount=sc.nextInt();
	final double LIMIT=10000;
	if(withdrawamaount>LIMIT){
		System.out.println("Your withdrawamaount limit is 10000 only. plz Enter Correct amount");
	}
	else{
		balence=balence-withdrawamount;
		System.out.println("Your Transaction of "+withdrawamaount+" is completed");
	}
}
}
public static void main(String[] args) {
		Customer c1=new Customer(111,"Navnath",100000,"Pune");
		c1.getCustomer();
		c1.simpleInterest();
		ClassicCustomer c2=new ClassicCustomer();
		c2.withdraw(1000);

		
	}

}

