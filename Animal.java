/**
 * Created by cjoh7720 on 5/15/2017.
 */
abstract public class Animal {
    protected Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    private int age;
    private String name;
    abstract public String type();

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}