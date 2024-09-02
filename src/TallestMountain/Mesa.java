package TallestMountain;

public class Mesa implements Formation {

    private int height;
    private String name;
    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    private int area;

    public Mesa(int Height, String Name, int Area) {
        height = Height;
        name = Name;
        area = Area;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String getInfo() {
        return String.format("Type: Mesa, Name: %s, Height: %s, Area: %s", name, height, area);
    }

}
