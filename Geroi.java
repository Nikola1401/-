public class Geroi {
    private String ime;
    private int zhivot;
    private int subraniSukrovishta;

    public Geroi(String ime) {
        this.ime = ime;
        this.zhivot = 100;
        this.subraniSukrovishta = 0;
    }

    public String getIme() {
        return ime;
    }

    public int getZhivot() {
        return zhivot;
    }

    public int getSubraniSukrovishta() {
        return subraniSukrovishta;
    }

    public void subraniSukrovishta() {
    	subraniSukrovishta++;
        System.out.println("��������� �������!");
    }

    public void takeDamage(int damage) {
        zhivot -= damage;
        if (zhivot <= 0) {
            System.out.println("�� ����! ������ ���������.");
        } else {
            System.out.println("������ � ������ � ���� " + damage + " ����� �� ������. �������� ������: " + zhivot);
        }
    }
}
