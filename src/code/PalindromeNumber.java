package code;

public class PalindromeNumber {

	public boolean palidromeNumber(int x){
		//初始错误条件为负数和大于等于10且末尾为0的数
        if(x<0||(x>=10&&x%10==0)) return false;
        int temp = 0;
        while(x>temp){
            temp  = temp*10+x%10;
            x  = x/10;
        }
        
        if(x==temp||x==temp/10){
            return true;
        }
        
        return false;
	}
}
