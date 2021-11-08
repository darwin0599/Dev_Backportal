package com.gyf.backoffice.action;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.primefaces.context.RequestContext;

import com.backoffice.model.to.CustomerBackOfficeRequestTO;
import com.backoffice.model.to.CustomerBackOfficeResponseTO;
import com.backoffice.model.to.ValueDomainElementTO;
import com.gyf.backoffice.constants.InitServicesEnum;
import com.gyf.backoffice.constants.KeyConstant;
import com.gyf.backoffice.constants.Light;
import com.gyf.backoffice.constants.NavRule;
import com.gyf.backoffice.delegate.BackOfficeDelegate;
import com.gyf.backoffice.model.InitModel;
import com.gyf.backoffice.model.SessionContextModel;
import com.gyf.backoffice.model.lights.LightData;
import com.gyf.exception.ApplicationException;
import com.gyf.exception.ControlApplicationException;
import com.gyf.tools.autenticacionsbi.constantes.AutenticacionConstantes;
import com.gyf.tools.autenticacionsbi.integracion.AutenticacionIntegracion;
import com.gyf.tools.autenticacionsbi.transferencia.response.ValidaCajeroRespTO;
import com.gyf.tools.autenticacionsiif.bean.CashierValidateBean;
import com.gyf.tools.autenticacionsiif.to.CashierValidateResponseTO;
import com.gyf.tools.autenticacionsiif.to.CashierValidateTO;
import com.gyf.tools.presentacion.backing.ActionUtil;
import com.gyf.tools.presentacion.exception.PresentationException;
import com.gyf.tools.presentacion.validator.ValidatorUtil;

@ManagedBean(name="initAction")
@SessionScoped
public class InitAction extends ActionUtil{
	private String cajeroStr;
	private String puntoServicoStr;
	
	private InitModel model;
	private BackOfficeDelegate delegate;
	private CustomerBackOfficeRequestTO request;
	
	private ValidaCajeroRespTO cajeroRespTO = null;

	private String elementosUrl1 = null;
	private String elementosUrl2 = null;
	private String urlParameters = null;

	private final boolean DEBUG = false;
	
	private Long idOperationAdmin = null;
	
	public InitAction() {
		this.model = new InitModel();
		this.delegate = new BackOfficeDelegate();
		this.model.setLoadContent(false);
	}
	
	public LightData emailLight() {
		final String FIELD_NAME = "Email";
		try {
			if(this.model.getEmail() == null) {
				CustomerBackOfficeResponseTO response = this.delegate.emailAndMobileInformation(this.request);
				String image = (response.isEmailFlag()) ? Light.OK.getImage() : Light.OUT.getImage();
				String email = (response.isEmailFlag()) ? response.getEmail() : "";
				this.request.setEmail(email);
				this.model.setEmail(new LightData(FIELD_NAME, image, getLabel(response.getEmail())));
				// LLeno los nombres en el bombillo
				this.model.getEmail().setFirstName(response.getFirstName());
				this.model.getEmail().setLastName(response.getLastName());
				this.model.getEmail().setMiddleName(response.getMiddleName());
				this.model.getEmail().setMiddleLastName(response.getMiddleLastName());
				System.out.println("emailLight Loaded!!");
			}
		} catch (Exception e) {
			this.model.setEmail(new LightData(FIELD_NAME, Light.ERROR.getImage(), getErrorMsg(e)));
		}
		return this.model.getEmail();
	}
	
	public LightData cellphoneLight() {
		final String FIELD_NAME = "Celular";
		try {			
			if(this.model.getCellphone() == null) {
				CustomerBackOfficeResponseTO response = this.delegate.emailAndMobileInformation(this.request);
				String image = (response.isMobileFlag()) ? Light.OK.getImage() : Light.OUT.getImage();
				String mobile = (response.isMobileFlag()) ? response.getMobile() : "";
				this.request.setMobile(mobile);
				this.model.setCellphone(new LightData(FIELD_NAME, image, getLabel(response.getMobile())));
				System.out.println("cellphoneLight Loaded!!");
			}			
		} catch (Exception e) {
			this.model.setEmail(new LightData(FIELD_NAME, Light.ERROR.getImage(), getErrorMsg(e)));
		}
		return this.model.getCellphone();
	}
	
