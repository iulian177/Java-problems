import java.util.*;
//89 Encryption program
//CAESAR CIPHER IN JAVA
// the program(from "Bro code" 's yt tutorial) is modified to save the values
public class EncryptionProgram {

    //declare them
    //private for better security
    private Scanner scanner;
    private Random random;
    private ArrayList<Character> list;
    private ArrayList<Character> shuffledList;
    private char character;
    //private String line;
    private char[] letters;
    //private char[] secretLetters;
    public EncryptionProgram() {
         //initialized them
         scanner = new Scanner(System.in);
         random = new Random();
         list = new ArrayList<>();
         shuffledList = new ArrayList<>();
         //this is going to change
         character = ' ';

         newKey();
         askQuestion();
    }
    private void askQuestion() {

        while(true) {
            System.out.println("*****************************");
            System.out.println("What do you want to do?");
            System.out.println("(N)ewKey, (G)etKey, (E)ncrypt, (D)ecrypt, (S)ave, (Q)uit");
            char response = Character.toUpperCase(scanner.nextLine().charAt(0));

            switch (response) {

                case 'N' :
                    newKey();
                    break;
                case 'G' :
                    getKey();
                    break;
                case 'E' :
                    encrypt();
                    break;
                case 'D' :
                    decrypt();
                    break;
                case 'S' :
                    save();
                    break;
                case 'Q' :
                    quit();
                    break;
                default:
                    System.out.println("Not a valid answer.");
            }
        }

    }
    //void in loc de ArrayList...
    private ArrayList<Character> newKey() {
        //kind like a reset
        character = ' ';
        list.clear();
        shuffledList.clear();

        //all ASCII table ordered
       for (int i = 32; i < 127; i++) {
           list.add(Character.valueOf(character));
           character++;
       }
       //copy of the "list"
       shuffledList = new ArrayList<>(list);
       //shuffle the elements
        Collections.shuffle(shuffledList);
        System.out.println("A new key has been generated.");
        return shuffledList;
    }
    private void getKey() {
        System.out.println("Key: ");
        for (Character x : list) {
            System.out.print(x);
        }
        System.out.println();
        for (Character x : shuffledList) {
            System.out.print(x);
        }
        System.out.println();
    }
    //void in loc de char[]
    private char[] encrypt() {
        System.out.println("Enter a new message to be encrypted: ");
        String message = scanner.nextLine();
        //put the message chars in an array
        letters = message.toCharArray();

        //iterate throught the letters array
        for (int i = 0; i < letters.length; i++) {
            //iterate throught the ASCII table
            for (int j = 0; j < list.size(); j++) {
                if (letters[i] == list.get(j)) {
                    //replace the current char with the corresponding one from the current key
                    letters[i] = shuffledList.get(j);
                    break;
                }
            }
        }
        System.out.println("Encrypted: ");
        for (char x : letters) {
            System.out.print(x);
        }
        System.out.println();

        return letters;
    }
    private void decrypt() {

        System.out.println("Enter a new message to be decrypted: ");
        String message = scanner.nextLine();
        //put the message chars in an array
        letters = message.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            //reverse the encrypt process
            for (int j = 0; j < shuffledList.size(); j++) {
                if (letters[i] == shuffledList.get(j)) {
                    //replace the current char with the corresponding one from the current key
                    letters[i] = list.get(j);
                    break;
                }
            }
        }
        System.out.println("Decrypted: ");
        for (char x : letters) {
            System.out.print(x);
        }
        System.out.println();

    }
    private void quit() {

        System.out.println("Thank you, have a nice day!");
        System.exit(0);
    }
    //void in loc de Hashmap
    private HashMap save() {

        HashMap<ArrayList<Character>, char[]> savedValue = new HashMap<>();

        // Add keys and values
        savedValue.put(shuffledList, letters);


        System.out.println("Values saved successfully! ");
        System.out.println("Now quit the program. ");
        //the key
        //System.out.println(shuffledList);
        //the encrypted message
        //System.out.println(letters);
        System.out.println(savedValue.get(shuffledList));

        return savedValue;
    }
}
