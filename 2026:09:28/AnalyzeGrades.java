

// 期末テスト結果集計プログラム
// all is written by me

class AnalyzeGrades {
	
	public static void main(String[] args) {
		
		// data
		String[] lines  = {"0001,山田太郎,80,65,90","0002,田中一郎,55,70,40","0003,斎藤花子,95,88,72"};
		
		// box
		int n = lines.length;
		String[][] eachStudentsData = new String[n][];
		
		//data into box
		for (int i = 0; i < lines.length; i++) {
			eachStudentsData[i] = lines[i].split(",");
		}
		
		// make box of int
		int[][] studentsGrades = new int[n][];
		
		/*
		  
		  山田: [0,0][0,1][0,2]...   [国語][数学][英語]
		  田中: [1,0][1,1][1,2]... = same as above
		  斉藤: [2,0][2,1][2,2]...   same as above
		  
		*/
		
		int[] totals = new int[n];
		 
		for (int i = 0; i < lines.length; i++) {
			studentsGrades[i] = new int[3];
			
			for (int j = 0; j < 3; j++) {
				int k = j + 2;
				studentsGrades[i][j] = Integer.parseInt(eachStudentsData[i][k]);
				
				totals[i] += studentsGrades[i][j];
			}
			
		}
		
		// display each students' total and avarage scores, highest scores and names under 60 points
		
		int highestScores = 0;
		int tmp = 0;
		String[] guyUnder60Points = new String[lines.length];
		int tmptmp = 0;
			
		for (int i = 0; i < lines.length; i++) {
			
			// total and avarage
			System.out.printf("%sの合計点: %d. 平均点: %d\n", eachStudentsData[i][1], totals[i], totals[i]/3);
			
			// highest
			
			for (int j = 0; j < 3; j++) {
				// each subject
				if (highestScores < studentsGrades[i][j]) {
					highestScores = studentsGrades[i][j];
					tmp = i;
				}
				// under60
				
				/*
				if (studentsGrades[i][j] < 60) {
					guyUnder60Points[tmptmp] = studentsGrades[i][1];
					
				}
				*/
			}
			
			//guy who got under 60 points
				
			
		}
		
		// display highest score and its name
		System.out.printf("最高得点%d点を獲得した生徒は%sさんでした\n", highestScores, eachStudentsData[tmp][1]);
		
		// 上のやり方だと、60点未満の科目が2つ以上あるとその人の名前が2回以上登録されるので改善版
		
		// 平均点60点未満の生徒の名前表示
	
		for (int i = 0; i < lines.length; i++) {
			for (int j = 0; j < 3; j++) {
				
				if (studentsGrades[i][j] < 60) {
					guyUnder60Points[tmptmp] = eachStudentsData[i][1];
					j += 100000;
					++tmptmp;
				}
			}
		}
		
		System.out.println("平均点60点以下の民");
		for (int i = 0; i < tmptmp; i++) {
			System.out.printf("%s\n", guyUnder60Points[i]);
		}
		
		
		
		
		
		
	}
	
	
}