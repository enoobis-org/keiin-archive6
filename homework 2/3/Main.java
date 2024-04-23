public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(0, "gi");
        bankAccount.deposit(15000);
        while (true) {
            try {
                bankAccount.withDraw(6000);
                System.out.println("Cняли 6000, остаток " + bankAccount.getAmount());
            } catch (LimitException e) {
                try {
                    bankAccount.withDraw(bankAccount.getAmount());
                } catch (LimitException ex) {
                    throw new RuntimeException(ex);
                }
                System.out.println("Исключение: " + e.getMessage());
                System.out.println("Максимальная доступная сумма для снятия: " + e.getRemainingAmount() + " сом.");
                System.out.println("Снято: " + e.getRemainingAmount() + " сом");
                System.out.println("Остаток на счете : 0 сом");
                break;
            }
        }
    }
}