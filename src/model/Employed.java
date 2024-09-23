package model;

public class Employed {

    public class Employee {
        String name;
        int age;
        String department;

        // parametrized constructor

        public Employee(String name, int age, String department) {
            this.name = name;
            this.age = age;
            this.department = department;
        }

        // getter setter


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getDepartment() {
            return department;
        }
        public void setDepartment(String department) {
            this.department = department;
        }
    }

}
