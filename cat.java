
class cat extends Animal {

    int mood;

    // constructor
    public cat(int mood) {

        this.mood = mood;

        // initialization into constructor: cat is automatically carnivorous and
        // mammalian
        setMammals(true);
        setCarnivorous(true);

        System.out.println("I'm a cat mammalian and carnivorous");
        // test: which mood the cat is and we print the noise of the cat
        // mood = 0 => scare
        // mood = 1 => happy
        // mood = 2 => say hello
        if (mood == 1) {
            System.out.println("I'm in a good mood,I make a purr, purr sound");

        } else if (mood == 0) {
            System.out.println("I'm frightened,I make a hiss sound");

        } else if (mood == 2) {
            System.out.println("I'm usually make a meow sound when I greet people");
        }
    }

    // change the mood of the dog
    public void setMood(int mood) {
        if (mood == 1) {
            System.out.println("Now,I'm in a good mood,I make a purr, purr sound");

        } else if (mood == 0) {
            System.out.println("I'm frightened,I make a hiss sound");

        } else if (mood == 2) {
            System.out.println("I'm usually make a meow sound when I greet people");
        }
    }

    // method different mood of the cat: print on screen what is the noise when the
    // cat scare for example
    public void scare() {
        System.out.println("hiss");
    }

    public void sayHello() {
        System.out.println("meow");
    }

    public void goodMood() {
        System.out.println("purr, purr");
    }

}