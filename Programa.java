import java.util.Scanner;

public class Programa {
    private static Geroi geroi;

    public static void main(String[] args) {
        System.out.println("����� ����� � ������!");
        System.out.println("����� �� � �� �������� ������� �� ���� ������ ��������� � �� ��������� ����������� � ��������.");
        System.out.println("�����!");

        Scanner scan = new Scanner(System.in);

        System.out.print("�������� ��� �� �����: ");
        String geroiIme = scan.nextLine();
        geroi = new Geroi(geroiIme);

        
        System.out.println("������ ��������!");
        System.out.println(geroi.getIme() + ", ������� ��� ���� " + geroi.getSubraniSukrovishta() + " ���������.");
    }
}
