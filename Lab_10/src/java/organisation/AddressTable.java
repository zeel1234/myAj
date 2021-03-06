package organisation;
// Generated 9 Mar, 2020 4:47:27 PM by Hibernate Tools 4.3.1

import java.util.Set;




/**
 * AddressTable generated by hbm2java
 */
public class AddressTable  implements java.io.Serializable {


     private int addId;
     private String address;
     private Set<Employee> employees;

    public AddressTable() {
    }

	
    public AddressTable(int addId) {
        this.addId = addId;
    }
    public AddressTable(int addId, String address) {
       this.addId = addId;
       this.address = address;
    }
   
    public int getAddId() {
        return this.addId;
    }
    
    public void setAddId(int addId) {
        this.addId = addId;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
   
    public void setEmployee(Set<Employee> employees){
        this.employees = employees;
    }




}


