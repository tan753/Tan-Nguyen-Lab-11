import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String name;
        String age;
        String place;

        System.out.print("Hello. What is your name?");
        name = scnr.next();
        System.out.println("It's nice to meet you, " + name + ". How old are you?");
        age = scnr.next();
        System.out.println("I see that you are still quite young at only " + age + "."+ " Where do you live?");
        place = scnr.next();
        System.out.println("Wow! I've always wanted to go to " + place + ". Thanks for chatting with me. Bye! ");

    }
}
