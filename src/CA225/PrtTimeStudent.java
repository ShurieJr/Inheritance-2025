package CA225;

public class PrtTimeStudent extends Student{

    PrtTimeStudent(){
        super("Mohamed abdullahi", "Hodan", 20 , 99);
        System.out.println("Part time no arg-cons..");
    }

    public static void main(String[] args) {
        PrtTimeStudent pt = new PrtTimeStudent();
    }
}
