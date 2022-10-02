class Mnc1
{

public static void main(String []args)
{

ItEmployee kesava=new ItEmployee();
kesava.morningWork(9,11);

String element=kesava.afterWork("dosa");
System.out.println(kesava.name);

System.out.println(kesava.age+"\n"+element);

}
}
