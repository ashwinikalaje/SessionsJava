package datatypes;

public class StringConactination {
    public static void main(String args[]){
        int a=100;
        int b=200;

        String s1="hi--";
        String s2="hello";

        double c =12.33;
        double c2=13.44;

        System.out.println(a+b);
        System.out.println(s1+s2);
        System.out.println(a+b+s1+s2);
        System.out.println(s1+s2+a+b);
        System.out.println(s1+s2+(a+b));
        System.out.println((s1+s2)+a+b);
        System.out.println(a+b+s1+s2+a+s1+a+b);
        System.out.println(a+b+s1+s2+a+b);
        System.out.println(c+c2);
        System.out.println(s1+s2+c+c2);

    }
}
