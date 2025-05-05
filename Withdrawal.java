
package Testing;

//withdrawaling money class extends from transaction class
public class Withdrawal extends Transactions {
    private Accounts withdrawal;

    //constructors method#
    public Withdrawal() {
    }

    public Withdrawal(Accounts withdrawal) {
        this.withdrawal = withdrawal;
    }
    //setters and getters method#
    public Accounts getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(Accounts withdrawal) {
        this.withdrawal = withdrawal;
    }
    //to string method.
    @Override
    public String toString() {
        return "Withdrawal: " + "withdrawal=" + withdrawal + '.';
    }



}
