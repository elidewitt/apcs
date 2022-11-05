public class Encryption {

    private static final char [] ALPHABET = CaesarTester.ALPHABET.toCharArray();

    public static char [] generateCipherAlphabet(int key) {

        char [] cipherAlphabet = new char[ALPHABET.length];

        for (int i = 0; i < cipherAlphabet.length; i++) {
            
            cipherAlphabet[(i - key + ALPHABET.length) % ALPHABET.length] = ALPHABET[i];
        }
        return cipherAlphabet;
    }

    public static String encryptMessage(String input, int key) {
        input = input.trim().toUpperCase();
        char [] cipherAlphabet = generateCipherAlphabet(key);
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char currentLetter = input.charAt(i);
            int currentLetterIndex = CaesarTester.ALPHABET.indexOf(currentLetter);
            // System.out.println(currentLetter);
            if (currentLetterIndex != -1) output += cipherAlphabet[currentLetterIndex];
            else output += " ";
        }
        return output;
    }
}
