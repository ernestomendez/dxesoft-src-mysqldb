package mx.com.oxsoftware.dxesoft.model.entities.contact;

import com.fasterxml.jackson.annotation.JsonBackReference;
import mx.com.oxsoftware.dxesoft.model.entities.AbstractEntity;
import mx.com.oxsoftware.dxesoft.utils.EmailType;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by ernesto on 12/13/14.
 *
 * Represents the email address in the database.
 */
@Entity
@Table(name = "email")
public class Email extends AbstractEntity implements Serializable {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Contact_id", referencedColumnName = "Id")
    @JsonBackReference
    private Contact contact;

    @Column(name = "Email", length = 250)
    private String email;

    @Column(name = "Status", length = 45)
    private String status;

    @Column(name = "Email_type")
    @Enumerated(EnumType.STRING)
    private EmailType emailType;

//    public int getContactId() {
//        return contactId;
//    }
//
//    public void setContactId(int contactId) {
//        this.contactId = contactId;
//    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EmailType getEmailType() {
        return emailType;
    }

    public void setEmailType(EmailType emailType) {
        this.emailType = emailType;
    }
}
