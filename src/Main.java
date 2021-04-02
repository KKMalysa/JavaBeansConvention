public class Main {

    public static void main(String[] args) {
        Cabrio cabrio = new Cabrio("Vento", "Vw");


        System.out.println("status wyjściowy");
        System.out.printf("Car status.\n Is moving: %s\n Is roof Open: %s", cabrio.isMoving(), cabrio.isRoofOpen());
        System.out.println();
        System.out.println("auto stoi - próbuje otworzyć dach");
        cabrio.setRoofOpen(true);

//        cabrio.setMoving(true);
//        cabrio.setRoofOpen(false);
//        System.out.printf("Car status.\n Is moving: %s\n Is roof Open: %s", cabrio.isMoving(), cabrio.isRoofOpen());
//        System.out.println();
//        System.out.println();
//        cabrio.setMoving(false);
//        cabrio.setRoofOpen(false);
//        System.out.printf("Car status.\n Is moving: %s\n Is roof Open: %s", cabrio.isMoving(), cabrio.isRoofOpen());

    }
}
