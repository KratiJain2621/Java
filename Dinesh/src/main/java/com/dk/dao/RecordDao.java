package com.dk.dao;

import java.util.List;

import com.dk.model.Record;

public interface RecordDao
{
	Record findById(int bid);
	Record updateRecord(Record record);
	Record addRecord(Record record);
	boolean removeRecord(Record record);
	List<Record> findAll(); //orgranize import control + shift + O , control 1

}
