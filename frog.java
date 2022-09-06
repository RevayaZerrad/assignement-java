
class frog extends Animal {

    boolean gills;
    boolean laysEggs;
    int mood;

    // constructor if mammals is TRUE => is a mammalian animal same for carnivorous
    // if mood = 0 => scare
    // mood = 1 => happy
    // mood = 2 => say hello
    public frog(int mood) {

        this.mood = mood;

        // initialization into constructor: frog is automatically Has Gills and has lays
        // eggs = amphibian and belongs to oviparous

        setHasGills(true);
        setHasLaysEggs(true);

        System.out.println("I'm a frog amphibian and belongs to oviparous");

        if (mood == 1) {
            System.out.println("I'm in a good mood, I will sing quack quack quack");

        } else if (mood == 0) {
            System.out.println("when frightened, I will plop into the water");
        }
    }

    public void setHasGills(boolean gills1) {
        gills = gills1;

    }

    public void setHasLaysEggs(boolean laysEggs1) {
        laysEggs = laysEggs1;

    }

    public boolean hasGills() {
        System.out.println("THE FROG HAS GILLS => " + gills);
        return gills;
    }

    public boolean hasLaysEggs() {
        System.out.println("THE FROG HAS LAYS EGGS => " + laysEggs);
        return laysEggs;
    }

    public void setMood(int mood) {
        if (mood == 1) {
            System.out.println("Now, I'm in a good mood, I will sing quack quack quack");

        } else if (mood == 0) {
            System.out.println("when frightened, I will plop into the water");
        }
    }

    public void scare() {
        System.out.println("I will plop into the water");
    }

    public void goodMood() {
        System.out.println("quack quack quack");
    }

}