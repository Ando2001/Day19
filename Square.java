 public class Square extends Shape{
     protected Square(double red) {
         super(red);
     }

     @Override
    public void getArea() {
        System.out.println(this.red * this.red);
    }

     @Override
     public void getParametr() {
         System.out.println(this.red* 4);
     }
}
