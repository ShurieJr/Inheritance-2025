package CA227;

public class PartTimeStudent extends Student{

    PartTimeStudent(){
        super("mohamed");
        System.out.println("Part Time Student no arg- cons");
    }
    public static void main(String[] args) {
        PartTimeStudent pt = new PartTimeStudent();

    }
}
