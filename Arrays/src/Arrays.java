import java.util.ArrayList;
import java.util.Scanner;
public class Arrays {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        /* syntax of ArrayList   // we can't use primitive type(int) use raper class(Integer/String)
        ArrayList<Integer> list= new ArrayList <> ();
        or
        ArrayList list = new ArrayList ();
         */
        ArrayList<Integer> list = new ArrayList<>(10);
/*        list.add(1000);
        list.add(240);
        list.add(200);
        list.add(43200);
        //System.out.println(list.contains(200)); True
        //update
        System.out.println(list);
        list.set(0,99);
        System.out.println("changing index 0 value: "+list);
        list.remove(1); // will delete 240
        System.out.println("after eletion index 1: "+ list); */
    /*    for (int i=0;i<5;i++){ //user input
            list.add(in.nextInt());
        }
        //System.out.println(list);
        for (int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
*/
    }
}
