public class Variable implements CommonInterface {
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    public int evaluate(int x) {
        return x;
    }
}