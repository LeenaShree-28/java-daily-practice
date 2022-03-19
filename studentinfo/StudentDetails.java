package studentinfo;

import java.io.Serializable;

class StudentDetails implements Serializable{
    private String name,gender,mail;
    private long phoneNumber;
    private int id;
    public StudentDetails(String name, String gender, String mail, long phoneNumber, int id) {
        this.name = name;
        this.gender = gender;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