	public LightData suitableForRegLight() {
		final String FIELD_NAME = "Apto Para Registro";
		try {
			if(this.model.getSuitableForReg() == null) {
				CustomerBackOfficeResponseTO response = this.delegate.emailAndMobileInformation(this.request);
				String image = (response.isAvailable()) ? Light.OK.getImage() : Light.MINUS.getImage();
				this.model.setSuitableForReg(new LightData(FIELD_NAME, image, ""));
				System.out.println("suitableForRegLight Loaded!!");
			}			
		} catch (Exception e) {
			this.model.setSuitableForReg(new LightData(FIELD_NAME, Light.ERROR.getImage(), getErrorMsg(e)));
		}
		return this.model.getSuitableForReg();
	}
	
	public LightData sarlaftLight() {
		final String FIELD_NAME = "SARLAFT";
		try {
			if(this.model.getSarlaft() == null) {
				this.request.setFirstName(this.emailLight().getFirstName());
				this.request.setLastName(this.emailLight().getLastName());
				this.request.setMiddleName(this.emailLight().getMiddleName());
				this.request.setMiddleLastName(this.emailLight().getMiddleLastName());
				CustomerBackOfficeResponseTO response = this.delegate.registredAndComplianceList(this.request);
				String image = (response.isComplianceListFlag()) ? Light.MINUS.getImage() : Light.OK.getImage();
				this.model.setSarlaft(new LightData(FIELD_NAME, image, ""));
				System.out.println("sarlaftLight Loaded!!");
			}			
		} catch (Exception e) {
			this.model.setSarlaft(new LightData(FIELD_NAME, Light.ERROR.getImage(), getErrorMsg(e)));
		}
		return this.model.getSarlaft();
	}
	
	public LightData registryLight() {
		final String FIELD_NAME = "Registro";
		try {
			if(this.model.getRegistry() == null) {
				CustomerBackOfficeResponseTO response = this.delegate.registredAndComplianceList(this.request);
				String image = (response.isRegistredFlag()) ? Light.OK.getImage() : Light.OUT.getImage();
				this.model.setRegistry(new LightData(FIELD_NAME, image, getLabel(response.getRegistredInit())));
				this.model.getRegistry().setRegistered(response.isRegistredFlag());
				System.out.println("registryLight Loaded!!");
			}			
		} catch (Exception e) {
			this.model.setRegistry(new LightData(FIELD_NAME, Light.ERROR.getImage(), getErrorMsg(e)));
		}
		return this.model.getRegistry();
	}
	
	public LightData initSessionLigth() {
		final String FIELD_NAME = "Inicio Sesion";
		try {
			if(this.model.getInitSession() == null) {
				CustomerBackOfficeResponseTO response = this.delegate.customerExtraData(this.request);
				String image = (this.registryLight().isRegistered() && response.isSessionInitFlag()) ? Light.OK.getImage() : 
					Light.OUT.getImage();
				this.model.setInitSession(new LightData(FIELD_NAME, image, getLabel(response.getSessionInit())));
				System.out.println("initSessionLigth Loaded!!");
			}
		} catch (Exception e) {
			this.model.setInitSession(new LightData(FIELD_NAME, Light.ERROR.getImage(), getErrorMsg(e)));
		}
		return this.model.getInitSession();
	}
	
	public LightData habitTrxLight() {
		final String FIELD_NAME = "Habito Trx";
		try {
			if(this.model.getHabitTrx() == null) {
				CustomerBackOfficeResponseTO response = this.delegate.customerExtraData(this.request);
				String image = (this.registryLight().isRegistered() && response.isHabitsFlag()) ? Light.OK.getImage() : Light.OUT.getImage();
				this.model.setHabitTrx(new LightData(FIELD_NAME, image, ""));
				System.out.println("habitTrxLight Loaded!!");
			}			
		} catch (Exception e) {
			this.model.setHabitTrx(new LightData(FIELD_NAME, Light.ERROR.getImage(), getErrorMsg(e)));
		}
		return this.model.getHabitTrx();
	}
	
