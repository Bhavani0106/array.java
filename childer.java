package childer1;
import parent1.parent;
class B extends parent{
    void m5(){
            System.out.println("m5 is default method");
            }
    public void m6(){
            System.out.println("m6 is public method from class B");
            }
    public static void main(String[] args){
        
        parent a =new parent();
        B b=new B();
        a.m1();
        //a.m2();
        //a.m3();
        //a.m4();
        b.m1();
       // b.m2();
        //b.m3();
        b.m4();


    }
}
