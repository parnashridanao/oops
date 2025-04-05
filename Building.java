class Building {  
    String name;
    String location;
    int height;

    public Building(String name, String location, int height) {
        this.name = name;
        this.location = location;
        this.height = height;
    }

    public static void main(String[] args) {
        Building[] buildings = {
            new Building("XYZ", "Mumbai", 381),
            new Building("ABC", "Pune", 828),
            new Building("HIJ", "Hyderabad", 330),
            new Building("PQR", "Nagpur", 541),
            new Building("UNM", "UP", 442)
        };

        Building tallest = buildings[0];
        Building shortest = buildings[0];

        for (Building b : buildings) {
            if (b.height > tallest.height) {
                tallest = b;
            }
            if (b.height < shortest.height) {
                shortest = b;
            }
        }

        System.out.println("Tallest Building: " + tallest.name + " in " + tallest.location + " (" + tallest.height + " m)");
        System.out.println("Shortest Building: " + shortest.name + " in " + shortest.location + " (" + shortest.height + " m)");
    }
}