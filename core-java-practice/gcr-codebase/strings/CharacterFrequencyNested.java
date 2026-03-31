import java.util.Scanner;

public class CharacterFrequencyNested {
    public static String[] findFrequency(String text) {
        char[] character = text.toCharArray();
        int num = character.length;
        int[] freq = new int[num];
        for (int i = 0; i < num; i++) {
            freq[i] = 1;
        }

        for (int i = 0; i < num; i++) {
            if (character[i] == '0') continue;

            for (int j = i + 1; j < num; j++) {
                if (character[i] == character[j]) {
                    freq[i]++;
                    character[j] = '0';
                }
            }
        }

        int count = 0;
        for (int i = 0; i < num; i++) {
            if (character[i] != '0') count++;
        }

        String[] ans = new String[count];
        int index = 0;
        for (int i = 0; i < num; i++) {
            if (character[i] != '0') {
                ans[index++] = character[i] + " : " + freq[i];
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();
        String[] count = findFrequency(input);

        System.out.println("Character Frequency:");
        for (String string : count) {
            System.out.println(string);
        }

    }
}
