public class Enemy extends Character {

    Enemy(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(this.name +" Bergerak sesuai kata hati");
    }

    public void move(int step) {
        super.move();
        System.out.print(step + " langkah");
    }

}