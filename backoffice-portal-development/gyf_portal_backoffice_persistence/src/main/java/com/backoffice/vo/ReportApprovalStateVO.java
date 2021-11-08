package com.backoffice.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class ReportApprovalStateVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String fechaCreacion;
	private String tipoDocumento;
	private String documento;
	private String numeroTarjeta;
	private String estado;
	private BigDecimal valorCupoAprobado;
	private BigDecimal valorCupoAvances;
	private String nombreCajero;
	private String regional;
	private String agencia;
	private String puntoServicio;
	private String ciudadOficina;
	private String nombreOficina;
	private String direccionEntrega;
	
	private String filtroFechaInicio;
	private String filtroFechaFin;
	
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public BigDecimal getValorCupoAprobado() {
		return valorCupoAprobado;
	}
	public void setValorCupoAprobado(BigDecimal valorCupoAprobado) {
		this.valorCupoAprobado = valorCupoAprobado;
	}
	public BigDecimal getValorCupoAvances() {
		return valorCupoAvances;
	}
	public void setValorCupoAvances(BigDecimal valorCupoAvances) {
		this.valorCupoAvances = valorCupoAvances;
	}
	public String getNombreCajero() {
		return nombreCajero;
	}
	public void setNombreCajero(String nombreCajero) {
		this.nombreCajero = nombreCajero;
	}
	public String getRegional() {
		return regional;
	}
	public void setRegional(String regional) {
		this.regional = regional;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getPuntoServicio() {
		return puntoServicio;
	}
	public void setPuntoServicio(String puntoServicio) {
		this.puntoServicio = puntoServicio;
	}
	public String getCiudadOficina() {
		return ciudadOficina;
	}
	public void setCiudadOficina(String ciudadOficina) {
		this.ciudadOficina = ciudadOficina;
	}
	public String getNombreOficina() {
		return nombreOficina;
	}
	public void setNombreOficina(String nombreOficina) {
		this.nombreOficina = nombreOficina;
	}
	public String getDireccionEntrega() {
		return direccionEntrega;
	}
	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}
	public String getFiltroFechaInicio() {
		return filtroFechaInicio;
	}
	public void setFiltroFechaInicio(String filtroFechaInicio) {
		this.filtroFechaInicio = filtroFechaInicio;
	}
	public String getFiltroFechaFin() {
		return filtroFechaFin;
	}
	public void setFiltroFechaFin(String filtroFechaFin) {
		this.filtroFechaFin = filtroFechaFin;
	}	

}
