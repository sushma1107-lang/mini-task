import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("enter name of the student" + (i + 1) + " :");
            names[i] = sc.nextLine();
            System.out.println("enter marks " + names[i] + " :");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("\n______ student details ______");
        for (int i = 0; i < 5; i++) {
            char grade;
            if (marks[i] >= 90)
                grade = 'A';
            else if (marks[i] >= 75)
                grade = 'B';
            else if (marks[i] >= 50)
                grade = 'C';
            else
                grade = 'F';
            System.out.println("Name: " + names[i]);
            System.out.println("Marks: " + marks[i]);
            System.out.println("Grade: " + grade);
            System.out.println("----------------------");
        }

        sc.close();
    }
}
