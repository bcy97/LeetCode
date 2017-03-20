package code;

public class Palindromic {

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
		
		for (int i = 0; i < RL.length; i++) {
			
			int r = 1;
			
			//如果i在最右端遍历范围内
			if(i<=maxRight){
				
				//r为i的半径为对称的点的r和i到最右端的距离的最小值
				r = RL[id]-i+id < RL[2*id-i] ? RL[id]-i+id : RL[2*id-i];
				
				while (newString.charAt(i+r)==newString.charAt(i-r)&&i+r<newString.length()&&i-r>=0) {
					r++;
				}
				
				if (i+r-1>maxRight) {
					maxRight = i+r-1;
					id = i;
				}
				
				RL[i] = r;
			}
		}
		
		int max = 0;
		
		for (int i = 0; i < RL.length; i++) {
			if (max<RL[i]) {
				max = RL[i];
				id = i;
			}
		}
		System.out.println(max);
//		String result = s.substring((id-1)/2-(max/2), (id-1)/2+1+(max/2));
		
		return  null;
	}
}
