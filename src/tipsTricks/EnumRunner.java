package tipsTricks;

import java.util.Arrays;

enum Season {
	WINTER(1), SPRING(2), SUMMER(3), FALL(4);
	
	private int value;
	
	private Season(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}

public class EnumRunner {
	
	public static void main(String[] args) {
		Season season = Season.SUMMER;
		
		Season season1 = Season.valueOf("WINTER");
		System.out.println(season1);
		System.out.println(season1.name());
		System.out.println(season1.ordinal());
		
		System.out.println(season1.getValue());
		
		System.out.println(Arrays.toString(Season.values()));
	}
	
}
