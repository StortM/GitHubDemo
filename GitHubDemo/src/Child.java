public class Child {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "Child{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Child(){
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
