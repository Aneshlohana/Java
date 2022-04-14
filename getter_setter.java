public class getter_setter {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        getter_setter obj = new getter_setter();
        obj.setName("Anesh");
        obj.setAge(20);
        System.out.println("My name is " + obj.getName() + " and age is " + obj.getAge());

    }
}
