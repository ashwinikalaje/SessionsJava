package datatypes;

public class IfElseConcept {
    public static void main(String args[])
    {
        int a=30;
        int b=20;

        if(b>a)
        {
        System.out.println("b is greater then a");
         }
        else{
            System.out.println("a is greater then b");
             }

        int c=40;
        int d=40;

        if(c==d)
        {
            System.out.println("c is equal");
        }
        else{
            System.out.println("c is not equal");
        }
        //finding the gretest number
        int a1=100;
        int b1=300;
        int c1=400;
        if(a1>b1 & a1>c1)//false false=false change the value check it
        {
            System.out.println("a1 is greater");
        }
        else if(b1>c1)
        {
            System.out.println("b1 is greater");
        }
        else
        {
            System.out.println("c1 is greater");
        }
    }

    }

