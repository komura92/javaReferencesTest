public class MyObject {
    private int height;
    private int width;

    public MyObject(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public MyObject() {
        this.height = 0;
        this.width = 0;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
