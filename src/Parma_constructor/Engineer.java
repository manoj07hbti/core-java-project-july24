package Parma_constructor;

public class Engineer {

    String name;

    String branch;

    String work;

    int id;

    public Engineer(String name, String branch, String work, int id) {

        this.name = name;
        this.branch = branch;
        this.work = work;
        this.id = id;
    }

    public static void main(String[] args) {


        //Classname  obj = new Classname (value1,value2,value3......valueN);

        Engineer obj1 = new Engineer("rahul", "civil", "construction", 1254);

        System.out.println("printing engineer" + obj1.name + "branch" + obj1.branch + "work" + obj1.work + "id" + obj1.id);

        Engineer obj2 = new Engineer("ramesh", "CS", "it", 2312);

        System.out.println("printing name" + obj2.name + "branch" + obj2.branch + "work" + obj2.work + "id" + obj2.id);

        Engineer obj3 = new Engineer("kamal", "ele", "mashin", 4536);

        System.out.println("printing name" + obj3.name + "branch" + obj3.branch + "work" + obj3.work + "id" + obj3.id);


    }


}
