/**
 * Created by cjoh7720 on 5/15/2017.
 */
public class Pug extends Animal implements Dog {
    public Pug(int age, String name) {
        super(age, name);
    }
    public String type() {
        return "Pug";
    }
    public String characteristics() {
        return "Smaller breed with minor health problems but very good lapdogs.";
    }
}
