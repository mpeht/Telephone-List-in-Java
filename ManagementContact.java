/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactlist;

import java.util.ArrayList;

/**
 *
 * @author mpeht
 */
public class ManagementContact {

    private ArrayList<Contact> app = new ArrayList<Contact>();

    public void add(Contact obj) {
        app.add(obj);
    }

    public String searchContactByName(String name) {
        String profile = "";
        for (Contact obj : app) {
            if (obj.getName().equalsIgnoreCase(name)) {
                profile = obj.toPrint() + "\n";
                
            }
        }
        return profile;
    }
    public String changeContactByName(String name, String newName) {
        String profileNew = "";
        for (Contact obj : app) {
            if (obj.getName().equalsIgnoreCase(name)) {
                obj.setName(newName);
                profileNew = obj.toPrint() + "\n";
                
            }
        }
        return profileNew;
    }

    public String searchContactByPhone(String phone) {
        String profilePhone = "";
        for (Contact obj : app) {
            if (obj.getTelNumber().equalsIgnoreCase(phone)) {
                profilePhone = obj.toPrint() + "\n";
            }
        }
        return profilePhone;
    }
    public String changeContactByPhone(String phone, String newPhone) {
        String profilePhoneNew = "";
        for (Contact obj : app) {
            if (obj.getTelNumber().equalsIgnoreCase(phone)) {
                obj.setTelNumber(newPhone);
                profilePhoneNew = obj.toPrint() + "\n";
            }
        }
        return profilePhoneNew;
    }
    public String Public()  {
        String answerExit = "";
        for(Contact obj : app)   {
            answerExit = obj.toPrint()+ "\n";
        }
        return answerExit;
    }
}
    
               
        
        
        
