class Main {

    public static void main(String[] args) {

        // test: new object dog1 of class dog
        // call the constructor and built the new object
        dog dog1 = new dog(1);

        // check if dog1 is mammalian and carnivorous
        dog1.isMammals();
        dog1.isCarnivorous();

        // change the type of mammalian and carnivorous to false
        dog1.setMammals(false);
        dog1.setCarnivorous(false);

        // we check if the type change well to false
        dog1.isMammals();
        dog1.isCarnivorous();

        // check which noise a dog cav do with a mood different
        dog1.goodMood();
        dog1.scare();
        dog1.sayHello();

        // we change the mood of the dog
        dog1.setMood(0);

        // we check which mood the dog is now
        dog1.mood();

        // ----------------------------------------------------------------------------
        // same test for the cat
        cat cat1 = new cat(1);

        // check if dog1 is mammalian and carnivorous
        cat1.isMammals();
        cat1.isCarnivorous();

        // change the type of mammalian and carnivorous to false
        cat1.setMammals(false);
        cat1.setCarnivorous(false);

        // we check if the type change well to false
        cat1.isMammals();
        cat1.isCarnivorous();

        // check which noise a dog cav do with a mood different
        cat1.goodMood();
        cat1.scare();
        cat1.sayHello();

        // we change the mood of the dog
        cat1.setMood(0);

        // we check which mood the dog is now
        cat1.mood();

        // ------------------------------------------------------------------
        // test for the frog
        frog frog1 = new frog(1);

        // check if frog has gills and has lays eggs
        frog1.hasGills();
        frog1.hasLaysEggs();

        // we check if the frog is mammalian: automatically = false
        frog1.isMammals();
        frog1.isCarnivorous();

        // check which noise a frog can do with a mood different (the frog are 2 mood)
        frog1.goodMood();
        frog1.scare();

        // we change the mood of the frog
        frog1.setMood(0);

        // we check which mood the dog is now
        frog1.mood();

    }
}