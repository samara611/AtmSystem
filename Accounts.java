
package Testing;

//the account class#

public class Accounts  {
    private String AccNumber;
    private double Balance;
    private Holders Holder;  //the holder variable is from holder class

    //constructors method#
    public Accounts() {}

    public Accounts(Holders Holder, double Balance) {
        this.AccNumber = "SOA69_"+Holder.getCi();  //accont number is a prifix added to the civi id
        this.Balance = Balance;
        this.Holder=Holder;
    }

    //setters and getters method#
    public String getAccNumber() {
        return AccNumber;
    }

    public void setAccNumber(String AccNumber) {
        this.AccNumber = AccNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public Holders getHolder() {
        return Holder;
    }

    public void setHolder(Holders Holder) {
        this.Holder = Holder;
    }
    //to string method.
    @Override
    public String toString() {
        return "\n"+"Account details "+"\n" +"{" + "Account Number is: " + AccNumber + ", Balance = " + Balance + '}' + "\n"+ Holder ;
    }

    //the equal method checking the equality of the civil id whether they are equal or not
    public int equals(Holders a){

        if (Holder.getCi()==(a.getCi())){
            System.out.println("login was not successful please try!!");
        }else{
            System.out.println("login was successful");

        }
        return a.getCi();
    }
}
