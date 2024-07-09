public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

    
        String[] javaQ1Options = {"JVM", "JRE", "JDK", "JAR"};
        quiz.addQuestion(new Question("Which of these is used to execute Java programs?", javaQ1Options, 0));

        String[] javaQ2Options = {"Bytecode", "Source code", "Machine code", "Binary code"};
        quiz.addQuestion(new Question("What is the intermediate representation of Java code after compilation?", javaQ2Options, 0));

        String[] javaQ3Options = {"public", "protected", "default", "private"};
        quiz.addQuestion(new Question("What is the default access modifier in Java?", javaQ3Options, 2));

        String[] javaQ4Options = {"List", "Map", "ArrayList", "Set"};
        quiz.addQuestion(new Question("Which of these is a class in Java Collections Framework?", javaQ4Options, 2));

        String[] javaQ5Options = {"int", "String", "boolean", "char"};
        quiz.addQuestion(new Question("Which of these is a reference data type in Java?", javaQ5Options, 1));

        String[] javaQ6Options = {"Synchronized", "Static", "Final", "Transient"};
        quiz.addQuestion(new Question("Which keyword is used to prevent inheritance in Java?", javaQ6Options, 2));

        String[] javaQ7Options = {"Checked", "Unchecked", "Runtime", "Compile-time"};
        quiz.addQuestion(new Question("Which type of exceptions must be declared in the method signature?", javaQ7Options, 0));

        String[] javaQ8Options = {"Super", "This", "New", "Instance"};
        quiz.addQuestion(new Question("Which keyword is used to refer to the immediate parent class object?", javaQ8Options, 0));

        String[] javaQ9Options = {"Abstract", "Interface", "Class", "Enum"};
        quiz.addQuestion(new Question("Which construct cannot be instantiated?", javaQ9Options, 0));

        String[] javaQ10Options = {"Polymorphism", "Encapsulation", "Inheritance", "Abstraction"};
        quiz.addQuestion(new Question("Which concept allows an object to take many forms?", javaQ10Options, 0));

        quiz.start();
    }
}
