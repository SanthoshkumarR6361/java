class UnaryOpersters{
public static void main(String[] args){
int a=10;
int b=a++;
int c=(--b)+(--a);
c++;
++a;
b--;
boolean d=true;
boolean e=false;
 System.out.println("a :"+(a--));//11
 System.out.println("b+c :"+(b+c));//28
 System.out.println("b :"+(--b));//7
 System.out.println("b+c :"+(b+c));//27
 System.out.println("~a :"+(~a));//-11
 System.out.println("d :"+(!d));//false
 System.out.println("e :"+(!e));//true

}
}
