package code;

import java.util.Arrays;

public class LongestCommonPrefix {

	public String solutionMyself(String[] strs) {
		
		if (strs.length==0) {
			return "";
		}
		
		if (strs.length==1) {
			return strs[0];
		}
		
		//找出最小的字符串长度
		int minLen = strs[0].length();
		int minNum = 0;
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length()<minLen) {
				minLen = strs[i].length();
				minNum = i;
			}
		}
		
		int i = 0;
		for (i = 0; i < minLen; i++) {
			
			char last = strs[minNum].charAt(i);
			
			boolean isEnd  =  false;
			
			for (String string : strs) {
				if (string.charAt(i)!=last) {
					isEnd = true;
					break;
				}
			}
			
			if (isEnd) {
				break;
			}
			
		}
		
		return strs[0].substring(0, i);
	}
	
	public String LeetCode(String[] strs) {
		 if(strs == null || strs.length == 0)    return "";
		    String pre = strs[0];
		    int i = 1;
		    while(i < strs.length){
		        while(strs[i].indexOf(pre) != 0)
		            pre = pre.substring(0,pre.length()-1);
		        i++;
		    }
		    return pre;
	}
}
