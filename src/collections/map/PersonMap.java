package collections.map;
import model.Person;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class PersonMap {
    public HashMap<String, ArrayList<model.Person>> createPersonMap(){

        HashMap<String, ArrayList<Person>> PerMap = new HashMap<>();

        // adding data

        Person person1= new Person("himanshu",22,"teacher");
        Person person2= new Person("sooraj",23,"doctor");
        Person person3= new Person("himanshu",24,"advocate");

        // List of Person

        ArrayList<Person>agraCity=new ArrayList<>();
        agraCity.add(person1);
        agraCity.add(person2);
        agraCity.add(person3);

        PerMap.put("City",agraCity);

        // 2nd city Person
        Person person4= new Person("divyanshu",20,"airforce");
        Person person5= new Person("sooraj",19,"pulice");
        Person person6= new Person("himanshu",21,"army");

        // List of Person

        ArrayList<Person>lucknowCity=new ArrayList<>();
        agraCity.add(person4);
        agraCity.add(person5);
        agraCity.add(person6);

        PerMap.put("City",lucknowCity);

        // 3rd city Person
        Person person7= new Person("krishna",28,"business");
        Person person8= new Person("madhav",27,"youtuber");
        Person person9= new Person("shyam",25,"hotel");

        // List of Person

        ArrayList<Person>mathuraCity=new ArrayList<>();
        agraCity.add(person7);
        agraCity.add(person8);
        agraCity.add(person9);

        PerMap.put("City",mathuraCity);

        return PerMap;

    }

    public void main(String[] args) {
        Person obj= new Person();

        for (String key : createPersonMap().keySet() ){

            Set<String> personArrayList;
            personArrayList = createPersonMap().keySet();

            //for (Person person){
               // System.out.println("city name"+key+"name"+person.getName()+"age"+person.getAge()+"field"+person.getField());
            }

        }
    }




