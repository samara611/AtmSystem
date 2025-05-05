
package Testing;

//depositing money class extends from transaction class
public class Deposit extends Transactions {
    private Accounts deposit;

    //constructors method#
    public Deposit() {
    }

    public Deposit(Accounts deposit) {
        this.deposit = deposit;
    }
    //setters and getters method#
    public Accounts getDeposit() {
        return deposit;
    }

    public void setDeposit(Accounts deposit) {
        this.deposit = deposit;
    }

    //to string method.
    @Override
    public String toString() {
        return "Deposit: " + "deposit=" + deposit + '.';
    }



}
