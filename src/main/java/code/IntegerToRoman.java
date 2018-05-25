package code;

public class IntegerToRoman {

	public String converseMyself(int num) {
		
		String[][] romans = {{"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
				{"","X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
				{"","C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
				{"","M","MM","MMM"}
		};
		
		String result = "";
		int i  = 0;
		
		while (num!=0) {
			result = romans[i][num%10]+result;
			num = num/10;
			i++;
		}
		
		return result;
	}
	
	public String LeetCodeSolution(int num) {
		
		String[] thousand = {"","M","MM","MMM"};
		String[] hundred =  {"","C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String[] ten = {"","X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String[] ones = {"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		
		return thousand[num/1000]+hundred[(num%1000)/100]+ten[(num%100)/10]+ones[num%10];
	}
}
