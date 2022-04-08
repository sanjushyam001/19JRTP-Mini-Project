package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import in.ashokit.entity.Contact;

public interface IContactService {

	public boolean saveContact(Contact contact);
	public boolean deleteContactById(Integer id);
	public Contact getContactById(Integer id);
	public List<Contact> getAllContacts();
	
}
