public class Character {
    String name;

    Character(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println(this.name + " Bergerak");
    }

}