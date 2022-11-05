/**
 * @author Eli DeWitt
 * @version 3/9/22
 * 
 * The purpose of this program is to take user input and apply a caesar cipher
 * to a message given by the user. We practived using final variables.
 * 
 * @PMR The instructions were a alittle unclear about where to put certain things.
 * But I got the program completing the objective. I will admit that if I wasn't
 * following the instructions, it would be a little more robust (I don't think we
 * need the Decryption class, just make the methods a part of the encryption class)
 */

import java.util.Scanner;
public class CaesarTester {

    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void main(String [] args) {
        Boolean validResopnse = false;
        Scanner keyboardInput = new Scanner(System.in);

        // ask user for an encryption key
        int key = -1;
        while (key < 0 || key > 25) {
            try {
                System.out.print("Enter Cipher Key (0-25): ");
                key = Integer.parseInt(keyboardInput.nextLine());
                 if (key >= 0 || key <= 25) validResopnse = true;
                 else System.out.println("Cipher Key Must be between 0 and 25");
            } catch (Exception e) {
                // System.out.println(e);
                System.out.println("Please Enter a Valid Number\n");
                key = -1;
            }
        }
        
        // get cipher alphabet
        char [] cipherAlphabet = Encryption.generateCipherAlphabet(key);

        // print alphabets
        System.out.println("Alphabet: " + ALPHABET);
        System.out.println("Cipher Alphabet: " + cipherAlphabet);

        // user input for encrypt/decrypt
        validResopnse = false;
        int encryptionMode = -1;

        // ask user for input message
        boolean loop = true;
        
        while (loop) {
            while (!validResopnse) {
                try {
                    System.out.println("Are you encrypting or decrypting?");
                    System.out.println("[0] Quit");
                    System.out.println("[1] Encrypting");
                    System.out.println("[2] Decrypting");
                    System.out.print("Response: ");
                    encryptionMode = Integer.parseInt(keyboardInput.nextLine());
                    if (encryptionMode == 0 || encryptionMode == 1 || encryptionMode == 2) validResopnse = true;
                    else System.out.println("Response must be 0, 1, or 2");
                } catch(Exception e) {
                    System.out.println("Please Enter a Valid Number\n");
                    encryptionMode = -1;
                }
            }

            if (encryptionMode == 1) {
                System.out.print("Enter the message you would like to encrypt: ");
                String message = keyboardInput.nextLine();
                System.out.println("Encrypted Message: " + Encryption.encryptMessage(message, key));
            } else if (encryptionMode == 2) {
                System.out.print("Enter the message you would like to decrypt: ");
                String message = keyboardInput.nextLine();
                System.out.println("Decrypted Message: " + Decryption.decryptMessage(message, key));
            } else {
                loop = false;
            }
            System.out.println();
            validResopnse = false;
        }
        keyboardInput.close();
    }
}
