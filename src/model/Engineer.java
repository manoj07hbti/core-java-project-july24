package model;

public class Engineer {
    String name;
    String branch;
    int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engineer(String name, String branch, int year) {
        this.name = name;
        this.branch = branch;
        this.year = year;
    }
}
