package src;

import org.homefix.homefix.Service;

import java.util.ArrayList;

public class ServiceProvider extends User {
    private String type;
    private String contactInfo;
    private ArrayList<Rating> ratings;
    private ArrayList<Service> services;

    public ServiceProvider(String type,String contactInfo){
        this.type = type;
        this.contactInfo = contactInfo;
    }

    public boolean createNewService(String attributeOne,String attributeTwo){
        return true; //temporary
    }
    public boolean requestApprovalFromAdmin(Service s){
        return true; //temporary
    }

    public boolean addService(Service s){
        return true; //temporary
    }

    public boolean deleteService(Service s){
        return true;//temporary
    }

    public boolean isServiceAvailble(Service s){
        return true;//temporary
    }

    public String getType(){
        return type;
    }

    public String getContactInfo(){
        return contactInfo;
    }
}
