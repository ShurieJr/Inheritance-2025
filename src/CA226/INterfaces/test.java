package CA226.INterfaces;

public class test implements MyInterface , Interface2{


    public void displayText() {
        System.out.println("Test DisplayText!");
        System.out.println(Interface2.CODE);
    }
    public int displayText2() {
        System.out.println("Test DisplayText!");
        return 0;
    }

    @Override
    public void printInfo() {
        System.out.println("test print info");
    }

}
