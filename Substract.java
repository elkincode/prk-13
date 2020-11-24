public class Substract extends AbstractBaseClass {
    public Substract(CommonInterface a, CommonInterface b) {
        super(a, b);
    }

    public int evaluate(int x) {
        return (a.evaluate(x) - b.evaluate(x));
    }
}