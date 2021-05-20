 class ProgrammingLanguage implements  Language{
    private String name;

     public ProgrammingLanguage(String name) {
         this.name = name;
     }

     @Override
     public String name() {
         return name;
     }
 }
