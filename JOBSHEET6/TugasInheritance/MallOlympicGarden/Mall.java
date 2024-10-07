package MallOlympicGarden;

public class Mall {
    public String name;
    public String location;
    public int numberOfStores;

    public Mall() {
        this.name = "Mall Olympic Garden";
        this.location = "Malang Kota";
        this.numberOfStores = 1;
    }

    public Mall(String name, String location, int numberOfStores) {
        this.name = name;
        this.location = location;
        this.numberOfStores = numberOfStores;
    }

    public String getInfo() {
        String info = "Name: " + this.name + "\n";
        info += "Location: " + this.location + "\n";
        info += "Number of Stores: " + this.numberOfStores + "\n";
        return info;
    }
}
