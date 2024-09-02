package TallestMountain;

public class Mountain implements Formation{

    private int height;
    private String name;

    public Mountain(int Height, String Name) {
        height = Height;
        name = Name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String getInfo() {
        return String.format("Type: Mountain, Name: %s, Height: %s", name, height);
    }

}
