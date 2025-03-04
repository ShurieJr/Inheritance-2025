package CA221;

public  class Friut {
    protected String name;
    int age;
    private String address;
    public String tel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Friut() {

    }
    Friut(String name){

    }
    //methods
    void display(){
        System.out.println("Fruit!");
    }
   public final void display(String name){
        System.out.println(name);
    }

}
