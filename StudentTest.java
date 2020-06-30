// create and test Student objects
public class StudentTest {
    public static void main(String[] args) {
        Student account1 = new Student("Paul Kolawole", 95.8);
        Student account2 = new Student("Joshua Nairon", 86.9);

        System.out.printf("%s's letter grade is: %s%n",
                account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n",
                account2.getName(), account2.getLetterGrade());
    }
}
