import java.util.HashMap;

public class ScoreReport {
	
	public static void main(String[] args) {
		
		//つくる
		HashMap<String, Integer> apple = new HashMap<>();
		
		//名前とその人の得点を登録
		apple.put("アルファ", 80);
		apple.put("ブラボー", 65);
		apple.put("チャーリー", 92);
		
		
		//それぞれの名前と得点の表示
		for (String name : apple.keySet()) {
			int tmp = apple.get(name);
			System.out.println(name + ": " + tmp + "点");
		}
		
		//合計点
		int sum = 0;
		for (String name : apple.keySet()) {
			int tmp = apple.get(name);
			sum += tmp;
		}
		//平均点
		double tmp2 = apple.size();
		System.out.println("平均点: " + sum/tmp2);
		
		//最高得点
		
		int theBest = 0;
		
		for (String name : apple.keySet()) {
			int tmp = apple.get(name);
			
			if (tmp>theBest) {
				theBest = tmp;
			}

		}
		System.out.println("最高得点: " + theBest);
		
		
	}
}















