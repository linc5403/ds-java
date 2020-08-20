public class App {
    public static void main(String [] args) {
        MyList l = new MyList();
        for (int i = 0; i < 10; i++)
            l.add(i);
        l.print();
        System.out.println("Hello");
    }
}
