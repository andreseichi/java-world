import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        User user = new User();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Let's create your profile!");
            System.out.println("====================================");

            System.out.print("Enter your name: ");
            String userName = scanner.nextLine();

            System.out.print("Enter your email: ");
            String userEmail = scanner.nextLine();

            System.out.print("How old are you? ");
            int userAge = scanner.nextInt();

            user.setName(userName);
            user.setEmail(userEmail);
            user.age = userAge;

            System.out.println("====================================");
            System.out.println("Your profile has been created!");

            System.out.println("Let's create your subject!");
            System.out.println("====================================");

            System.out.print("Enter the subject name: ");
            scanner.nextLine();
            String subjectName2 = scanner.nextLine();

            System.out.print("Enter the subject credits: ");
            int subjectCredits = scanner.nextInt();

            System.out.print("Enter the subject hours: ");
            int subjectHours = scanner.nextInt();

            Subject subject = new Subject();
            subject.name = subjectName2;
            subject.setCredits(subjectCredits);
            subject.setHours(subjectHours);

            user.setSubject(subject);

            System.out.println("====================================");
            System.out.println("Your subject has been created!");
            System.out.println("Your info:");
            user.printUserInfo();

            System.out.println();
            scanner.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
