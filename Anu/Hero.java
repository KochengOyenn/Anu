public class Hero extends Character {
    static int baseAtk = 58;

    Hero(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(this.name + " Bergerak dengan semangat membara");
    }

    public void move(String direction) {
        System.out.println(this.name + " Bergerak ke" + direction);
    }
}