	public LightData securityQuestionsLight() {
		final String FIELD_NAME = "Preguntas Seguridad";
		try {
			if(this.model.getSecurityQuestions() == null) {
				CustomerBackOfficeResponseTO response = this.delegate.customerExtraData(this.request);
				String image = (this.registryLight().isRegistered() && response.isSecurityQuestionsFlag()) ? Light.OK.getImage() : 
					((this.registryLight().isRegistered() && !response.isSecurityQuestionsFlag()) ? Light.MINUS.getImage() : Light.OUT.getImage());
				this.model.setSecurityQuestions(new LightData(FIELD_NAME, image, ""));
				System.out.println("securityQuestionsLight Loaded!!");
			}			
		} catch (Exception e) {
			this.model.setSecurityQuestions(new LightData(FIELD_NAME, Light.ERROR.getImage(), getErrorMsg(e)));
		}
		return this.model.getSecurityQuestions();
	}
	
	public LightData lockedForLogonAttempsLight() {
		final String FIELD_NAME = "Bloqueo por Intentos Login";
		try {
			if(this.model.getLockedForLogonAttemps() == null) {
				CustomerBackOfficeResponseTO response = this.delegate.customerExtraData(this.request);
				String image = (this.registryLight().isRegistered() && response.isLockLoginFlag()) ? Light.MINUS.getImage() : 
					((this.registryLight().isRegistered() && !response.isLockLoginFlag()) ? Light.OK.getImage() : Light.OUT.getImage());
				this.model.setLockedForLogonAttemps(new LightData(FIELD_NAME, image, ""));
				System.out.println("blockadeForLogonAttempsLight Loaded!!");
			}			
		} catch (Exception e) {
			this.model.setLockedForLogonAttemps(new LightData(FIELD_NAME, Light.ERROR.getImage(), getErrorMsg(e)));
		}
		return this.model.getLockedForLogonAttemps();
	}
	
	public LightData actualLoggedLight() {
		final String FIELD_NAME = "Logueado Actual";
		try {
			if(this.model.getActualLogged() == null) {
				CustomerBackOfficeResponseTO response = this.delegate.customerExtraData(null);
				String image = (this.registryLight().isRegistered() && response.isCurrentSessionFlag()) ? Light.OK.getImage() : Light.OUT.getImage();
				this.model.setActualLogged(new LightData(FIELD_NAME, image, getLabel(response.getCurrentSession())));
				System.out.println("actualLoggedLight Loaded!!");
			}			
		} catch (Exception e) {
			this.model.setActualLogged(new LightData(FIELD_NAME, Light.ERROR.getImage(), getErrorMsg(e)));
		}
		return this.model.getActualLogged();
	}
	
	public LightData lockedByAdminLight() {
		final String FIELD_NAME = "Bloqueado Admin";
		try {
			if(this.model.getLockedByAdmin() == null) {
				CustomerBackOfficeResponseTO response = this.delegate.customerExtraData(this.request);
				String image = (this.registryLight().isRegistered() && response.isAdminBlockCodeFlag()) ? Light.MINUS.getImage() : 
					((this.registryLight().isRegistered() && !response.isAdminBlockCodeFlag()) ? Light.OK.getImage() : Light.OUT.getImage());
				this.model.setLockedByAdmin(new LightData(FIELD_NAME, image, getLabel(response.getAdminBlockCode())));
				System.out.println("lockedByAdminLight Loaded!!");
			}			
		} catch (Exception e) {
			this.model.setLockedByAdmin(new LightData(FIELD_NAME, Light.ERROR.getImage(), getErrorMsg(e)));
		}
		return this.model.getLockedByAdmin();
	}

