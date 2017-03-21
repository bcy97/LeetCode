package code;

public class Palindromic {
	
	private int lo, maxLen;

	public String longestPalindrome(String s) {
		
		if (s==null) {
			return null;
		}
		
		String newString = "#";
		
		for (int i = 0; i < s.length(); i++) {
			newString += s.charAt(i)+"#";
		}

		int[] RL = new int[newString.length()];
		int maxRight = -1;
		int id = -1;
		int maxId = 0;
		int max = 0;

		for (int i = 0; i < RL.length; i++) {

			int r = 1;
			
			//如果i在最右端遍历范围内
			if(i<=maxRight){
				
				//r为i的半径为对称的点的r和i到最右端的距离的最小值
				r = RL[id]-i+id < RL[2*id-i] ? RL[id]-i+id : RL[2*id-i];
				
				while (i+r<newString.length()&&i-r>=0&&newString.charAt(i+r)==newString.charAt(i-r)) {
						r++;
				}
				
				if (i+r-1>maxRight) {
					maxRight = i+r-1;
					id = i;
				}
				
			}else {
				
				while (i+r<newString.length()&&i-r>=0&&newString.charAt(i+r)==newString.charAt(i-r)) {
						r++;
				}
				if (r+r-1>maxRight) {
					maxRight =  i+r-1;
					id  = i;
				}
			}
			
			RL[i] = r;
			
			if (r>max) {
				max = r;
				maxId = i;
			}
		}

		String result = s.substring((maxId-max+1)/2, (maxId+max)/2);

		return  result;
	}

	public String leetCodePassed(String s){
		int len = s.length();
		if (len < 2)
			return s;
		
	    for (int i = 0; i < len-1; i++) {
	     	extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
	     	extendPalindrome(s, i, i+1); //assume even length.
	    }
	    return s.substring(lo, lo + maxLen);
	}
	
	private void extendPalindrome(String s, int j, int k) {
		while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
			j--;
			k++;
		}
		if (maxLen < k - j - 1) {
			lo = j + 1;
			maxLen = k - j - 1;
		}
	}
}
