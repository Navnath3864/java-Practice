
class Display {
    
    synchronized public void dispNos(){
        for(int i=1;i<=26;i++){
            System.out.print(i+" ");
            try{
                Thread.sleep(400);
            }catch(Exception e){}
        }
        System.out.println();
    }
    synchronized public void dispAlphaC(){
        for(int i=65;i<=90;i++){
            System.out.print((char)i+" ");
             try{
                Thread.sleep(400);
            }catch(Exception e){}
        }
         System.out.println();
    }
   synchronized public void dispAlphaS(){
        for(int i=97;i<=122;i++){
            System.out.print((char)i+" ");
             try{
                Thread.sleep(400);
            }catch(Exception e){}
        }
         System.out.println();
    }
}

public class DisplayThreadDemo {
    public static void main(String[] args) {
        Display d=new Display();
        //first thread
        new Thread(){
            public void run(){
               d.dispNos();
            }
        }.start();
        //second thread
        new Thread(){
            public void run(){
                d.dispAlphaC();
            }
        }.start();
         // third thread
         new Thread(){
            public void run(){
                d.dispAlphaS();
            }
        }.start();
    } 
}
