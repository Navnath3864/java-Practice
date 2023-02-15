public class GMDemo{
    static <E> void add(E a , E b){
        
        System.out.println(a+" "+b);
    }
    
    public static void main(String[] args) {
        Integer x=123;
        Integer y=321;
        add(x,y); //
        Double d1=3.14;
        Double d2=5.6;
        add(d1,d2);
        String s1="Java";
        String s2="Python";
        add(s1,s2);
    }
}