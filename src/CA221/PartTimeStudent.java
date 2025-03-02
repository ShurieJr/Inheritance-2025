package CA221;

public class PartTimeStudent extends Student {

    PartTimeStudent(){
        //super()
        System.out.println("PartTime constructor no-arg");
    }

    public static void main(String[] args) {
        PartTimeStudent pt = new PartTimeStudent();
    }
}
