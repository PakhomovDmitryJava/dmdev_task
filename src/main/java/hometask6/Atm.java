package hometask6;

/**
 * Создать класс, описывающий банкомат.
 * Банкомат задается тремя свойствами: количеством купюр номиналом 20, 50 и 100.
 * Сделать методы для добавления денег в банкомат.
 * Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
 * При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */
public class Atm {
    private int note20;
    private int note50;
    private int note100;

    public Atm(int note100, int note50, int note20) {
        this.note20 = note20;
        this.note50 = note50;
        this.note100 = note100;
    }

    public void addNote20(int numberOfTwenties) {
        this.note20 += numberOfTwenties;
    }

    public void addNote50(int numberOfFifties) {
        this.note50 += numberOfFifties;
    }

    public void addNote100(int numberOfHundred) {
        this.note100 += numberOfHundred;
    }

    public boolean cashWithdrawal(int cashToWithdrawal) {
        int cash = cashToWithdrawal;
        boolean check;
        if (cashToWithdrawal > countMoneyInAtm() || cashToWithdrawal % 10 != 0 || cashToWithdrawal == 0) {
            return false;
        }

        int note100ToWithdrawal = cash / 100;
        int note50ToWithdrawal = 0;
        int note20ToWithdrawal = 0;
        if (cash / 100 <= note100) {
            cash = cash % 100;
            setNote100(note100 - note100ToWithdrawal);
            note50ToWithdrawal = cash / 50;
            if (note50ToWithdrawal <= getNote50() && (cash % 100 == 70 || cash % 100 == 90)) {

                cash %= 50;
                setNote50(note50 - note50ToWithdrawal);
                check = true;
                note20ToWithdrawal = cash / 20;
                if (note20ToWithdrawal <= getNote20()) {

                    cash %= 20;
                    setNote20(note20 - note20ToWithdrawal);
                    check = true;
                } else {
                    check = false;
                }
            } else {
                note50ToWithdrawal = 0;
                check = false;
            }
        } else {
            check = false;
        }


        if (check) {
            System.out.println("100 - " + note100ToWithdrawal);
            System.out.println("50  - " + note50ToWithdrawal);
            System.out.println("20  - " + note20ToWithdrawal);
        }
        return check;
    }

    public int countMoneyInAtm() {
        return getNote20() * 20 + getNote50() * 50 + getNote100() * 100;
    }

    public int getNote20() {
        return note20;
    }

    public void setNote20(int note20) {
        this.note20 = note20;
    }

    public int getNote50() {
        return note50;
    }

    public void setNote50(int note50) {
        this.note50 = note50;
    }

    public int getNote100() {
        return note100;
    }

    public void setNote100(int note100) {
        this.note100 = note100;
    }
}