class Animal {
  Animal() {
    System.out.println("Sou um animal");
  }
}

public class Mamifero extends Animal {
  Mamifero() {
    System.out.println("Sou um mamifero");
  }
}

class Ave extends Animal {
  Ave() {
    System.out.println("Sou uma ave");
  }
 public class Peixe extends Animal {
  Peixe() {
    System.out.println("Sou um peixe");
  } 
  
  public static void main(String[] args) {
    //Mamifero x = new Mamifero();
    //Ave y= new Ave();
    Peixe z= new Peixe();
    
  }
} 