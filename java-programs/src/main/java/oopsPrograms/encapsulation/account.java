package oopsPrograms.encapsulation;


public class account {
    private long acc_no;
    private String name;
    private long mob;


    public long getAcc_no(){
        return acc_no;
    }
    public void setacc_no(long acc_no){
        this.acc_no = acc_no;
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    public long getMob(){
        return mob;
    }
    public void setMob(long mob){
        this.mob = mob;
    }
}
