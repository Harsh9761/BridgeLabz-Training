import java.util.*;
public class LongestSubString {

	public static void main(String[] args) {
		String s = "abcabcbb";
		Set<Character> map = new HashSet<>();
        int mlen = 0;
        int l = 0;
        for(int r = 0;r<s.length();r++){
            if(!map.contains(s.charAt(r))){
                map.add(s.charAt(r));
                mlen = Math.max(mlen,r-l+1);
            }
            else{
                while(s.charAt(l)!=s.charAt(r)){
                    map.remove(s.charAt(l));
                    l++;
                }
                map.remove(s.charAt(l));
                l++;
                map.add(s.charAt(r));
            }
            

        }
        System.out.println(mlen);

	}

}