	public void sendOTPSMS() {
		try {
			this.validateWaysOFSendingOTP();
			if(ValidatorUtil.isEmptyText(this.request.getMobile())) {
				throw new Exception("No es posible realizar la operacion porque el cliente no tiene registrado un numero de celular");
			}
			CustomerBackOfficeResponseTO response = this.delegate.sendOTPDiffuserSMS(this.request);
			if(!response.isOtpDiffuserSent()) {
				throw new Exception("No se ha podido realizar el envio OTP vía SMS");
			}
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Confirmacion", 
					"Se ha realizado el envio OTP satisfactoriamente");
			RequestContext.getCurrentInstance().showMessageInDialog(message);
		}catch (Exception e) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", getErrorMsg(e));
			RequestContext.getCurrentInstance().showMessageInDialog(message);
		}
	}
	
	public void sendOTPMail() {
		try {
			this.validateWaysOFSendingOTP();
			if(ValidatorUtil.isEmptyText(this.request.getEmail())) {
				throw new Exception("No es posible realizar la operacion porque el cliente no tiene registrado un email.");
			}
			CustomerBackOfficeResponseTO response = this.delegate.sendOTPDiffuserEmail(this.request);
			if(!response.isOtpDiffuserSent()) {
				throw new Exception("No se ha podido realizar el envio OTP via Email");
			}
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Confirmacion", 
					"Se ha realizado el envio OTP satisfactoriamente");
			RequestContext.getCurrentInstance().showMessageInDialog(message);
		}catch (Exception e) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", getErrorMsg(e));
			RequestContext.getCurrentInstance().showMessageInDialog(message);
		}
	}
	
	private void validateWaysOFSendingOTP() throws Exception {
		if(this.request == null || (ValidatorUtil.isEmptyText(this.request.getEmail()) 
				&& ValidatorUtil.isEmptyText(this.request.getMobile()))) {
			throw new Exception("No es posible realizar la operacion por falta de datos.");
		}
	}
	
	public void lockUser() {
		try {
			if(this.request == null) {
				throw new Exception("No es posible realizar la operacion por falta de datos.");
			}
			this.request.setAdminBlockCode("2");
			this.delegate.updateUnlockAdminBlock(this.request);
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Confirmacion", 
					"El usuario ha sido bloqueado.");
			resetForReloadLights();
			RequestContext.getCurrentInstance().showMessageInDialog(message);
		}catch (Exception e) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", getErrorMsg(e));
			RequestContext.getCurrentInstance().showMessageInDialog(message);
		}
	}
	
	private void unlockUser() {
		try {
			if(this.request == null) {
				throw new Exception("No es posible realizar la operacion por falta de datos.");
			}
			if(this.request.getCustomerOTP() == null || this.request.getCustomerOTP().trim().isEmpty()) {
				throw new Exception("Debe generar un codigo OTP.");
			}
			this.request.setAdminBlockCode("1");
			this.delegate.updateAdminBlock(this.request);
			resetForReloadLights();
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Confirmacion", 
					"El usuario ha sido desbloqueado.");
			RequestContext.getCurrentInstance().showMessageInDialog(message);
		}catch (Exception e) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", getErrorMsg(e));
			RequestContext.getCurrentInstance().showMessageInDialog(message);
		}
	}
	
	private void deleteUser() {
		try {
			if(this.request == null) {
				throw new Exception("No es posible realizar la operacion por falta de datos.");
			}
			if(this.request.getCustomerOTP() == null || this.request.getCustomerOTP().trim().isEmpty()) {
				throw new Exception("Debe generar un codigo OTP.");
			}
			this.delegate.deleteCustomer(this.request);
			resetForReloadLights();
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Confirmacion", 
					"El usuario ha sido eliminado.");
			RequestContext.getCurrentInstance().showMessageInDialog(message);
		}catch (Exception e) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", getErrorMsg(e));
			RequestContext.getCurrentInstance().showMessageInDialog(message);
		}
	}
	
	public void callPopupOtpCode(Long id) {
		this.idOperationAdmin = id;
		RequestContext.getCurrentInstance().execute("PF('mpOtpCode').show()");
	}
	
	public void putOtpCode() {
		try {
			if(this.model.getOtpCode() == null || 
					this.model.getOtpCode().isEmpty()) {
				throw new Exception("Por favor, ingresar el Codigo OTP.");
			}
			this.request.setCustomerOTP(this.model.getOtpCode());
			RequestContext.getCurrentInstance().execute("PF('mpOtpCode').hide()");
		}catch (Exception e) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", getErrorMsg(e));
			RequestContext.getCurrentInstance().showMessageInDialog(message);
			return;
		}
		// 1 unlock user, 2 delete user
		if(this.idOperationAdmin != null ) {
			if(this.idOperationAdmin.compareTo(Long.valueOf(1)) == 0) {
				this.unlockUser();
			}else if(this.idOperationAdmin.compareTo(Long.valueOf(2)) == 0) {
				this.deleteUser();
			}
			this.request.setCustomerOTP("");
			this.model.setOtpCode("");
		}
	}
	
	private void resetForReloadLights(){
		this.model.setEmail(null);
		this.model.setCellphone(null);
		this.model.setSuitableForReg(null);
		this.model.setSarlaft(null);
		this.model.setRegistry(null);
		this.model.setInitSession(null);
		this.model.setHabitTrx(null);
		this.model.setSecurityQuestions(null);
		this.model.setLockedForLogonAttemps(null);
		this.model.setActualLogged(null);
		this.model.setLockedByAdmin(null);
		
		this.delegate = new BackOfficeDelegate();
	}
	
	// Metodos para validar sesión en SBI y siif
	private void validarSessionSBI() throws Exception {
		if (this.urlParameters == null || this.urlParameters.trim().length() <= 0) {
			this.urlParameters = (String) super.obtenerDeSesion("params");
			super.quitarDeSesion("params");
		} else {
			super.quitarDeSesion("params");
		}

		AutenticacionIntegracion autObj = new AutenticacionIntegracion();
		ValidaCajeroRespTO cashierData = autObj.validarSesion(this.urlParameters);
//		ValidaCajeroRespTO cashierData = new ValidaCajeroRespTO();
//		cashierData.setCajero("LMALDONADO");
//		cashierData.setCaja("1");
//		cashierData.setEntidad("GYF001");
//		cashierData.setPuntoDeServicio("274");

		if (cashierData == null) {
			throw new Exception("No session data");
		}
		cashierData.setValidateSiif(Boolean.FALSE);
		this.ponerEnSesion("CAJERO_SESION", cashierData);
		this.putDatauserInSession(cashierData);
		this.cajeroRespTO = cashierData;

	}

	private void validarSessionSIIF() throws Exception {
		ValidaCajeroRespTO cashierData = null;
		if ((this.elementosUrl1 == null || this.elementosUrl1.trim().length() <= 0)
				&& (this.elementosUrl2 == null || this.elementosUrl2.trim().length() <= 0)) {
			this.elementosUrl1 = (String) super.obtenerDeSesion("paramsSIIF1");
			this.elementosUrl2 = (String) super.obtenerDeSesion("paramsSIIF2");
			super.quitarDeSesion("paramsSIIF1");
			super.quitarDeSesion("paramsSIIF2");
		} else {
			super.quitarDeSesion("paramsSIIF1");
			super.quitarDeSesion("paramsSIIF2");
		}

		CashierValidateBean bean = new CashierValidateBean();
		CashierValidateTO cashierValidate = new CashierValidateTO();
		cashierValidate.setParam1(elementosUrl1);
		cashierValidate.setParam2(elementosUrl2);

		CashierValidateResponseTO cashierValidateResponse = bean.validateCashier(cashierValidate);

		if (cashierValidateResponse != null) {
			cashierData = new ValidaCajeroRespTO();

			cashierData.setCaja(cashierValidateResponse.getIdDevice());
			cashierData.setCajero(cashierValidateResponse.getIdCashier());
			cashierData.setEntidad(cashierValidateResponse.getIdCnb());
			cashierData.setPuntoDeServicio(cashierValidateResponse.getIdServicePoint());

			cashierData.setCustomerId(cashierValidateResponse.getId());
			cashierData.setCustomerIdType(cashierValidateResponse.getIdType());
			cashierData.setTrxType(cashierValidateResponse.getTrxType());
			cashierData.setValidateSiif(Boolean.TRUE);

		}

		if (cashierData == null) {
			throw new Exception("No session data");
		}
		this.ponerEnSesion("CAJERO_SESION", cashierData);
		this.putDatauserInSession(cashierData);
		this.cajeroRespTO = cashierData;

	}

	public void executeValidation() {
		try {
			if (!this.DEBUG) {
				String user = (String) super.obtenerDeSesion(AutenticacionConstantes.CASHIER_IN_SESSION);
				if (user == null) {
					InitServicesEnum initServicesEnum = (InitServicesEnum) obtenerDeSesion("RUTA");
					switch (initServicesEnum) {
					case INIT_SBI:
						this.validarSessionSBI();
						break;
					case INIT_SIIF:
						this.validarSessionSIIF();						
						break;
					default:
						throw new Exception("No session data");
					}
					this.loadPanelForCustomerIdInfo();
				} else {
					this.cajeroRespTO = (ValidaCajeroRespTO) this.obtenerDeSesion("CAJERO_SESION");
				}
			} else {
				this.putDatauserInSession(null);
				this.model.setLoadContent(true);
			}

		} catch (Exception e) {
			this.model.setLoadContent(false);
			redireccionar("/gyf_backoffice_web/logout/index.html");
		}
	}
	
	private void loadPanelForCustomerIdInfo() throws Exception {
		this.initDocTypeList();
		RequestContext.getCurrentInstance().execute("PF('mpCustomerDataSBI').show();");
	}

	private void putDatauserInSession(ValidaCajeroRespTO cashierData) {
		if (this.DEBUG) {
			// super.ponerEnSesion(AutenticacionConstantes.CASHIER_IN_SESSION,
			// "JRIVAS");
			// super.ponerEnSesion(KeyConstants.ENTITY, "1");
			// super.ponerEnSesion(KeyConstants.DEVICE, "1");
			// super.ponerEnSesion(KeyConstants.SERVICEPOINT, "85");
			// super.ponerEnSesion(AutenticacionConstantes.IS_VALID_SESSION,
			// "true");
			this.cajeroStr = "SQAPOROZCO";
			this.puntoServicoStr = "274";
			super.ponerEnSesion(KeyConstant.USER, this.cajeroStr);
			super.ponerEnSesion(AutenticacionConstantes.CASHIER_IN_SESSION, this.cajeroStr);
			super.ponerEnSesion(KeyConstant.ENTITY, "GYF001");
			super.ponerEnSesion(KeyConstant.DEVICE, "1");
			super.ponerEnSesion(KeyConstant.SERVICE_POINT, this.puntoServicoStr);
			super.ponerEnSesion(AutenticacionConstantes.IS_VALID_SESSION, "true");
			super.ponerEnSesion(AutenticacionConstantes.IS_IN_SESSION, "true");
			
			this.request = new CustomerBackOfficeRequestTO();
			this.request.setId("1130610793");
			this.model.setDocumentNumber("1130610793");
			this.request.setIdType("CC");
			this.model.setDocumentType("CC");
			this.request.setUserId("SQAPOROZCO");
			this.request.setServicePoint("274");
			
		} else {
			String cajero = null;
			if (cashierData.getCajero() != null && cashierData.getCajero().length() > 0) {
				cajero = cashierData.getCajero().trim();
				this.cajeroStr = cajero;
			}
			super.ponerEnSesion(KeyConstant.USER, this.cajeroStr);
			super.ponerEnSesion(AutenticacionConstantes.CASHIER_IN_SESSION, cajero);
			String entidad = null;
			if (cashierData.getEntidad() != null && cashierData.getEntidad().length() > 0) {
				entidad = cashierData.getEntidad().trim();
			}
			super.ponerEnSesion(KeyConstant.ENTITY, entidad);
			String caja = null;
			if (cashierData.getCaja() != null && cashierData.getCaja().length() > 0) {
				caja = cashierData.getCaja().trim();
			}
			super.ponerEnSesion(KeyConstant.DEVICE, caja);
			String ptoServicio = null;
			if (cashierData.getPuntoDeServicio() != null && cashierData.getPuntoDeServicio().length() > 0) {
				ptoServicio = cashierData.getPuntoDeServicio().trim();
				this.puntoServicoStr = ptoServicio;
			}
			
			this.request = new CustomerBackOfficeRequestTO();
			if (cashierData.getCustomerId() != null && cashierData.getCustomerId().length() > 0) {
				this.request.setId(cashierData.getCustomerId().trim());
				this.model.setDocumentNumber(cashierData.getCustomerId().trim());
			}
			if (cashierData.getCustomerIdType() != null && cashierData.getCustomerIdType().length() > 0) {
				this.request.setIdType(cashierData.getCustomerIdType().trim());
				this.model.setDocumentType(cashierData.getCustomerIdType().trim());
			}
			this.request.setUserId(this.cajeroStr);
			this.request.setServicePoint(this.puntoServicoStr);
			
			super.ponerEnSesion(KeyConstant.SERVICE_POINT, ptoServicio);
			super.ponerEnSesion(AutenticacionConstantes.IS_VALID_SESSION, "true");
			super.ponerEnSesion(AutenticacionConstantes.IS_IN_SESSION, "true");
		}
	}
	
	public String toReport(Long idReport) {
		String navRule = "";
		// Lleno el objeto aquel
		SessionContextModel context = new SessionContextModel();
		String fullName = "".concat(this.request.getFirstName()).concat(" ").
				concat((this.request.getMiddleName() != null && !this.request.getMiddleName().isEmpty()) ? this.request.getMiddleName() : "").concat(" ").
				concat((this.request.getLastName() != null && !this.request.getLastName().isEmpty()) ? this.request.getLastName() : "").concat(" ").
				concat((this.request.getMiddleLastName() != null && !this.request.getMiddleLastName().isEmpty()) ? this.request.getMiddleLastName() : "");
		context.setCustomerFullName(fullName);
		context.setId(this.request.getId());
		context.setIdType(this.request.getIdType());
		context.setServicePoint(this.request.getServicePoint());
		context.setUserId(this.request.getUserId());
		super.ponerEnSesion("SESSION_CONTEXT", context);
		navRule = NavRule.getById(idReport).getRule();
		// Borro MB de la sessión
		super.quitarDeSesion("CustomerPSEAction", "CustomerProductsAction", "CustomerBankAccountAction", "CreditCardAction");
		return navRule;
	}
	
	public void saveIdCustomerData() {
		try {
			if((this.model.getDocumentType() == null || this.model.getDocumentType().isEmpty()) || 
					(this.model.getDocumentNumber() == null || this.model.getDocumentNumber().isEmpty())) {
				throw new Exception("Debe ingresar los datos de identificación del cliente.");
			}
			this.request.setId(this.model.getDocumentNumber());
			this.request.setIdType(this.model.getDocumentType());
			if(!clientExist()){
				
			}
			this.model.setLoadContent(true);
			RequestContext.getCurrentInstance().execute("PF('mpCustomerDataSBI').hide();");
		}catch (Exception e) {
			this.model.setLoadContent(false);
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", getErrorMsg(e));
			FacesContext.getCurrentInstance().addMessage(null, message);
			RequestContext.getCurrentInstance().execute("PF('mpCustomerDataSBI').show();");
		}
	}
	
	public boolean clientExist() {
		CustomerBackOfficeResponseTO response = null;	
		try {
			response = this.delegate.registredAndComplianceList(this.request);
		}catch(Exception e) {
			this.model.setLoadContent(false);
			
		}
		
		return (response.equals(null)? false : response.isRegistredFlag());
	}
	
	public void initDocTypeList() throws Exception {
		CustomerBackOfficeRequestTO req = new CustomerBackOfficeRequestTO();
		req.setUserId(this.cajeroStr);
		CustomerBackOfficeResponseTO response = this.delegate.getCommonsServiceInfromation(req);
		List<SelectItem> idTypes = new ArrayList<SelectItem>();
		if(response != null && (response.getValueDomainElement() != null && !response.getValueDomainElement().isEmpty())) {
			for(ValueDomainElementTO elem : response.getValueDomainElement()) {
				idTypes.add(new SelectItem(elem.getCode(), elem.getDescription()));
			}
		}
		this.model.setIdTypeList(idTypes);
	}
	
	private String getLabel(String msg) {
		String label = "";
		if(msg != null && !msg.trim().isEmpty()) {
			label = msg;
		}
		return label;
	}
	
	private String getErrorMsg(Exception e) {
		String msg = "";
		if(e instanceof ControlApplicationException) {
			ControlApplicationException cae = (ControlApplicationException)e;
			msg = cae.getErrorModelControlExceptionList()[0].getErrorMessage();
		}
		else if(e instanceof ApplicationException) {
			ApplicationException ae = (ApplicationException)e;
			msg = ae.getErrorModelException().getMessage();
		}else
		{
			msg = e.getMessage();
		}
		return msg;
	}

	public InitModel getModel() {
		return model;
	}

	public void setModel(InitModel model) {
		this.model = model;
	}
	
	
}
