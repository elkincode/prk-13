public class Const implements CommonInterface {
    private final int x;

    public Const(int x) {
        this.x = x;
    }

    public int evaluate(int x) {
        return this.x;
    }
}