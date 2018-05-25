package code;

public class ReverseInteger {

	public int reverseMyself(int x) {
		
		
		String num = x+"";
		String newNum = "";
		if (x<0) {
			newNum = "-";
			num = num.substring(1);
		}

		for (int i = num.length()-1; i >= 0; i--) {
			newNum += num.charAt(i);
		}
		
		long result = Long.parseLong(newNum);
		
		if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE){
			return 0;
		}
		
		return (int)result;
		
	}
	
	public int reverseLeetCode(int x){
		
		int result = 0;
		while (x!=0) {
			result = result*10+x%10;
			x = x/10;
		}
		if (result>Integer.MAX_VALUE||result<Integer.MIN_VALUE) {
			return 0;
		}
		
		return result;
	}
	
}
