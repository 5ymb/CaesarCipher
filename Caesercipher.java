import java.util.*;
import java.io.*;
public class Caesercipher
{
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static String encrypt(String ptext, int cserkey) {
        String ctext = "";

        ptext = ptext.toLowerCase();

        for (int i = 0; i < ptext.length(); i++) {
            int plainnumeric = ALPHABET.indexOf(ptext.charAt(i));

            if (plainnumeric != -1) {
                int ciphernumeric = (plainnumeric + cserkey) % 26;
                char cipherchar = ALPHABET.charAt(ciphernumeric);
                ctext += cipherchar;
            } else {
                ctext += ptext.charAt(i);
            }
        }
        return ctext;
    }
    public static String decrypt(String ctext, int cserkey) {
        String ptext = "";
        ctext = ctext.toLowerCase();

        for (int i = 0; i < ctext.length(); i++) {
            int ciphernumeric = ALPHABET.indexOf(ctext.charAt(i));

            if (ciphernumeric != -1) {
                int plainnumeric = (ciphernumeric - cserkey) % 26;
                if (plainnumeric < 0) {
                    plainnumeric = ALPHABET.length() + plainnumeric;
                }
                char plainchar = ALPHABET.charAt(plainnumeric);
                ptext += plainchar;
            } else {
                ptext += ctext.charAt(i);
            }
        }
        return ptext;
    }

    public static void bruteForce(String ctext) {
        System.out.println("--- BRUTEFORCING THE CODE ---");
        for (int i = 1; i < 26; i++) {
            String result = decrypt(ctext, i);
            System.out.println("Key " + i + ": " + result);
        }
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("CHOOSE AN OPTION:");
        System.out.println("1. Encrypt a message");
        System.out.println("2. Decrypt (I have the key)");
        System.out.println("3. Brute Force (I DO NOT have the key)");

        String choice = br.readLine();
        String textInput;
        int cserkey;

        if (choice.equals("1")) {
            System.out.println("Enter PLAIN TEXT:");
            textInput = br.readLine();
            System.out.println("Enter Key (0-25):");
            cserkey = Integer.parseInt(br.readLine());

            String result = encrypt(textInput, cserkey);
            System.out.println("CIPHER TEXT: " + result);

        } else if (choice.equals("2")) {
            System.out.println("Enter CIPHER TEXT:");
            textInput = br.readLine();
            System.out.println("Enter Key (0-25):");
            cserkey = Integer.parseInt(br.readLine());

            String result = decrypt(textInput, cserkey);
            System.out.println("PLAIN TEXT: " + result);

        } else if (choice.equals("3")) {
            System.out.println("Enter CIPHER TEXT to crack:");
            textInput = br.readLine();

            bruteForce(textInput);
        } else {
            System.out.println("Invalid option.");
        }
    }
}