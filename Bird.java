 class Bird implements FlyAble{
    private String fly;

     public Bird(String fly) {
         this.fly = fly;
     }

     @Override
     public String fly() {
         return fly;
     }
 }
