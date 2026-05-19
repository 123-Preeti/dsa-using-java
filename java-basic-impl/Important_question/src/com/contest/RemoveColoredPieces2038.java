package com.contest;

public class RemoveColoredPieces2038 {
	public boolean winnerOfGame(String colors) {
		int cntA = 0, cntB = 0;
		for (int i = 1; i < colors.length() - 1; i++) {
			if (colors.charAt(i) == 'A' && colors.charAt(i - 1) == 'A' && colors.charAt(i + 1) == 'A')
				cntA++;
			if (colors.charAt(i) == 'B' && colors.charAt(i - 1) == 'B' && colors.charAt(i + 1) == 'B')
				cntB++;
		}

		return cntA > cntB;
	}
}

/*
 * Input: colors = "AAABABB" Output: true Explanation: AAABABB -> AABABB Alice
 * moves first. She removes the second 'A' from the left since that is the only
 * 'A' whose neighbors are both 'A'.
 * 
 * Now it's Bob's turn. Bob cannot make a move on his turn since there are no
 * 'B's whose neighbors are both 'B'. Thus, Alice wins, so return true.
 */