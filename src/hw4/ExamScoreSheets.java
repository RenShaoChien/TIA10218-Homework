package hw4;

/**
 * ClassName： ExamScoreSheets
 * package：hw4
 * Description：
 *
 * @Author 任少騫
 * @Create 2024/5/1 @{TIME}
 * @Version 1.0
 */
public class ExamScoreSheets {
    private int[][] stuExer;
    int[] highScoreCount = new int[8];

    public ExamScoreSheets(){
        stuExer = new int[][]{{10, 35, 40, 100, 90, 85, 75, 70},
                {37, 75, 77, 89, 64, 75, 70, 95},
                {100, 70, 79, 90, 75, 70, 79, 90},
                {77, 95, 70, 89, 60, 75, 85, 89},
                {98, 70, 89, 90, 75, 90, 89, 90},
                {90, 80, 100, 75, 50, 20, 99, 75}};
    }

    public void compareHighScore() {
        for (int i = 0; i < stuExer.length; i++) {
            int highScore = Integer.MIN_VALUE;
            for (int j = 0; j < stuExer[i].length; j++) {
                if (highScore < stuExer[i][j]) {
                    highScore = stuExer[i][j];
                }
            }
            for (int j = 0; j < stuExer[i].length; j++) {
                if (stuExer[i][j] == highScore) {
                    highScoreCount[j]++;
                }
            }
        }
    }
        public void printHighScoreCount(){
            for (int i = 0; i < highScoreCount.length; i++) {
                System.out.println(i + 1 + "號同學考最高分的次數是" + highScoreCount[i] + "次");
        }
    }
    public static void main(String[] args) {
        ExamScoreSheets ess = new ExamScoreSheets();
        ess.compareHighScore();
        ess.printHighScoreCount();
    }
}
