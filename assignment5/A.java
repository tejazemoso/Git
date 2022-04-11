package teja.assignment.data;
class A{
    int i;
    char ch;
    void display(){
        System.out.println("i="+i);
        System.out.println("ch="+ch);
    }
    void show(){
        //without the initialization of local variable printing their value is not possible.
        int c,d;
        System.out.println("The value of c and d are "+c);
        System.out.println(d);
    }
}