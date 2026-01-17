
public class SearchWord {
	public static void main(String args[]) {
		String sentences[] = {"Java is a powerful language","Data structures are important","Linear search is simple","Practice makes perfect"};

	    String word = "java";
	    String ans = findSentence(sentences, word);
	    System.out.println(ans);
	}
	public static String findSentence(String sentences[], String word) {
        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence;
            }
        }

        return "Word Not Found";
    }
}
