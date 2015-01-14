package mx.com.oxsoftware.dxesoft.service.contact;

import mx.com.oxsoftware.dxesoft.model.entities.contact.Contact;

/**
 * Created by ernesto on 11/12/14.
 *
 * Manages all "contact" operations.
 */
public interface ContactService {

    void createContact(Contact contact);

    void deleteContactById(long id);

    Iterable<Contact> findAll();

    Contact findById(Long id);

    void update(Contact contact) throws Exception;

}
