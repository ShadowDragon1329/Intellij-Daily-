public class Day2 {
public void runCode(){
    System.out.println("\nDay2 Starts Here!!!!");
    //Implicit Casting Order
    //Byte -> Short -> Int -> Long -> Float -> Double
    // '->' means can be implicitly converted into next datatype

    short x=1;
    int y=x+1;
    System.out.println(y);

    //parse
    //used to convert string to int float double long etc
    String s1 ="23";
    int z= Integer.parseInt(s1)+2;
    System.out.println(z);


    //Math Class
    double n1=2.34;
    //1.ceil
    int n2=(int)Math.ceil(n1);
    //2.round
    long n3=Math.round(n1);
    //3.random
    double n4=(Math.random()*100);
    System.out.println(n1 +" "+ n2 +" "+ n3 +" "+ n4);


}
}
