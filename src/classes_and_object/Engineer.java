package classes_and_object;

public class Engineer {
    String name;
    String branch;

    public Engineer(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }

    public static void main(String[] args) {

        Engineer e1 =new  Engineer("Anshul", "Cse");
        Engineer e2 =new  Engineer("Shivam", "IT");
        Engineer e3=new  Engineer("Abhishek", "ECE");
        Engineer e4 =new  Engineer("Kunal", "MECH");
        Engineer e5 =new  Engineer("Abhinav", "EE");



        System.out.println("Name- "+e1.name +" Age- "+e1.branch);
        System.out.println("Name- "+e2.name +" Age- "+e2.branch);
        System.out.println("Name- "+e3.name +" Age- "+e3.branch);
        System.out.println("Name- "+e4.name +" Age- "+e4.branch);
        System.out.println("Name- "+e5.name +" Age- "+e5.branch);

    }
}

