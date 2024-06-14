package Lambda;

interface Apple {
    public abstract int sum(int a, int b);
}

interface Ball {
    public abstract int demo(int a);
}

public class LambdaWithArguments {
    public static void main(String[] args) {
        Apple l = (a, b) -> a + b;

        int ans = l.sum(2, 9);
        System.out.println(ans);

        Ball b = a -> a / 2;
        System.out.println(b.demo(ans));
    }
}
