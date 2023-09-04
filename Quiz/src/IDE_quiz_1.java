import java.util.Scanner;

public class IDE_quiz_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String firstName;
        String favouriteFood;
        System.out.println("what's your age? ");
        age = scanner.nextInt();
        System.out.println("what's your name? ");
        firstName = scanner.next();
        System.out.println("what's your favourite food? ");
        favouriteFood = scanner.next();

        System.out.println("First name: " + firstName + "\nage: " + age + "\nFavourite Food: " + favouriteFood);

    }
}
