import java.util.ArrayList;

public class Amazon_dice {
    public static void main(String[]args){
          dice("",4);
       // System.out.println(diceRet("",4));

    }
    static void dice(String result, int target){
        if(target == 0){
            System.out.println(result);
            return;
        }
        for(int i = 1;i<=6 && i<= target;i++){
            dice(result+i,target-i);
        }
    }

    static ArrayList<String> diceRet(String result, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(result);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1;i<=6 && i<= target;i++){
            list.addAll(diceRet(result+i,target-i));
        }
        return list;
    }
}
