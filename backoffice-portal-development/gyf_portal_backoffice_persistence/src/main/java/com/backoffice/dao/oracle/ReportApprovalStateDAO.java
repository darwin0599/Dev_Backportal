package com.backoffice.dao.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.backoffice.dao.interfaces.IReportApprovalStateDAO;
import com.backoffice.vo.ReportApprovalStateVO;
import com.gyf.conncetion.ConnectionBuilder;
import com.gyf.constants.ConstantesSeverity;
import com.gyf.exception.ApplicationException;
import com.gyf.exception.mngr.ExceptionManager;

public class ReportApprovalStateDAO implements IReportApprovalStateDAO {
	
	public static final String CLASS_NAME = "com.backoffice.dao.oracle.ReportApprovalStateDAO";
	
	private Connection connection;
	
	private static final String QUERY = "SELECT * FROM CREDIT_CARD.REPORT_APPROVAL_STATE_V";
	
	protected ReportApprovalStateDAO(Connection connection) {
		this.connection = connection;
	}

	@Override
	public List<ReportApprovalStateVO> findBy(ReportApprovalStateVO filter) throws ApplicationException {
		final String METHOD_NAME = "findBy()";
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<ReportApprovalStateVO> result = null;
		String query = QUERY;
		try {
			query = query + this.buildFilter(filter);
			ps = this.connection.prepareStatement(query);
			
			rs = ps.executeQuery();
			ReportApprovalStateVO item = new ReportApprovalStateVO();
			result = new ArrayList<ReportApprovalStateVO>();
			while( rs.next() ) {
				item = new ReportApprovalStateVO();
				item.setFechaCreacion(rs.getString("FECHA_CREACION"));
				item.setTipoDocumento(rs.getString("TIPO_DOCUMENTO"));
				item.setDocumento(rs.getString("DOCUMENTO"));
				item.setNumeroTarjeta(rs.getString("NUMERO_TARJETA"));
				item.setEstado(rs.getString("ESTADO"));
				item.setValorCupoAprobado(rs.getBigDecimal("VALOR_CUPO_APROBADO"));
				item.setValorCupoAvances(rs.getBigDecimal("VALOR_CUPO_AVANCES"));
				item.setNombreCajero(rs.getString("NOMBRE_CAJERO"));
				item.setRegional(rs.getString("REGIONAL"));
				item.setAgencia(rs.getString("AGENCIA"));
				item.setPuntoServicio(rs.getString("PUNTO_SERVICIO"));
				item.setCiudadOficina(rs.getString("CIUDAD_OFICINA"));
				item.setNombreOficina(rs.getString("NOMBRE_OFICINA"));
				item.setDireccionEntrega(rs.getString("DIRECCION_ENTREGA"));
				result.add(item);
			}
		}catch (Exception e) {
			ExceptionManager.controlApplicationException(e, CLASS_NAME, METHOD_NAME,
					"Error consultando la vista REPORT_APPROVAL_STATE_V", ConstantesSeverity.FATAL);
		} finally {
			ConnectionBuilder.closeResources(ps, rs);
		}
		return result;
	}
	
	private String buildFilter(ReportApprovalStateVO filter) {
		StringBuilder whereClause = new StringBuilder(" WHERE ");
		boolean filled = false;
		if( filter.getTipoDocumento() != null && !filter.getTipoDocumento().isEmpty() ) {
			whereClause.append("TIPO_DOCUMENTO = '"+filter.getTipoDocumento()+"'");
			filled = true;
		}
		if( filter.getDocumento() != null && !filter.getDocumento().isEmpty() ) {
			whereClause.append(filled ? " AND " : "").append("DOCUMENTO = '"+filter.getDocumento()+"'");
			filled = true;
		}
		if( filter.getEstado() != null && !filter.getEstado().isEmpty() ) {
			whereClause.append(filled ? " AND " : "").append("ESTADO = '"+filter.getEstado()+"'");
		}
		if( (filter.getFiltroFechaInicio() != null && !filter.getFiltroFechaInicio().isEmpty()) && 
				( filter.getFiltroFechaFin() != null && !filter.getFiltroFechaFin().isEmpty())) {
			whereClause.append(filled ? " AND " : "");
			whereClause.append("TO_TIMESTAMP(FECHA_CREACION, 'DD-MM-YYYY HH:MI:SS PM') >= ").append("TO_TIMESTAMP('"+filter.getFiltroFechaInicio()+"', 'DD-MM-YYYY HH:MI:SS PM')");
			whereClause.append(" AND ");
			whereClause.append("TO_TIMESTAMP(FECHA_CREACION, 'DD-MM-YYYY HH:MI:SS PM') <= ").append("TO_TIMESTAMP('"+filter.getFiltroFechaFin()+"', 'DD-MM-YYYY HH:MI:SS PM')");
		}
		return whereClause.toString();
	}
	
}
