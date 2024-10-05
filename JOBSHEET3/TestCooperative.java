public class TestCooperative {
    public static void main(String[] args) {
        Member member1 = new Member("111333444", "Donny", 5000000);
        System.out.println("Member Name: " + member1.getName());
        System.out.println("Loan Limit: " + member1.getLimitLoan());

        System.out.println("\nBorrowing 10,000,000...");
        member1.borrow(10000000); // Exceeds loan limit

        System.out.println("\nBorrowing 4,000,000...");
        member1.borrow(4000000); // Within loan limit
        System.out.println("Current loan amount: " + member1.getLoanAmount());

        System.out.println("\nPaying 1,000,000 installment");
        member1.installment(1000000);
        System.out.println("Current loan amount: " + member1.getLoanAmount());

        System.out.println("\nPaying 3,000,000 installment");
        member1.installment(3000000);
        System.out.println("Current loan amount: " + member1.getLoanAmount());
    }
}
