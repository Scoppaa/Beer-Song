public class BeerSong {
    public static void main(String[] args) {
        System.out.println("*************** Program output ***************************");
        Ninety_Nine_Bottles_Of_Beer();
        System.out.println("*************** End program output ***************************");
    }

    public static void Ninety_Nine_Bottles_Of_Beer() {
        for (int i = 100; i > 0; i--) {
            System.out.println(i + " bottles of beer on the wall " + i + " bottles of beer. Take one down, pass it around, " + i + " bottle(s) of beer on the wall!");
        }
    }
}