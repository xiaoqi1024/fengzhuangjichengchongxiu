package jicheng;

public class stdent extends user{
    private String zhuanye;
    public String getZhuanye() {
        return zhuanye;
    }

    public void setZhuanye(String zhuanye) {
        this.zhuanye = zhuanye;
    }

    public  stdent(String zhuanye){
        this.zhuanye = zhuanye;
    }
    public int getID() {
        return super.getID();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }
}
