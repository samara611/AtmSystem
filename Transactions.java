
package Testing;

//the transaction class#

public class Transactions  {
    //Acc as account.
    private Accounts AccAffected;  //the accaffected variable is from Account class
    private Date date;  //date variable is from Date class
    private double AmountOfMoney;

    //constructors method#
    public Transactions() {}

    public Transactions(Accounts AccAffected, Date date) {
        this.AccAffected = AccAffected;
        this.date = date;

    }

    //setters and getters method#
    public Accounts getAccAffected() {
        return AccAffected;
    }

    public void setAccAffected(Accounts AccAffected) {
        this.AccAffected = AccAffected;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmountOfMoney() {
        return AmountOfMoney;
    }

    public void setAmountOfMoney(double AmountOfMoney) {
        this.AmountOfMoney = AmountOfMoney;
    }
    //to string method.
    @Override
    public String toString() {
        return "Transactions"+"\n"  +"The date is: "+ date +  AccAffected +"\n";
    }



}
