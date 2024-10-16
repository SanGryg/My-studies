public class Monster {
    int eyes;
    int arms;
    int legs;


    Monster() {
        this(2);
    }

    Monster(int count) {
        this(count, count, count);

    }

    public Monster(int eyes, int hands, int legs) {
        this.eyes = eyes;
        this.arms = hands;
        this.legs = legs;
    }

    void voice() {
        voice(1);
    }

    void voice(int count) {
        voice(count, "Grrrrrrrrr....");
    }


    void voice(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }
}

