package methods;

public class Book {

    //data members

    //methods read, write and study

    //SYNTAX : access_specifier return_type  method_name (parameter) {CODE..}

    public void read(){

        System.out.println("This is read method of Book...");
    }

    private void write(){

        System.out.println("This is Write method of Book...");
    }

    public void study(){
        System.out.println("This is study method of Book...");
    }

    public static void main(String[] args) {
      // step 1: create Object using default constructor

       Book book1= new Book();

      //  step 2: objName.MethodName();
         book1.read();
         book1.write();
         book1.study();

    }

}
