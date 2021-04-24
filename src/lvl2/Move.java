package lvl2;

public interface Move {
    int getJumpHeight();
    int getRunDistance();
    void run ();
    void jump ();
    void jumpOver(int height);
    void runAround(int distance);
    String getName();
}
