package capability4.Service;


import capability4.Entity.Contact;

public class PhoneService {

	public Contact[] sortByName(Contact[] contacts) {
		for (int i = 1; i < contacts.length; i++) {
			Contact val = contacts[i];
			int j = i - 1;
			while (j >= 0 && contacts[j].getName().compareTo(val.getName()) > 0) {
				contacts[j + 1] = contacts[j];
				j = j - 1;
			}
			contacts[j + 1] = val;
		}
		return contacts;
	}

	public int searchContactByName(String contactname, Contact[] contacts) {
		contacts = sortByName(contacts);
		System.out.println("Contact name sorted");
		for (int i = 0; i < contacts.length; i++) {
			System.out.println(contacts[i].getName());
		}

		int l = 0, u = contacts.length - 1, mid;
		int position = -1;
		int flag = 0;
		while (l <= u) {
			mid = (l + u) / 2;
			int res = contactname.compareTo(contacts[mid].getName());
			if (res == 0) {
				flag = 1;
				position = mid;
				break;

			}
			if (res > 0) {
				l = mid + 1;
			} else
				u = mid - 1;
		}
		if(flag==1)
		{
			return (position+1);
					
		}
		else
			return -1;
	}



	public String updateNumber(String name1, long number, Contact[] contacts) {
		for (int i = 0; i < contacts.length; i++) {
			if (name1.equals(contacts[i].getName())) {
				contacts[i].setContactnumber(number);;
				return "Updated SuccessFully!!";
			}

		}
		return "Actor not found";
	}

}
