package com.company;

public class Main {

    public static void main(String[] args) {
        Tiger tiger= new Tiger();
        Bird bird= new Bird();
        AnimalHouse<Tiger> tigerHouse= new AnimalHouse<>();
        tigerHouse.animal= tiger;

        AnimalHouse<Bird> birdHouse= new AnimalHouse<>();
        birdHouse.animal= bird;
	// write your code here
    }
}
