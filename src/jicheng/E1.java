package jicheng;

public class E1 {
    public static void main(String[] args) {
        stdent st = new stdent("学生专业：计算机");
        st.setID(2019120026);
        st.setPassword("123456");
        Teacher teacher = new Teacher("职称：叫兽");
        teacher.setID(888);
        teacher.setPassword("777");
        System.out.println(st.getZhuanye());
        System.out.println(st.getID());
        System.out.println(st.getPassword());
        System.out.println(teacher.getID());
        System.out.println(teacher.getPassword());
        System.out.println(teacher.getZhicheng());

    }
}
