package com.zphone.zphoneapp;
import com.zphone.zphoneapp.*;
public class PhoneDatabaseTest {

	public void shouldSavePhoneObject()
	{
		IDatabase IPhone db = new PhoneDatabase();
		IPhone phone = new IPhone ("BLU001","1253",12000,"BLU");
		boolean sucess = db.save(phone);
	}
	
	public void shouldRetrievePhoneObject()
	{
		
	}
}
