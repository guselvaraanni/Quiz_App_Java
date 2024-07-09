import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
            int userAnswer = getUserAnswer(scanner, options.length);
            if (question.isCorrectAnswer(userAnswer - 1)) {
                score++;
            }
        }
        System.out.println("Your score: " + score + "/" + questions.size());
        scanner.close();
    }

    private int getUserAnswer(Scanner scanner, int numberOfOptions) {
        int userAnswer;
        while (true) {
            System.out.print("Your answer: ");
            if (scanner.hasNextInt()) {
                userAnswer = scanner.nextInt();
                if (userAnswer >= 1 && userAnswer <= numberOfOptions) {
                    break;
                }
            }
            scanner.nextLine(); // Clear invalid input
            System.out.println("Invalid input. Please enter a number between 1 and " + numberOfOptions + ".");
        }
        return userAnswer;
    }
}
