package oops.inheritance.abstraction;

public abstract class DemoAbstraction {

    public abstract void m1();

    public void m2(){
        System.out.println("non abstraction method");
    }

}

//1) ABSTRACTION MEANS HIDDING THE DETAILS, i.e . METHOD WITHOUT BODY

//2) IN ABSTRACT CLASS , IF ALTEAST ONE METHOD IS ABSTRACT,
// THEN IT IS COMPULSORY TO DECLARE CLASS AS ABSTRACT CLASS

//3) ABSTRACTION PROVIDE PARTIAL ABSTRACTION , BCZ ABSTRACT CLASS ALSO CONTAINS NORMAL METHOD i.e, METHOD WITH BODY