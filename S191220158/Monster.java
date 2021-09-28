package S191220158;

import S191220158.Line.Position;
public class Monster implements Linable {

    String rank;//应该被排序在rank()号
    private final int r;
    private final int g;
    private final int b;

    private Position position;
    public Monster(int r, int g, int b,String rank) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.rank=rank;
    }

    public String rank() { 
        return this.rank;
    }

    @Override
    public String toString() {
        return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m    " + this.rank() + "  \033[0m";
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }
    //与another交换位置
    public void swapPosition(Monster another) {
        Position p = another.position;
        this.position.setLinable(another);
        p.setLinable(this);
    }
    @Override
    public String getValue() {
        return this.rank();
    }

}