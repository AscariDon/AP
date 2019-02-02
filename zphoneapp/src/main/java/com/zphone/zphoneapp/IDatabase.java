package com.zphone.zphoneapp;

public interface IDatabase <T> {

	boolean save(T item);
	T retrievefirestItem();
}
