public class Rectangle {
    int length;
    int width;
    int area;
    int parameter;

    public Rectangle(int width, int height){
        this.length = width;
        this.width = height;
    }
    public void calculateArea(){
        area = length * width;
    }
    public void printArea(){
        System.out.println("area = " + area);
    }
    public void calculateParemeter(){
        parameter = 2*(length + width);
    }
    public void printParemeter(){
        System.out.println("parameter = " + parameter);
    }

    
    
    
}
