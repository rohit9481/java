import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setValue(1);
        int i = box.getValue();
        System.out.println(i);
    }
}
 */

public class Main {
    public static void main(String[] args) {
        Box<String,Integer> box = new Box<>("Age", 30);
        System.out.println(box.getKey());
        System.out.println(box.getValue());
    }
}
