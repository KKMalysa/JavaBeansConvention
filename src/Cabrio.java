public class Cabrio {
    private String name;
    private String brand;
    private boolean roofOpen;
    private boolean isMoving;


    public Cabrio(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean isMoving) {
        this.isMoving = isMoving;
    }

    public boolean isRoofOpen() {
        return roofOpen;
    }

    public void setRoofOpen(boolean roofOpen) {
        if(isMoving){  //znaleziony bład: if(isMoving = true)
            System.out.println(" You can't open/close roof while moving");
        }else {
            this.roofOpen = roofOpen;
        }

    }
}
