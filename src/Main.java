//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int deposit = 400;
        int current_balance = 100;
        int bonus;
        System.out.println("На вашем счету: " + current_balance + " руб");
        System.out.println("Пополнение на: " + deposit + " руб");
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int balance = deposit + current_balance + bonus;
        System.out.println("Итоговый счет: " + balance + " руб");
        System.out.println("Бонус: " + bonus + " руб");
    }
}
