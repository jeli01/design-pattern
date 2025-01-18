package strategypattern;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        // Strategy A 실행
        context.setStrategy(new ConcreteStrategyA());
        context.executeStrategy();

        // Strategy B 실행
        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy();
    }
}

