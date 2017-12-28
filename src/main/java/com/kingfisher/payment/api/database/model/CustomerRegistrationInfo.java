package com.kingfisher.payment.api.database.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class CustomerRegistrationInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String profileId;
    private String optileCustomerId;
    private String optileCustomerPassword;

    public CustomerRegistrationInfo(){
        //empty
    }

    public CustomerRegistrationInfo(@NotNull String profileId) {
        this.profileId = profileId;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getOptileCustomerId() {
        return optileCustomerId;
    }

    public void setOptileCustomerId(String optileCustomerId) {
        this.optileCustomerId = optileCustomerId;
    }

    public String getOptileCustomerPassword() {
        return optileCustomerPassword;
    }

    public void setOptileCustomerPassword(String optileCustomerPassword) {
        this.optileCustomerPassword = optileCustomerPassword;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
