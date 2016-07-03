package org.forweb.sandbox.entity;

import org.forweb.database.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Client extends AbstractEntity {
    private String username;
    private String email;
    private String password;
    private Boolean donator;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "clientId")
    private List<Account> accounts;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getDonator() {
        return donator;
    }

    public void setDonator(Boolean donator) {
        this.donator = donator;
    }
    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

}

