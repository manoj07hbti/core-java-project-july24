package multiple_conditions;

public class AndOperator {

    public static void main(String[] args) {

        //1.
        //operator && TRUE && TRUE=TRUE

        int marks = 70;
        String subject = "scince";

        if (marks >= 60 && subject == "scince") {

            System.out.println("printing this student pass first division..");
        } else {
            System.out.println("printing this student not fist division..");

        }//2.
        //  TRUE && FALSE=FALSE

        String Subject = "hindi";

        if (marks >= 60 && Subject == "hindi") {
            System.out.println("printing this student pass first division..");
        } else {
            System.out.println("printing this student not pass first division..");
        }
        //3'
        //FALSE && TRUE=FALSE
        marks = 50;
        String Sbject = "math";

        if (marks >= 60 && Subject == "math") {
            System.out.println("printing this student pass first division..");
        } else {
            System.out.println("printing this student not pass division..");

            //4.
            // FALSE && FALSE =FALSE

            marks = 50;
            String sub = "Arts";

            if (marks >= 60 && subject == "Arts") {
                System.out.println("printing this student first division..");
            } else {
                System.out.println("printing this student not first division..");
            }
        }//write a code to find eligible vote of up

        // age> && String up =up

        int age = 24;
        String up = "up";

        //1.  TRUE && TRUE =TRUE

        if (age >= 18 && up == "up") {
            System.out.println("printing person is eligible for voting in up");
        } else {
            System.out.println("printing person is not eligible for voting  up");
        }
        //2. TRUE && FALSE=FALSE

        up = "tndla";
        if (age >= 18 && up == "Tundla") {
            System.out.println("printing person is eligible for voting in up ");
        } else {
            System.out.println("printing person not eligible voting up");
        }
        //3.  FALSE && TRUE =FALSE

        age = 22;
        up = "agra";
        if (age >= 18 && up == "agra") {
            System.out.println("printing person eligible for voting in agra");
        } else {
            System.out.println("printing person is eligible not voting in agra");
        }

        //4.
        // FALSE && FALSE=FALSE
        age = 21;
        up = "firozabad";
        if (age >= 18 && up == "firozabad") {
            System.out.println("person is eligible voting in firozabad");
        } else {
            System.out.println("person is not eligible voting in firozabad");
        }

    }
}

