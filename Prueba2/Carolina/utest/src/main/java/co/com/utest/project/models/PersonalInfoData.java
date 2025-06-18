package co.com.utest.project.models;

public class PersonalInfoData {

    private String firstName;
    private String lastName;
    private String email;
    private String birthMonth;
    private String birthDay;
    private String birthYear;

    public PersonalInfoData(String firstName, String lastName, String email, String birthMonth, String birthDay, String birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getBirthYear() {
        return birthYear;
    }
}

