package com.gyf.backoffice.constants;

import com.gyf.log.LogWriter;
import com.gyf.parametersloader.loader.AppParameters;

public class KeyConstant {

	public static String BACKOFFICE_REMOTE = "";
	public static String HOST = "";
	public static Integer SERVER = Integer.valueOf(3);
	
	public static final String USER = "USER";
	public static final String SERVICE_POINT = "SERVICE_POINT";
	public static final String ENTITY = "ENTITY";
	public static final String DEVICE = "DEVICE";
	
	static
	{
		try{
			BACKOFFICE_REMOTE = AppParameters.getInstance().getParameter("REMOTE_BACKOFFICE_BEAN");
			// HOST = "localhost:3701";
			HOST = AppParameters.getInstance().getParameter("HOST_BACKOFFICE_BEAN");;
		}catch (Exception e) {
			LogWriter.writeErrorLog(
					"Ocurrio un error cargando los parametros del aplicativo FRONT Backoffice->>PRESENTACION<<-- - " + e.getMessage(), "static");
		}
	}
}
