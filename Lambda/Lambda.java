package Lambda;

@FunctionalInterface
interface Demo {
    void show();
}

public class Lambda implements Demo {
    public void show() {
        System.out.println("This is show");
    }

    public static void main(String[] args) {
        // Without Lambda Expression
        Lambda l = new Lambda();
        l.show();

        // By using Lambda Expression
        Demo d = () -> System.out.println("Now I able to use lambda expression");
        d.show();
    }
}
