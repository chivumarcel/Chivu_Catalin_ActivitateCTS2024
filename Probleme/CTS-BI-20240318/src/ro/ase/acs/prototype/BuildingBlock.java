package ro.ase.acs.prototype;

public abstract class BuildingBlock implements Cloneable {
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //return super.clone();
        BuildingBlock copy = (BuildingBlock) super.clone();
        copy.x = this.x;
        copy.z = this.z;
        copy.y = this.y;
        return copy;
    }

    public abstract void render();
}
