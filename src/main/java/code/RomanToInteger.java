package code;

import java.util.HashMap;

public class RomanToInteger {

	public int converseMyself(String s){
		HashMap<String, Integer> romanChars = new HashMap<>();
		romanChars.put("I", 1);
		romanChars.put("V", 5);
		romanChars.put("X", 10);
		romanChars.put("L", 50);
		romanChars.put("C", 100);
		romanChars.put("D", 500);
		romanChars.put("M", 1000);
		
		int result = 0;
		
		for (int i = 0; i < s.length(); i++) {
			Integer nowCharValue = romanChars.get(s.charAt(i)+"");
			if (i<s.length()-1&&nowCharValue<romanChars.get(s.charAt(i+1)+"")) {
				result -= nowCharValue;
			}else {
				result += nowCharValue;
			}
		}
		
		return result;
	}
	
	public int newConverseMyself(String s) {
		int[] nums = new int[s.length()];
		for (int i = 0; i < nums.length; i++) {
			switch (s.charAt(i)) {
			case 'I':
				nums[i] = 1;
				break;
				
			case 'V':
				nums[i] = 5;
				break;
				
			case 'X':
				nums[i] = 10;
				break;
				
			case 'L':
				nums[i] = 50;
				break;
				
			case 'C':
				nums[i] = 100;
				break;
				
			case 'D':
				nums[i] = 500;
				break;
				
			case 'M':
				nums[i] = 1000;
				break;

			default:
				break;
			}
		}
		
		int result = 0 ;
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i]<nums[i+1]) {
				result -= nums[i];
			}else {
				result += nums[i];
			}
		}
		
		return result+nums[nums.length-1];
	}
	
	public int LeetCodeSolution(String s) {
		int result = 0 ;
		  char[] digits = s.toCharArray();
		  if(digits.length > 0){
            /* Initialize value map for Roman chars  */
			  int[] valueMap = new int[26];
			  valueMap['I' - 'A'] = 1;
			  valueMap['V' - 'A'] = 5;
			  valueMap['X' - 'A'] = 10;
			  valueMap['L' - 'A'] = 50;
			  valueMap['C' - 'A'] = 100;
			  valueMap['D' - 'A'] = 500;
			  valueMap['M' - 'A'] = 1000;
			  int lastIndex = digits[0] - 'A';
			  result = valueMap[lastIndex];
			  for(int i = 1 ; i < digits.length ; i++){
				  int currentIndex = digits[i] - 'A'; 
                // If previous number was smaller in value then remove the previous and decrease the current value by previous value
				  if(valueMap[lastIndex] < valueMap[currentIndex]){ 
					  result = result - 2*valueMap[lastIndex] + valueMap[currentIndex] ;
				  }else{
					  result+= valueMap[currentIndex]; // just add the current value
				  }
				  lastIndex = currentIndex; // update last index
			  }
		  }
		  return result;
	}
}
