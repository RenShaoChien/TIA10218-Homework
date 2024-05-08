package hw5;

import javax.print.attribute.AttributeSetUtilities;

/**
 * ClassName： GenAuthCode
 * package：hw5
 * Description：
 *
 * @Author 任少騫
 * @Create 2024/5/7 @{TIME}
 * @Version 1.0
 */
public class GenAuthCode {

    public static char[] genAuthCode(){
        char[] autoCode = new char[8];
        int i = 0;
        while(i < autoCode.length ){
            int random = (int)(Math.random() * 75) + 48;
            if(random > 57 && random < 65 || random >= 91 && random <= 96){
                continue;
            }
            autoCode[i++] = (char)random;
        }
        return autoCode;
    }

    public static void main(String[] args) {
        char[] genAuthCode = genAuthCode();
        for (int i = 0; i < genAuthCode.length; i++) {
            System.out.print(genAuthCode[i]);
        }
    }
}
