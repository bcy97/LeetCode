package code;

public class SubString {

	public int subStringMyself(String s){
		
		int slen = s.length();
//		String result = "";
		String temp = "";
		int max = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			char nowChar = s.charAt(i);
			
			if (!temp.contains(nowChar+"")) {
				temp = temp + nowChar;
				if (temp.length()>max) {
					max = temp.length();
//					result = temp;
				}
			}else {
				for (int j = 0; j < temp.length(); j++) {
					if (temp.charAt(j)==nowChar) {
						temp = temp.substring(j+1)+nowChar;
						if (temp.length()>max) {
							max = temp.length();
//							result = temp;
						}
						break;
					}
				}
			}
		}
		
		return max;
	}
}
