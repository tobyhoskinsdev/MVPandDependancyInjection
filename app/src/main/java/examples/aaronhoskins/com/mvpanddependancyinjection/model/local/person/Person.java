package examples.aaronhoskins.com.mvpanddependancyinjection.model.local.person;

public class Person {
    private String fistName;
    private String lastName;
    private String age;
    private String gender;
    private String birthDate;
    private boolean isSane;

    public Person() {
    }

    public Person(String fistName, String lastName, String age, String gender, String birthDate, boolean isSane) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.birthDate = birthDate;
        this.isSane = isSane;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isSane() {
        return isSane;
    }

    public void setSane(boolean sane) {
        isSane = sane;
    }
}
