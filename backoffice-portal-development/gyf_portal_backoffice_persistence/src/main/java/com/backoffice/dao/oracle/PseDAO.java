package com.backoffice.dao.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.backoffice.dao.interfaces.IPseDAO;
import com.backoffice.vo.PseVO;
import com.gyf.conncetion.ConnectionBuilder;
import com.gyf.constants.ConstantesSeverity;
import com.gyf.exception.ApplicationException;
import com.gyf.exception.mngr.ExceptionManager;

public class PseDAO implements IPseDAO {

	public static final String CLASS_NAME = "com.backoffice.dao.oracle.PseDAO";

	private Connection connection;

	protected PseDAO(Connection connection) {
		this.connection = connection;
	}

	@Override
	public List<PseVO> selectPseByCustomer(PseVO pse, Date fechaIni, Date fechaFin, String estado)
			throws ApplicationException {
		final String METHOD_NAME = "selectPseByCustomer";
		String query = "SELECT * FROM TRANSACCION_V WHERE MEDIO_PAGO = 'PAYU' AND USUARIO_ID = ? AND (trunc(FECHA_OPERACION)  >= trunc(?) AND trunc(FECHA_OPERACION)  <= trunc(?) )";

		if (!estado.equalsIgnoreCase("todos")) {
			query = query + " AND ESTADO = ? ";
		}
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<PseVO> listPse = null;
		PseVO itemPse = null;

		try {
			java.util.Calendar calIni = Calendar.getInstance();
			calIni.setTime(fechaIni);
			calIni.set(Calendar.HOUR_OF_DAY, 0);
			calIni.set(Calendar.MINUTE, 0);
			calIni.set(Calendar.SECOND, 0);
			calIni.set(Calendar.MILLISECOND, 0);

			java.util.Calendar calFin = Calendar.getInstance();
			calFin.setTime(fechaFin);
			calFin.set(Calendar.HOUR_OF_DAY, 23);
			calFin.set(Calendar.MINUTE, 59);
			calFin.set(Calendar.SECOND, 59);
			calFin.set(Calendar.MILLISECOND, 0);

			ps = this.connection.prepareStatement(query);
			// ps.setString(1, pse.getMethodOfPayment());
			ps.setString(1, pse.getUserId());
			ps.setDate(2, new java.sql.Date(calIni.getTime().getTime()));
			ps.setDate(3, new java.sql.Date(calFin.getTime().getTime()));
			if (!estado.equalsIgnoreCase("todos")) {
				ps.setString(4, estado);
			}

			rs = ps.executeQuery();

			listPse = new ArrayList<PseVO>(0);

			while (rs != null && rs.next()) {
				itemPse = new PseVO();
				itemPse.setOperationDae(new Date(rs.getDate("FECHA_OPERACION").getTime()));
				itemPse.setType(rs.getString("TIPO"));
				itemPse.setMethodOfPayment(rs.getString("MEDIO_PAGO"));
				itemPse.setStatus(rs.getString("ESTADO"));
				itemPse.setNotificationStatus(rs.getString("ESTADO_NOTIFICACION"));
				itemPse.setNotificationAttempts(rs.getString("INTENTOS_NOTIFICACION"));

				listPse.add(itemPse);
			}

			return listPse;

		} catch (Exception e) {
			ExceptionManager.controlApplicationException(e, CLASS_NAME, METHOD_NAME,
					"Error consultando la vista TRANSACTION_V", ConstantesSeverity.FATAL);
		} finally {
			ConnectionBuilder.closeResources(ps, rs);
		}

		return null;
	}

}
