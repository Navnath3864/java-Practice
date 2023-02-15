import java.io.FileOutputStream;

class FileOutPutStream{
	 public static void main(String[] args) throws Exception {
	 	FileOutputStream obj = new FileOutputStream ("FileOutPut.txt");
	 	String str= "Navnath";
	 	byte b[] = str.getBytes();
	 	obj.write(b);

	 	obj.close();

	 	System.out.println("Successfully done");

	 }
}