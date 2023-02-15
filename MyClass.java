public class MyClass {

    String a;

    public MyClass(String ab) {
        a = ab;
    }

    public boolean equals(MyClass object1) {
        if(a == object1) { 
            return true;
        }
        else return false;
    }

    public boolean equals2(Object object2) {
        if(a.equals(object2)) {
            return true;
        }
        else return false;
    }



    public static void main(String[] args) {

        MyClass object1 = new MyClass("test");
        MyClass object2 = new MyClass("test");
        MyClass object3 = new MyClass("test");


        object1.equals(object2);
        System.out.println(object1.equals(object2));

        object1.equals2(object2);
        System.out.println(object1.equals2(object2));
    }


}