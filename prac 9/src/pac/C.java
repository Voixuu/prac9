package pac;
//1.Можно ли вызвать метод экземпляра или обратиться к переменной экземпляра из статического метода?
//Нет
//2.Можно ли вызвать статический метод или обратиться к статической переменной из метода экземпляра?
//Да
public class C {

    static Circle c = new Circle(2);

    public static void main(String[] args) {
        C instance = new C();
        instance.method1();
    }

    public void method1() {
        method2();
    }

    public static void method2() {
        System.out.println("What is area " + c.getArea()); // Допустимо, так как c теперь статическая
    }
}