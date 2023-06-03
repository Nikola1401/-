import java.util.Scanner;

public class Programa {
    private static Geroi geroi;

    public static void main(String[] args) {
        System.out.println("Добре дошли в играта!");
        System.out.println("Целта ви е да намерите колкото се може повече съкровища и да избегнете опасностите в пещерата.");
        System.out.println("Успех!");

        Scanner scan = new Scanner(System.in);

        System.out.print("Въведете име на героя: ");
        String geroiIme = scan.nextLine();
        geroi = new Geroi(geroiIme);

        
        System.out.println("Играта приключи!");
        System.out.println(geroi.getIme() + ", събрали сте общо " + geroi.getSubraniSukrovishta() + " съкровища.");
    }
}
