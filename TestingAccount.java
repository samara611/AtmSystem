//main class#
package Testing;


public class TestingAccount {


    public static void main(String[] args) {
        //create objects for accounts
        Holders h = new Holders(121, "ahmed", 45, "egypt");
        Accounts a = new Accounts( h, 2830);
        Transactions t = new Transactions(a, new Date(10,5,2021));
        System.out.println();
        Holders h1 = new Holders(122, "abdi", 34, "somalia");
        Accounts a1 = new Accounts( h1, 3190);
        Transactions t1 = new Transactions(a1, new Date(20,6,2021));
        System.out.println();
        Holders h2 = new Holders(123, "mohamed", 29, "norway");
        Accounts a2 = new Accounts( h2, 4550);
        Transactions t2 = new Transactions(a2, new Date(15,10,2021));


        //test and print all operations
        System.out.println("1st "+t);
        System.out.println("=.................=");
        TestingBank69.creatAccount(a);
        a.equals(h1);
        System.out.println("=.................=");
        System.out.println("Transaction for account 1");
        System.out.println(TestingBank69.depositmoney(a,500));
        System.out.println(TestingBank69.withdrawalmoney(a, 450));
        System.out.println(TestingBank69.transfer(a1, a, 250));
        System.out.println("=============");
        System.out.println("=============");
        System.out.println("2nd "+t1);
        System.out.println("=.................=");
        TestingBank69.creatAccount(a1);
        a1.equals(h2);
        System.out.println("=.................=");
        System.out.println("Transaction for account 2");
        System.out.println(TestingBank69.depositmoney(a1,300));
        System.out.println(TestingBank69.withdrawalmoney(a1, 550));
        System.out.println(TestingBank69.transfer(a2, a1, 300));
        System.out.println("=============");
        System.out.println("=============");
        System.out.println("3rd "+t2);
        System.out.println("=.................=");
        TestingBank69.creatAccount(a2);
        a2.equals(h2);
        System.out.println("=============");
        System.out.println("Transaction for account 3");
        System.out.println(TestingBank69.depositmoney(a2,1000));
        System.out.println(TestingBank69.withdrawalmoney(a2, 650));
        System.out.println(TestingBank69.transfer(a, a2, 5200));
        System.out.println("=.................=");
        System.out.println("=.................=");
        System.out.println("=.................=");

        System.out.println(TestingBank69.transact);
        System.out.println("=============");

        TestingBank69.printWriter();

        System.out.println();






    }

}
