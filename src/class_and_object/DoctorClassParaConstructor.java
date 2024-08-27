package class_and_object;

public class DoctorClassParaConstructor {


    String name;
    int experience;
    String post;;
    int salary;
    int age;

    //parameterised constructor


    public DoctorClassParaConstructor(String name, int experience, String post, int salary, int age) {
        this.name = name;
        this.experience = experience;
        this.post = post;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {

     DoctorClassParaConstructor D1 = new DoctorClassParaConstructor("ARUSHI",15,"SURGON",10,55);
     DoctorClassParaConstructor D2 =new DoctorClassParaConstructor("ROSHNI",10,"CARDIOLOGIST",2,50);
     DoctorClassParaConstructor D3 =new DoctorClassParaConstructor("VANI",17,"ONCOLOGIST",15,45);
     DoctorClassParaConstructor D4 =new DoctorClassParaConstructor("SHRUTI",16,"NEUROLOGIST",31,60);
     DoctorClassParaConstructor D5 =new DoctorClassParaConstructor("JEEVA",20,"DERMATALOGIST",10,48);

        System.out.println("D1...>"+"NAME:"+D1.name+","+"EXPERIENCE:"+D1.experience+","+"POST:"+D1.post+","+"SALARY IN PER MONTH IN LAKH:"+D1.salary+","+"AGE:"+D1.age);
        System.out.println("D2...>"+"NAME:"+D2.name+","+"EXPERIENCE:"+D2.experience+","+"POST:"+D2.post+","+"SALARY IN PER MONTH IN LAKH:"+D2.salary+","+"AGE:"+D2.age);
        System.out.println("D3...>"+"NAME:"+D3.name+","+"EXPERIENCE:"+D3.experience+","+"POST:"+D3.post+","+"SALARY IN PER MONTH IN LAKH:"+D3.salary+","+"AGE:"+D3.age);
        System.out.println("D4...>"+"NAME:"+D4.name+","+"EXPERIENCE:"+D4.experience+","+"POST:"+D4.post+","+"SALARY IN PER MONTH IN LAKH:"+D4.salary+","+"AGE:"+D4.age);
        System.out.println("D5...>"+"NAME:"+D5.name+","+"EXPERIENCE:"+D5.experience+","+"POST:"+D5.post+","+"SALARY IN PER MONTH IN LAKH:"+D5.salary+","+"AGE:"+D5.age);



    }

}
