/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int top;
    int left;
    int width;
    int height;
    
    public void initialize (int top, int left, int width, int height){
    this.top = top;
    this.left = left;
    this.width = width;
    this.height = height;
    }
    
    public void initialize (int top, int left, int height){
    this.top = top;
    this.left = left;
    this.height = height;
    }
    
     public void initialize (int top, int left){
    this.top = top;
    this.left = left;
    }
    
    public void initialize (int top){
    this.top = top;
    }

    public static void main(String[] args) {

    }
}
