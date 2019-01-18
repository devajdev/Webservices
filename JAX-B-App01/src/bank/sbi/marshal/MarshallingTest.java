package bank.sbi.marshal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import bank.sbi.account.BankaccountType;

public class MarshallingTest {

	public static void main(String[] args) throws JAXBException {
		
		JAXBContext ctx=JAXBContext.newInstance("bank.sbi.account");
		Marshaller marshal = ctx.createMarshaller();
		BankaccountType type=new BankaccountType();
		type.setCurrentAccount(null);
		type.setSavingAccount(null);
		

	}

}
