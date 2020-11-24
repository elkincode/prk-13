public class TestClass {
    public static void main(String[] args) {
        System.out.println(
                new Add(
                new Substract(
                new Multiply(
                new Variable("x"),
                new Variable("x")
),
                new Multiply(
                new Const(2),
                new Variable("x")
    )
),
                new Const(3)
                ).evaluate(4)
        );
    }
}