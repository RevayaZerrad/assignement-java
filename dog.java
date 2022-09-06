// class dog extends of class animal
class dog extends Animal {

    int mood;

    // constructor
    public dog(int mood) {

        this.mood = mood;

        // initialization into constructor: dog is automatically carnivorous and
        // mammalian
        setMammals(true);
        setCarnivorous(true);

        System.out.println("I'm a dog mammalian and carnivorous");

        // test: if mood = 0 => scare
        // mood = 1 => happy
        // mood = 2 => say hello
        if (mood == 1) {
            System.out.println("I'm feel comfortable being touched, I will bark loudly");

        } else if (mood == 0) {
            System.out.println("I'm frightened and upset, I will make a whooping sound");

        } else if (mood == 2) {
            System.out.println("I'm greet people by wagging their tails");
        }
    }

    // change the mood of the dog
    public void setMood(int mood) {
        if (mood == 1) {
            System.out.println("Now,I'm feel comfortable being touched, I will bark loudly");

        } else if (mood == 0) {
            System.out.println("Now,I'm frightened and upset, I will make a whooping sound");

        } else if (mood == 2) {
            System.out.println("Now, I'm greet people by wagging their tails");
        }
    }

    // method different mood of the dog: print in the screen what is the noise when
    // the dog scare for example
    public void scare() {
        System.out.println("whooping");
    }

    public void sayHello() {
        System.out.println("wagging their tails");
    }

    public void goodMood() {
        System.out.println("bark");
    }

}