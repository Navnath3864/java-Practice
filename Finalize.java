public class Finalize{
	public void finalize(){
		System.out.println("GC Invoked");
	}
	public static void main(String [] args){
		Finalize [] gc = new  Finalize[5];
		for(int i=0;i<5;i++){
			gc[i]=new Finalize();
		}
		gc= null;

		System.gc();
	}
}