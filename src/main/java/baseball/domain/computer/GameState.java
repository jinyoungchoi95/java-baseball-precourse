package baseball.domain.computer;

public enum GameState {

    START(0),
    RESTART(1),
    END(2),
    ;

    private final int command;

    GameState(int command) {
        this.command = command;
    }

    public static GameState init() {
        return GameState.START;
    }

    public boolean isEndGame() {
        return this == END;
    }

    public boolean isRestartGame() {
        return this == RESTART;
    }
}
