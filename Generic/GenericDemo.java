class MyGen<T>{
T obj;

void set(T obj){
    this.obj=obj;
}
T get(){
    return obj;
}
}
public class GenericDemo{
    public static void main(String[] args) {
        
        MyGen<Integer> m1=new MyGen<Integer>();
        m1.set(199139);
        System.out.println(m1.get());//
        m1.set(10);
        System.out.println(m1.get());
        MyGen<String> m2=new MyGen<String>();
        m2.set("ABC"); // CE
        System.out.println(m2.get());
    }
}