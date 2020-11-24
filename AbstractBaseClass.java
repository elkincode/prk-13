public abstract class AbstractBaseClass implements CommonInterface {
    protected CommonInterface a;
    protected CommonInterface b;

    public AbstractBaseClass(CommonInterface a, CommonInterface b) {
        this.a = a;
        this.b = b;
    }
}