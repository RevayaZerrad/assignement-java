//class Animal, mother
abstract class Animal {

  private boolean mammals;
  private boolean carnivorous;
  private int mood;

  // method protected it is redefine to daughter class
  protected void scare() {
  }

  protected void sayHello() {
  }

  protected void goodMood() {
  }

  // method check if is mammalian
  public boolean isMammals() {
    System.out.println("Am I a mammalian ?? => " + mammals);
    return mammals;
  }

  // method to set the animal if mammalian
  public void setMammals(boolean mammals1) {
    mammals = mammals1;
  }

  // method check if is carnivorous
  public boolean isCarnivorous() {
    System.out.println("Am I a carnivorous?? =>" + carnivorous);
    return mammals;
  }

  // method to set the animal if carnivorous
  public void setCarnivorous(boolean carnivorous1) {
    carnivorous = carnivorous1;
  }

  // method return the mood of the animal
  public int mood() {

    if (mood == 1) {
      System.out.println("mood = " + mood + " => Good Mood");

    } else if (mood == 0) {
      System.out.println("mood = " + mood + " => Scare or upset");

    } else if (mood == 2) {
      System.out.println("mood = " + mood + " => Say Hello");
    }
    return mood;
  }

}