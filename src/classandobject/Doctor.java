package classandobject;

public class Doctor {

    String name = "Dr.Lakhan Singh";
    String Speciality = "Physiotherapist";
    String hospital = "Apollo Hospital";
    String City = "Delhi";
    int age = 50;

    public static void main(String[] args) {
        Doctor doc = new Doctor();
        System.out.println("Name " + doc.name + " Speciality " + doc.Speciality + " Hospital " + doc.hospital + " City " + doc.City + " Age " + doc.age);

        Doctor doc1 = new Doctor();
        System.out.println("Name " + doc1.name + " Speciality " + doc1.Speciality + " Hospital " + doc1.hospital + " City " + doc1.City + " Age " + doc.age);

        Doctor doc2 = new Doctor();
        System.out.println("Name " + doc2.name + " Speciality " + doc2.Speciality + " Hospital " + doc2.hospital + " City " + doc2.City + " Age " + doc2.age);


    }


}
