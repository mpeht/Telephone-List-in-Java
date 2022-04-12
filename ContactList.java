/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactlist;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author mpeht
 */
public class ContactList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        ManagementContact mc = new ManagementContact();
        Contact contact;
        String name, newName, phone, newPhone;
        int op01, op02;
        do {
        op01 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the option that you wish: \n"
                + "1 - Register Friend \n"
                + "2 - Search a friend in the list \n"
                + "3 - Search by phone \n"
                + "4 - Change data of the friend \n"
                + "5 - List Every \n"
                + "6 - Exit \n"));
        
        switch(op01){
            
            case 1:
                contact = new Contact();
                contact.setName(JOptionPane.showInputDialog("Input the Friend's name:"));
                contact.setAdress(JOptionPane.showInputDialog("Input the friend's adress:"));
                contact.setHouseNumber(Integer.parseInt(JOptionPane.showInputDialog("Input the Friend's number house: ")));
                contact.setTelNumber(JOptionPane.showInputDialog("Input the Friend's telephone or cellphone:"));
                contact.setEmail(JOptionPane.showInputDialog("Input the Friend's e-mail:"));
                mc.add(contact);
                break;
            case 2:
                name = (JOptionPane.showInputDialog("Input the Friend's name that you desire search in the list:"));
                mc.searchContactByName(name);
                break;
            case 3:
                phone = (JOptionPane.showInputDialog("Input the Friend's telephone that you desire search in the List:"));
                mc.searchContactByPhone(phone);
                break;
            case 4:
                do{
                  op02 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the option that you wish: \n"
                + "1 - Change Friend's name \n"
                + "2 - Change Friend's telephone\n"
                + "3 - Exit \n"));
                  
                  switch(op02)  {
                      case 1:
                          name = (JOptionPane.showInputDialog("Input the Friend's name that you desire change in the list:"));
                          newName = (JOptionPane.showInputDialog("Input the Friend's new name that you desire change in the list:")); 
                          mc.changeContactByName(name, newName);
                          break;
                      case 2:
                          phone = (JOptionPane.showInputDialog("Input the Friend's telephone that you desire change in the list:"));
                          newPhone = (JOptionPane.showInputDialog("Input the Friend's new telephone that you desire change in the list:")); 
                          mc.changeContactByPhone(phone, newPhone);
                          break;
                      case 3:
                          System.exit(0);
                          break;
                          
                  }
                }while(op02 >= 1 && op02 <= 2);
                break;
            case 5:
                mc.Public();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                 JOptionPane.showMessageDialog(null, "Not Valid Option");
                break;
        }
    }while (op01 >= 1 && op01 <= 6);
        }
}
