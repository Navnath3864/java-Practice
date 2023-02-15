import java.util.Scanner;
class Box{
	private int length, breadth, height;

	public Box(int length,int breadth,int height){
		this.length=length;
		this.breadth=breadth;
		this.hight=hight;
	}
}
	public class Box3d extends Box{
	void areaOfBox(int length,int breadth,int height){
	int area=2(length*breadth + length*hight + breadth*hight)
	System.out.println("Area : "+area);

	}
	void volumeOfbox(int length,int breadth,int height){
	int volume = length * breadth * hight;
	System.out.println("Volume: "+volume);
	}

	public static void main(String[] args){
		int length, breadth, height; 
		System.out.println("Enter length ,breadth and hight of the box");

		Box3d obj=new Box3d(int length,int breadth,int height);
		obj.areaOfBox();
		obj.volumeOfbox();
	}
	
}