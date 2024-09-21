package model;

public class Doctor {
    String name;
    String dept;
    int id;

   public Doctor(String name, String dept, int id){
        this.name = name;
        this.dept = dept;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
