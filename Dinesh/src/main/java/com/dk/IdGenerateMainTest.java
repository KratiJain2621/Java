package com.dk;

import javax.persistence.EntityManager;

import com.dk.dao.EmfProvider;

public class IdGenerateMainTest
{

	public static void main(String[] args)
	{
		try
		{
			EntityManager em = EmfProvider.getEm();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			EmfProvider.getEm().close();
			EmfProvider.getEmf().close();
		}
	}

}
