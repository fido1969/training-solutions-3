package stl_loader;

public class Normal {
    private float i;
    private float j;
    private float k;

    public Normal(float i, float j, float k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }

    public float getI() {
        return i;
    }

    public float getJ() {
        return j;
    }

    public float getK() {
        return k;
    }

    @Override
    public String toString() {
        return "normal " + i + ' ' + j + ' ' + k;
    }
}
