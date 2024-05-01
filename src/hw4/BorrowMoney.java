package hw4;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * ClassName： BorrowMoney
 * package：hw4
 * Description：
 *
 * @Author 任少騫
 * @Create 2024/5/1 @{TIME}
 * @Version 1.0
 */
public class BorrowMoney {
    public static void main(String[] args) {
        Employees wen = new Employees();
        Employees[] emp = new Employees[5];
        emp[0] = new Employees();
        emp[0].empId = 25; emp[0].money = 2500;

        emp[1] = new Employees();
        emp[1].empId = 32; emp[1].money = 800;

        emp[2] = new Employees();
        emp[2].empId = 8;  emp[2].money = 500;

        emp[3] = new Employees();
        emp[3].empId = 19; emp[3].money = 1000;

        emp[4] = new Employees();
        emp[4].empId = 27; emp[4].money = 1200;
        wen.sift(emp);
    }
}

class Employees{
    Scanner sc = new Scanner(System.in);
    int borrowMoney;
    int empId;
    int money;
    public Employees(){
    }

    public void sift(Employees[] emp){
        System.out.println("窮鬼阿文要借多少錢：");
        borrowMoney = sc.nextInt();
        int count = 0;
        System.out.print("員工編號：");
        for (int i = 0; i < emp.length; i++) {
            if(borrowMoney <= emp[i].money){
                count++;
                System.out.print(emp[i].empId + " ");
            }
        }
        System.out.print("共有" + count + "人！");
        sc.close();
    }
}