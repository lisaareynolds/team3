/**
 * Created by cjoh7720 on 5/15/2017.
 */
public class GoldenRetriever extends Animal implements Dog{
    public GoldenRetriever(int age, String name) {
        super(age, name);
    }
    public String type() {
        return "Golden Retriever";
    }
    public String characteristics() {
        return "A popular breed, easy to train and highly capable and versatile.";
    }
}