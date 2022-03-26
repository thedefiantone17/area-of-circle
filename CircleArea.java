class MyClass {
    float rad;
    final float pi = 3.14f;
    float getArea(){
        
        return pi*(this.rad*this.rad);
        
    }
    
    MyClass(float r){
        rad= r;
    }
    
    void result(){
        System.out.println("The radius of the circle is: "+ this.rad +" cm.");
        System.out.println("The calculated area of circle is: "+ getArea() +" cm sq.");
    }
    
}

public class Area{
    
    public static void main(String[] args){
        MyClass radius = new MyClass(30);
        radius.result();
    }

}
