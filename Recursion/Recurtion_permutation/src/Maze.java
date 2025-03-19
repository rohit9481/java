import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        //System.out.println(count(3,3));
        //ShowPattern("",3,3);
        System.out.println(ShowPatternRet("",3,3));

     }
    static int count(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left +right;
    }

    static void ShowPattern(String result, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(result);
            return;
        }
        if(r>1){
            ShowPattern(result + 'D', r-1,c);
        }
        if(c>1){
            ShowPattern(result + 'R', r,c-1);
        }
    }

    static ArrayList<String> ShowPatternRet(String result, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String>list = new ArrayList<>();
            list.add(result);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(ShowPatternRet(result + 'D', r-1,c));
        }
        if(c>1){
            list.addAll(ShowPatternRet(result + 'R', r,c-1));
        }
        return list;
    }
}
