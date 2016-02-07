class Patient {

      public int age;
      public String name;

      public Patient(String name, int age){
        if (age< 0 || age> 130){
            throw new IllegalArgumentException("Age must be larger than or equal to 0 and samller than 130.");
        }
        this.age = age;
        this.name = name;

     }

}
