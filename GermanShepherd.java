/**
 * Created by cjoh7720 on 5/15/2017.
 */
public class GermanShepherd extends Animal implements Dog{
    public GermanShepherd(int age, String name) {
        super(age, name);
    }
    public String type() {
        return "German Shephard";
    }
    public String characteristics() {
        return "Strong capable breed with special aptitude for service and rescue.";
    }
}