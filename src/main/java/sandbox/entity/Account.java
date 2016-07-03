package sandbox.entity;

import org.forweb.database.AbstractEntity;

import javax.persistence.*;

@Entity
public class Account extends AbstractEntity{
    @Column(name = "client")
    private Integer clientId;



    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

}
