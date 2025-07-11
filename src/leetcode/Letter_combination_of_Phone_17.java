package leetcode;
import java.util.*;

public class Letter_combination_of_Phone_17 {
	
	static String[] d = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static List<String> letterCombinations(String digits) {

        List<String> list = new ArrayList<>();

        if(digits.length()==0){
            return list;
        }
        helper(digits, list,"");

        return list;
    }

    public static void helper(String digits, List<String> list, String ans) {
        if (digits.length() == 0) {
            list.add(ans);
            return;
        }

        char ch = digits.charAt(0);
        String character = d[ch - '0'];
        for (int i = 0; i < character.length(); i++) {
            helper(digits.substring(1), list, ans + character.charAt(i));
        }
    }
	public static void main(String[] args) {
		String digits="234";
		
		List<String> list = new ArrayList<>();
		
		list = letterCombinations(digits);
		
		System.out.println(list);
		
	}
}
