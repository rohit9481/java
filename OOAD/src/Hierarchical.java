class Account{
    void personID(){
        System.out.println(214);
    }
}
class SavingAccount extends Account{
    void intarestOfSav(){
        System.out.println("8%");
    }
}
class CurrentAccount extends Account{
    void intarestOfCurr(){
        System.out.println("6%");
    }
}
public class Hierarchical {
    public static void main(String[]args){
        CurrentAccount obj = new CurrentAccount();
        obj.intarestOfCurr();

        SavingAccount objj = new SavingAccount();
        objj.intarestOfSav();
    }
}
