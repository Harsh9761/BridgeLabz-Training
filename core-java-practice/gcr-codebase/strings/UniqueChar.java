import java.util.Scanner;

public class UniqueChar {

    public static char[] uniqueCharacters(String text) {
        int num = text.length();
        char[] character = text.toCharArray();
        String ans = "";

        for (int i = 0; i < num; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < ans.length(); j++) {
                if (character[i] == ans.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
            	ans += character[i];
            }
        }

        return ans.toCharArray();
    }

    public static String[][] frequency(String text) {
        int[] asciiArr = new int[256]; 
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            asciiArr[chars[i]]++;
        }

        char[] uniqueCharacter = uniqueCharacters(text);
        String[][] ans = new String[uniqueCharacter.length][2];
        for (int i = 0; i < uniqueCharacter.length; i++) {
            char ch = uniqueCharacter[i];
            ans[i][0] = String.valueOf(ch);
            ans[i][1] = String.valueOf(asciiArr[ch]);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String[][] freq = frequency(input);

        System.out.println("Character Frequency:");
        for (int i = 0; i < freq.length; i++) {
            System.out.println(freq[i][0] + " : " + freq[i][1]);
        }
    }
}

