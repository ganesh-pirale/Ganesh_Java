
package myprogramme;


public class SampleProg {             // how to make method overloading with return statement

    int id;
    int name;
    
    void display(){ // method = name + parameters
    }
    
    int display(int yes){
        
        int a = 10, b= 50;
        
        System.out.println("" +(1+1));
        return 1;
    }
    
    int sum(int a, int b){
        return a+b;
    }
    
    double sum(double a, int b){
        double opDouble = a +b;
        System.out.println(""+opDouble);
        return (a+b);
    }
    public static void main(String[] args) {
        
        SampleProg prog = new SampleProg();
        
        int opInt = prog.sum(10,20);
        System.out.println("Int OP - "+opInt);
        double opDoub = prog.sum(10.6d, 10);
        System.out.println("Double OP - "+opDoub);
    }
}
    
