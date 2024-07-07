
package model;

public class Test {
    
    public static void main(String[] args) {
        
        A a = new A(){
            
            @Override
            public void m(){
                System.out.println("niyamai");;
            }
            
        };
        a.m();
        
        
    }
    
}
