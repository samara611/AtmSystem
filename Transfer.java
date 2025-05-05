
package Testing;

//transfering money class extends from transaction class
public class Transfer extends Transactions {
    private Accounts transfer;

    //constructors method#
    public Transfer() {
    }

    public Transfer(Accounts transfer) {
        this.transfer = transfer;
    }
    //setters and getters method#
    public Accounts getTransfer() {
        return transfer;
    }

    public void setTransfer(Accounts transfer) {
        this.transfer = transfer;
    }

    //to string method.
    @Override
    public String toString() {
        return "Transfer: " + "transfer=" + transfer + '.';
    }


}
