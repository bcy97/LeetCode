package code;

public class StringToInt {

	public int stringToInt(String str) {
		if (str==null||str.trim().equals("")) {
			return  0;
		}
		
		str = str.trim();
		
		char sign = str.charAt(0);
		//判断非空第一位是否有效
		if (sign<'0'||sign>'9') {
			if (sign!='-'&&sign!='+') {
				return 0;
			}
		}
		
		//如果有效删除该字符
		if (sign=='-'||sign=='+') {
			str = str.substring(1);
		}
		
		int i = 0;
		String num = "";
		while (i<str.length()&&str.charAt(i)>='0'&&str.charAt(i)<='9') {
			num += str.charAt(i);
			i++;
		}

		int result = 0;
		for (int j = 0; j < num.length(); j++) {
			if (result+(num.charAt(j)-'0')*Math.pow(10, num.length()-j-1)>Integer.MAX_VALUE) {
				if (sign=='-') {
					return Integer.MIN_VALUE;
				}
				return Integer.MAX_VALUE;
			}else {
				result += (num.charAt(j)-'0')*(int)Math.pow(10, num.length()-j-1);
			}
		}
		
		if (sign=='-') {
			result *= -1;
		}
		return  result;
	}
}
