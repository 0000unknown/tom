class Main {
  public static void main(String[] args) {
   Dog Myers = new Dog("doberman");
    Myers.setBreed("Catahoula Leopard");
      System.out.println("Myers is a " + Myers.getBreed());
  }
  public static class Dog{
    private String breed;
    public Dog(String startBreed){
      breed = startBreed;
    }
    public void setBreed(String startBreed){
      breed = startBreed;
    }
    public String getBreed(){
      return breed;
    }
  }
}