public class javaProject1 {
    final String name;
    int age;
    static String cast;
    static String citizen;
public javaProject1(String namet,int aget,String castt,String citizent){
    name = namet;
    age =aget;
    cast =castt;
    citizen = citizent;

    }
public void reservation(){
    if ( cast == "bc"){
     System.out.println( "community.so he got 60% reservation.");
     System.out.println("he have minimum chances to get selectand pay 80" );

    }else if (cast  =="oc"){
       System.out.println("so he got 20 % reservation.");
       System.out.println("he have lesser chances to get selectand pay 100" );
        }
        else if(cast  =="sc"){
            System.out.println("so he got 80 % reservation");
            System.out.println("he have greater chances to get selected and pay 20");
        }
        else if(cast == "st"){
            System.out.println("so he got 100% reservations");
            System.out.println("he has maximum chances to get selected and pay 0");
            
        }else{
            System.out.println("enter valid cast only");
        }
    }
    public void identify(){
        System.out.println("my good name is " + name + "and i am  " + citizen  );
        System.out.println("my age is " + age +"my cast is" +cast);
    }
    public void opinion(){
        System.out.println("cast seems to be greater than qualification");
    }
    

public static void main(String[] arg){
    javaProject1 ram = new javaProject1("roshan",24,"oc","indian");
    ram.identify();
    ram.opinion();
    ram.reservation();
}
}