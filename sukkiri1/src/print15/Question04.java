package print15;

public class Question04 {
	public static void main(String[] args) {

		String[] country = { "Japan", "Australia", "United States", "China", "Brazil" };
		int[] population = { 126500000, 25500000, 331000000, 1448500000, 215400000 };

		final String FORMAT = "%-14s : %,14d\n";
		/*
		System.out.printf(FORMAT,country[0],population[0]);
		System.out.println();
		System.out.printf(FORMAT,country[1],population[1]);
		System.out.println();
		System.out.printf(FORMAT,country[2],population[2]);
		System.out.println();
		System.out.printf(FORMAT,country[3],population[3]);
		System.out.println();
		System.out.printf(FORMAT,country[4],population[4]);
		*/
		for (int i = 0; i < country.length; i++) {
			System.out.printf(FORMAT, country[i], population[i]);
		}
		System.out.println();
//===========別解=======================================
		
		//国名の最大文字数
		int maxC = 0;
		for (String s : country) {
			maxC = Math.max(maxC, s.length());
		}
		//人口の最大桁数
		int maxP = 0;
		for (int i : population) {
			maxP = Math.max(maxP, i);
		}

		int count = 0;
		while (maxP > 0) {
			count++;
			maxP /= 10;
		}
		count += count/3+1;//　,の数だけ桁数が増える
		final String FORMAT1 = "%%-%%ds:%%,%dd\n".formatted(maxC+1,count);
		//System.out.println(FORMAT);
		for (int i = 0; i < country.length; i++) {
			System.out.printf(FORMAT, country[i], population[i]);
		}
		

	}

}
