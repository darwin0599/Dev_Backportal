package com.backoffice.client.customer.handler;



import com.gyf.jaxws.handler.JaxSOAPHandler;
import com.gyf.log.LogWriter;

public class SrvIntCustomer extends JaxSOAPHandler
{

	@Override
	protected void customProcess()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void persistDataBase()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void persistFile()
	{
		LogWriter.writeHandler(super.strXMLMessage);
	}




}
