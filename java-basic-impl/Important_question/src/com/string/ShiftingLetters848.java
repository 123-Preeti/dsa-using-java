package com.string;

//			Input: s = "abc", shifts = [3,5,9]
//			Output: "rpl"
public class ShiftingLetters848 {
	public String shiftingLetters(String s, int[] shifts) {
		char[] ch = s.toCharArray();
		int cum_shift = 0;
		for (int i = ch.length - 1; i >= 0; i--) {
			cum_shift += shifts[i];
			cum_shift %= 26;
			ch[i] = (char) ((ch[i] - 'a' + cum_shift) % 26 + 'a');
		}
		return String.valueOf(ch);
	}
}
