import java.util.Scanner;
public class UserInput {

    private Scanner userInput;

    public UserInput() { userInput = new Scanner(System.in); }

    public int getInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt + ": ");
                String inputString = userInput.nextLine();
                int inputNum = Integer.parseInt(inputString);
                if (inputNum >= 0) return inputNum;
                else { System.out.println("The Integer Must Be Positive"); }
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Please Enter a Valid Integer");
            }
        }
    }

    public boolean getBoolean(String prompt) {
        while (true) {
            try {
                System.out.println("[0] No");
                System.out.println("[1] Yes");
                System.out.print(prompt + ": ");
                String inputString = userInput.nextLine();
                int inputNum = Integer.parseInt(inputString);
                return inputNum == 1;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Please Enter a Positive Integer");
            }
        }
    }
}
