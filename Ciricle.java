 class Ciricle extends  Shape{
     protected Ciricle(double red) {
         super(red);
     }

     @Override
    public void getArea() {
        System.out.println(Math.PI*this.red*this.red);
    }

    @Override
    public void getParametr() {

        System.out.println(2*Math.PI*this.red);
    }
}
