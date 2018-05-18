
import java.util.Scanner;

public class Controller {
    public Controller() {
    }

    //    Constructor
    Model model = new Model();
    View view = new View();

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processSentence() {
        Scanner scanner = new Scanner(System.in);

        inputHello(scanner);
        inputWorld(scanner);
        model.concatenateWords(model.getHello(), model.getWorld());
        view.printMessage(View.READY_SENTENCE + model.getSentence());
    }

    private void inputWorld(Scanner scanner) {
        view.printMessage(View.INPUT_WORLD);
        String word = scanner.next();
        if (word.compareToIgnoreCase("world") == 0) {
            model.setWorld(word);
        } else {
            view.printMessage(View.INPUT_WRONG);
            inputWorld(scanner);
        }
    }

    private void inputHello(Scanner scanner) {
        view.printMessage(View.INPUT_HELLO);
        String word = scanner.next();
        if (word.compareToIgnoreCase("hello") == 0) {
            model.setHello(word);
        } else {
            view.printMessage(View.INPUT_WRONG);
            inputHello(scanner);
        }
    }
}
