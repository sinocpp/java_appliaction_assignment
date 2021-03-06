package User;
import User.UserEnums.Gender;
import User.UserEnums.Status;
import User.UserSubClass.Account;
import User.UserSubClass.Adress;
import User.UserSubClass.Age;
import User.UserSubClass.Name;

// Base user class. Implements basic interface and properties

class BaseUser {
    private int id = 0;
    private Status status;
    private Account financialStatus;
    private Age age;
    private Name nameAndSurName;
    private Gender gender = Gender.NONE;
    private String companyName = "";
    private String eMailAdress = "";
    private String telephoneNumber = "";
    private Adress Adress;

    public int getId() {
        return id;
    }
    public void setId(int id) {
            this.id = id;
        }
    public Status getStatus() {
            return status;
        }
    public void setStatus(Status status) {
            this.status = status;
        }
    public Account getFinancialStatus() {
            return financialStatus;
        }
    public void setFinancialStatus(Account financialStatus) {
            this.financialStatus = financialStatus;
        }
    public Age getAge() {
            return age;
        }
    public void setAge(Age age) {
            this.age = age;
        }
    public Name getNameAndSurName() {
            return nameAndSurName;
        }
    public void setNameAndSurName(Name nameAndSurName) {
            this.nameAndSurName = nameAndSurName;
        }
    public Gender getGender() {
            return gender;
        }
    public void setGender(Gender gender) {
            this.gender = gender;
    }
    public String getCompanyName() {
            return companyName;
        }
    public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }
    public String geteMailAdress() {
            return eMailAdress;
        }
    public void setAdress(Adress adress) {
            Adress = adress;
        }
    public String getTelephoneNumber() {
            return telephoneNumber;
        }
    public void setTelephoneNumber(String telephoneNumber) {
            this.telephoneNumber = telephoneNumber;
        }
    public Adress getAdress() {
            return Adress;
        }
    public void seteMailAdress(String eMailAdress) {
            this.eMailAdress = eMailAdress;
        }
}

