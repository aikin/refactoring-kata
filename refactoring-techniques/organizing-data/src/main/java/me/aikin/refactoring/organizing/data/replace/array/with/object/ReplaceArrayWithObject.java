package me.aikin.refactoring.organizing.data.replace.array.with.object;

public class ReplaceArrayWithObject {
    private final String[] row;
    private String name;
    private int wins;

    public ReplaceArrayWithObject(String[] row) {
        this.row = row;
    }

    public String getName() {
        return row[0];
    }

    public int getWins() {
        return Integer.parseInt(row[1]);
    }
}
