package class_and_object;

public class FamilyClassParaConstructor {


    String mother;
    String father;
    String brother;
    String sister;

    //parameterised constructor


    public FamilyClassParaConstructor(String mother, String father, String brother, String sister) {
        this.mother = mother;
        this.father = father;
        this.brother = brother;
        this.sister = sister;
    }

    public static void main(String[] args) {

        FamilyClassParaConstructor f1 = new FamilyClassParaConstructor("HEMANI","ABHISHEK", "OM", "ABHIKA");
        FamilyClassParaConstructor f2 = new FamilyClassParaConstructor("SITA","RAMESH","GANESH","SHEFALI");
        FamilyClassParaConstructor f3 = new FamilyClassParaConstructor("PARVATI","SHIV","KARTIKE","LEKHA");
        FamilyClassParaConstructor f4 = new FamilyClassParaConstructor("LAXMI","NARAYAN","VIDUR","GAURA");
        FamilyClassParaConstructor f5 = new FamilyClassParaConstructor("RAMA","RAJESH","ABHAY","ARCHANA");

        System.out.println("F1..>"+"mother name :"+f1.mother+"," + " father name:"+f1.father+","+" brother name:"+f1.brother+","+" sister name:"+f1.sister);
        System.out.println("F2..>"+"mother name :"+f2.mother+"," + " father name:"+f2.father+","+" brother name:"+f2.brother+","+" sister name:"+f2.sister);
        System.out.println("F3..>"+"mother name :"+f3.mother+"," + " father name:"+f3.father+","+" brother name:"+f3.brother+","+" sister name:"+f3.sister);
        System.out.println("F4..>"+"mother name :"+f4.mother+"," + " father name:"+f4.father+","+" brother name:"+f4.brother+","+" sister name:"+f4.sister);
        System.out.println("F5..>"+"mother name :"+f5.mother+"," + " father name:"+f5.father+","+" brother name:"+f5.brother+","+" sister name:"+f5.sister);

    }

}
