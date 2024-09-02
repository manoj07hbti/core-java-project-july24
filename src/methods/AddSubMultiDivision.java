package methods;

public class AddSubMultiDivision {
    int a=3;
    int b=5;
    public void add(){
        System.out.println(a+b);
    }
    public void sub(){
        System.out.println(a-b);
    }
    public void multi(){
        System.out.println(a*b);
    }
    public void division(){
        System.out.println((double)a/b);
    }

    public static void main(String[] args) {
        AddSubMultiDivision asmd=new AddSubMultiDivision();
        asmd.add();
        asmd.sub();
        asmd.multi();
        asmd.division();
    }



}
