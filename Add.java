public class Add extends AbstractBaseClass {
    public Add(CommonInterface a, CommonInterface b) {
        super(a,b);
    }

    public int evaluate(int x) {
        return a.evaluate(x) + b.evaluate(x);
    }
}