package code;

public class ContinerWithMostWater {

	public int solutionMyself(int[] height){
		int pr = height.length-1,pl = 0;
		int max  = 0,bottle_height = 0;
		while (pl<pr) {
			bottle_height = height[pl]<height[pr] ? height[pl++] : height[pr--];
			max = (bottle_height*(pr-pl+1))>max ? (bottle_height*(pr-pl+1)) : max;
		}
		
		return max;
	}
}
