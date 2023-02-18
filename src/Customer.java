public class Customer {
    private String name;
    private String address;
    private int age;
    private double salary;

    public void setName(String pName){
        name = pName;
    }

    public String getName(){
        return name;
    }

    public void setAddress(String pAddress){
        address = pAddress;
    }

    public String getAddress(){
        return address;
    }

    public void setAge(int pAge){
        age = pAge;
    }

    public int getAge(){
        return age;
    }

    public void setSalary(double pSalary){
        salary = pSalary;
    }

    public double getSalary(){
        return salary;
    }

}
