public class BeerSong {
    public static void main(String[] args) {
        Ninety_Nine_Bottles_Of_Beer();
    }

    public static void Ninety_Nine_Bottles_Of_Beer() {
        for (int i = 100; i > 0; i--) {
            System.out.println(i + " bottles of beer on the wall " + i + " bottles of Beer. Take on down, pass it around, " + i + " bottles of beer on the wall");
        }
    }
}