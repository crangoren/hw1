package lvl2;

public class Human implements Move {
    int runDistance;
    int jumpHeight;
    String name;

    public String getName() {
        return name;
    }

    @Override
    public int getJumpHeight() {
        return jumpHeight;
    }

    @Override
    public int getRunDistance() {
        return runDistance;
    }

    @Override
    public void run() {
        System.out.println("human run");
    }

    @Override
    public void jump() {
        System.out.println("human jump");

    }

    @Override
    public void jumpOver(int height) {
        if (height <= jumpHeight) {
            Wall.jump(height, name);

        } else {
            System.out.println(name + " не перепрыгнул стену высотой " + height + "м.");




        }
    }

    @Override
    public void runAround(int distance) {
        if (distance <= runDistance) {
            Road.run(distance, name);

        } else {
            System.out.println(name + " не пробежал дистанцию " + distance + "м.");

        }
    }


    public Human(int runDistance, int jumpHeight, String name) {
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.name = name;
    }
}
