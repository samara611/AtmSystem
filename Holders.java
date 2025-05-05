
package Testing;

//the holder class#

public class Holders {
    //ci as a civil id.
    private int ci;
    private String name;
    private int age;
    private String country;

    //constructors method#
    public Holders() {}

    public Holders(int ci, String name, int age, String country) {
        this.ci = ci;
        this.name = name;
        this.age = age;
        this.country = country;
    }

    //setters and getters method#
    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    //to string method.
    @Override
    public String toString() {
        return "Holder details "+ "\n" +"{" + "civil id is: " + ci + ", name is: " + name + ", age is: " + age + ", country is: " + country + '}';
    }



}
