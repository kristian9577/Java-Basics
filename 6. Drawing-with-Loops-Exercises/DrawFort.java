import java.util.Scanner;

public class DrawFort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());

        int l = n - 2;
        int spaceBody = (2 * n) - 2;
        int bottomLine = n / 2;
        int bottomSpace = (2 * n) - 4 - ((n / 2) * 2);
        int singleTower = ((2 * n) - 2 - bottomSpace) / 2;

        System.out.println(("/"+ repeatStr("^", bottomLine)+"\\"+repeatStr("_", bottomSpace)+
                "/"+repeatStr("^", bottomLine)+"\\"));
        for (int i = 0; i <l ; i++) {
            if(i==(l-1)){
                System.out.println("|"+repeatStr(" ", singleTower)+ repeatStr("_", bottomSpace)
                        +repeatStr(" ", singleTower)+"|");
            }
            else{
                System.out.println("|"+ repeatStr(" ", spaceBody)+"|");
            }
        }
        System.out.println("\\"+repeatStr("_", bottomLine)+"/"+ repeatStr(" ", bottomSpace)
                +"\\"+repeatStr("_", bottomLine)+"/");

    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
