package com.zphone.zphoneapp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PhoneDatabase implements IDatabase<IPhone>{

	private final String DB_NAME = "phones.db";
	public boolean save(IPhone item) {
		boolean success = false;
		ObjectOutputStream os = null;
		try {
			os = new ObjectOutputStream(new FileOutputStream(DB_NAME));
			os.writeObject(item);
			success = true;
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}	
		finally
		{	
				if(os!= null)
					try {
						os.close();
					}catch(IOException e)
				{
						e.printStackTrace();
				}
			}
			return success;
		}	
		
	public IPhone retrievefirestItem() {
		
		IPhone data = null;
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(
					new FileInputStream(DB_NAME)
					);
			data = (IPhone) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(ois!=null)ois.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		return data;
	}

}	

