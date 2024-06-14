import io.github.amithkoujalgi.ollama4j.core.exceptions.OllamaBaseException;

import java.io.IOException;
import java.util.Scanner;

public class User {

    public static void main(String[] args) throws OllamaBaseException, IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        Model model = new Model();

        String request;

        while(true) {
            System.out.print("Insert the question('bye' to end the chat): ");
            request = scanner.nextLine();

            if (request.equalsIgnoreCase("bye")){
                break;
            }

            model.setPrompt(request);

            System.out.println(model.SqlQuery());
        }

        scanner.close();
    }
}
