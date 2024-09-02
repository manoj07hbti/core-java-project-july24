package methods;

public class Method {

    //SYNTAX : access_specifier return_type  method_name (parameter) {CODE..}

    public void Squaremak() {

        int i = 1000;

        System.out.println("Square of given number: " + i * i);

    }

    public static void main(String[] args) {

        // STEM 1: CreateObject Using default Contractor

        Method object1 = new Method();

        object1.Squaremak();


    }


}



