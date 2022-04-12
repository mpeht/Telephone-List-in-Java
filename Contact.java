/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactlist;

/**
 *
 * @author mpeht
 */
public class Contact {
    
    private String name;
    private String adress;
    private int houseNumber;
    private String telNumber;
    private String email;

    public Contact(String name, String adress, int houseNumber, String telNumber, String email) {
        this.name = name;
        this.adress = adress;
        this.houseNumber = houseNumber;
        this.telNumber = telNumber;
        this.email = email;
    }

    public Contact() {
        this(null, null, 0, null, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void changeRegistration(String name, String adress, int houseNumber, String telNumber, String email)    {
            setName(name);
            setAdress(adress);
            setHouseNumber(houseNumber);
            setTelNumber(telNumber);
            setEmail(email);
    
    }
    public String toPrint() {
        String answer;
        answer = "\n Name: " + getName() + "\n Adress: " + getAdress() + " " + getHouseNumber() + "\n Telephone: " + getTelNumber() + "\n E-mail: " + getEmail();
        return answer;
        
    }

    
    
     
}
