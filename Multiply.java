public class Multiply extends AbstractBaseClass {
    public Multiply(CommonInterface a, CommonInterface b) {
        super(a, b);
    }

    public int evaluate(int x) {
        return (a.evaluate(x) * b.evaluate(x));
    }
}