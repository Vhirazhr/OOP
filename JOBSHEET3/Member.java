public class Member {
    private String idCardNumber;
    private String name;
    private int loanLimit;
    private int loanAmount;

    // Constructor
    public Member(String idCardNumber, String name, int loanLimit) {
        this.idCardNumber = idCardNumber;
        this.name = name;
        this.loanLimit = loanLimit;
        this.loanAmount = 0; 
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getLimitLoan() {
        return loanLimit;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void borrow(int amount) {
        if (loanAmount + amount > loanLimit) {
            System.out.println("Sorry, the loan amount exceeds the limit.");
        } else {
            loanAmount += amount;
        }
    }

    public void installment(int amount) {
        if (amount > loanAmount) {
            loanAmount = 0;
        } else {
            loanAmount -= amount;
        }
    }
}
