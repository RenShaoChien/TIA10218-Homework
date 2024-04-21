package hw1;

/**
 * ClassName： HomeWork01
 * package：HomeWork01
 * Description：
 * 1. 請設計一支Java程式，計算12, 6這兩個數值的和與積
 * 2. 請設計一支Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)
 * 3. 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
 * 4. 請定義一個常數為3,1415(圓周率)，並計算半徑為5的圓面積於圓周長
 * 5. 某人在銀行存入150萬，銀行利率為2%，如果每年利息都存入銀行，請用程式計算10年後，本金家利息公有多少錢(用複利計算)
 * 6. 請寫一支程式，利用System.out.println()印出以下三個運算結果：
 *     5 + 5
 *     5 + '5'
 *     5 + "5"
 *     並請用註解個別說明答案的產生原因
 * @Author 任少騫
 * @Create 2024/4/18 @{TIME}
 * @Version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {

//        1. 請設計一支Java程式，計算12, 6這兩個數值的和與積
        int num1 = 12 , num2 = 6;
        int sum = num1 + num2;
        int product = num1 * num2;
        System.out.println("兩數之和為：" + sum);
        System.out.println("兩數之積為：" + product);

//        2. 請設計一支Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)
        int eggs = 200;
        int dozen = eggs / 12;
        int remaining = eggs % 12;
        System.out.println(eggs + "顆雞蛋，總共是：" + dozen + "打又" + remaining + "顆");

//        3. 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
        int totalSec = 256559;
        int day = totalSec / (24 * 60 * 60);
        int remainingSec = totalSec % (24 * 3600);
        int hr = remainingSec / 3600;
        remainingSec %= 3600;
        int min = remainingSec / 60;
        remainingSec %= 60;

        System.out.println(totalSec + "秒為：" + day + "天又" + hr + "小時又" + min + "分鐘又" + remainingSec + "秒");

//        4. 請定義一個常數為3,1415(圓周率)，並計算半徑為5的圓面積於圓周長
        final double PI = 3.1415;
        double radius = 5.0;
        double area = Math.pow(radius , 2) * PI;
        double circ = radius * 2 * PI;
        System.out.printf("圓面積為  %.2f%n" , area);
        System.out.printf("圓周長為  %.2f%n" , circ);

//        5. 某人在銀行存入150萬，銀行利率為2%，如果每年利息都存入銀行，請用程式計算10年後，本金加利息共有多少錢(用複利計算)
        double principal = 1500000;//本金
        double annualInterestRate = 0.02;//年利率
        double year = 10;
        double finalprincipal = principal * Math.pow((1 + (annualInterestRate / year)),year * year);
        System.out.printf("本金加利息共有： %.3f 元%n" , finalprincipal );

//      6. 請寫一支程式，利用System.out.println()印出以下三個運算結果：
//          5 + 5
        System.out.println(5 + 5);//---->10
        //參數型別皆為整數int型，故答案為10。
//          5 + '5'
        int temp = '5';
        System.out.println(temp);//---->'5'對照值為53
        System.out.println(5 + '5');//---->58

//          5 + "5"
        System.out.println(5 + "5");//---->55
        //任何型別變數與String型別變數作 + 運算皆為連結形式
//          並請用註解個別說明答案的產生原因

    }
}
