package code;

public class ZigZagConversion {

	public String conversion(String text , int nRows) {
		
		if (nRows==1) {
			return text;
		}
		
		String result = "";
		
		int gap = 2*nRows-2;
		
		for (int i = 0; i < nRows; i++) {
			int current = i;
			int offset =  gap-2*i;
			
			while (current<text.length()) {
				if (offset!=0) {
					result += text.charAt(current);
					current += offset;
				}
				offset = gap-offset;
			}				
			
		}
		
		return result;
	}
	
}
