package TestLearning;

public class CharacterOccuranceOne {

    public static void main(String[] args) {
        String name = "Helenny Daisya";
        char target = 'e';
        int count = 0;

        for (char c : name.toCharArray()) {
            if (c == target) {
                count++;
            }
        }

        System.out.println("Character '" + target + "' occurred " + count + " times.");
    }
}