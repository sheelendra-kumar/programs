package oopsPrograms.encapsulation;

public class testaccount {
    public static void main(String [] args){
        account obj = new account();

        obj.setacc_no(2104134130036l);
        obj.setName("Sherelendra");
        obj.setMob(7505518216l);

        System.out.println("Account Number: "+obj.getAcc_no());
        System.out.println("User Name: "+obj.getName());
        System.out.println("Mob.Number: "+obj.getMob());
    }
}
