 class Airplane implements FlyAble{
    private String fly;

     public Airplane(String fly) {
         this.fly = fly;
     }

     @Override
     public String fly() {
         return fly;
     }
 }
