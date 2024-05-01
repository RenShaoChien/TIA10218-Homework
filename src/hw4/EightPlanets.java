package hw4;

/**
 * ClassName： EightPlanets
 * package：hw4
 * Description：
 *
 * @Author 任少騫
 * @Create 2024/5/1 @{TIME}
 * @Version 1.0
 */
public class EightPlanets {
    String[] str = {"mercury","venus","earth","mars",
            		"jupiter","saturn", "uranus","neptune"};
    
    char[][] c = new char[str.length][];

    public EightPlanets(){

    }

    public void typeConversion(){
        for (int i = 0; i < str.length; i++) {
            c[i] = str[i].toCharArray();
        }
    }

    public int countElements(){
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                if(c[i][j] == 'a' || c[i][j] == 'e' || c[i][j] == 'i' ||
                   c[i][j] == 'o' || c[i][j] == 'u'){
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        EightPlanets ep = new EightPlanets();
        ep.typeConversion();
        System.out.println(ep.countElements());
    }
}
