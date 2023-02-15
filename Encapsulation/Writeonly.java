//package Encapsulation;
class Writeonlyex{
    private String name;

    public void setName(String name){
        this.name=name;
    }

}
public class Writeonly {
    public static void main(String[] args) {
        Writeonlyex w= new Writeonlyex();
        w.setName("Navnath");
    }
}
