package hometask2;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */
public class HometaskAlone23 {
    public static void main(String[] args) {
        bankAccount(600, 400, 6, 300, 10
                , 38);
    }

    public static void bankAccount(double startSalary, double salaryGrowth, double growthPeriod,
                                   double expensesPerMonth, double percentForBroker, double period) {
        double bankAccount = 0;
        double brokerAccount = 0;
        double moneyForBroker;
        double currentSalary = startSalary;
        for (int i = 1; i <= period; i++) {
            moneyForBroker = currentSalary * (percentForBroker / 100);
            bankAccount = bankAccount + (currentSalary - expensesPerMonth - moneyForBroker);
            brokerAccount = brokerAccount + moneyForBroker + moneyForBroker * 0.02;
            if (i % (growthPeriod) == 0) {
                currentSalary = currentSalary + salaryGrowth;
            }
        }
        System.out.println(bankAccount);
        System.out.println(brokerAccount);
    }
}
