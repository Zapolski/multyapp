package by.zapolski;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        String username = System.getProperty("user.name");
        System.out.println(greeting.getGreeting(username));
    }
}
