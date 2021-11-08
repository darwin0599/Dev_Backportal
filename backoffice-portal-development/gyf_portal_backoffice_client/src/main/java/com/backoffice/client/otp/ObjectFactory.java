
package com.backoffice.client.otp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.backoffice.client.otp package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _SendResponse_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntOTPDiffuser/", "sendResponse");
	private final static QName _ValidateFault_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntOTPDiffuser/", "validateFault");
	private final static QName _SendRequest_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntOTPDiffuser/", "sendRequest");
	private final static QName _DeleteRequest_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntOTPDiffuser/", "deleteRequest");
	private final static QName _DeleteFault_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntOTPDiffuser/", "deleteFault");
	private final static QName _ValidateRequest_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntOTPDiffuser/", "validateRequest");
	private final static QName _ValidateResponse_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntOTPDiffuser/", "validateResponse");
	private final static QName _SendFault_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntOTPDiffuser/", "sendFault");
	private final static QName _DeleteResponse_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntOTPDiffuser/", "deleteResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.backoffice.client.otp
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link ErrorsType }
	 * 
	 */
	public ErrorsType createErrorsType() {
		return new ErrorsType();
	}

	/**
	 * Create an instance of {@link ParameterType }
	 * 
	 */
	public ParameterType createParameterType() {
		return new ParameterType();
	}

	/**
	 * Create an instance of {@link ValidateRespType }
	 * 
	 */
	public ValidateRespType createValidateRespType() {
		return new ValidateRespType();
	}

	/**
	 * Create an instance of {@link AgentType }
	 * 
	 */
	public AgentType createAgentType() {
		return new AgentType();
	}

	/**
	 * Create an instance of {@link DeleteRespType }
	 * 
	 */
	public DeleteRespType createDeleteRespType() {
		return new DeleteRespType();
	}

	/**
	 * Create an instance of {@link PersonType }
	 * 
	 */
	public PersonType createPersonType() {
		return new PersonType();
	}

	/**
	 * Create an instance of {@link FaultType }
	 * 
	 */
	public FaultType createFaultType() {
		return new FaultType();
	}

	/**
	 * Create an instance of {@link ContextTransactionType }
	 * 
	 */
	public ContextTransactionType createContextTransactionType() {
		return new ContextTransactionType();
	}

	/**
	 * Create an instance of {@link ValidateFaultType }
	 * 
	 */
	public ValidateFaultType createValidateFaultType() {
		return new ValidateFaultType();
	}

	/**
	 * Create an instance of {@link ErrorType }
	 * 
	 */
	public ErrorType createErrorType() {
		return new ErrorType();
	}

	/**
	 * Create an instance of {@link ServicePointType }
	 * 
	 */
	public ServicePointType createServicePointType() {
		return new ServicePointType();
	}

	/**
	 * Create an instance of {@link ContextResponseType }
	 * 
	 */
	public ContextResponseType createContextResponseType() {
		return new ContextResponseType();
	}

	/**
	 * Create an instance of {@link OfficeType }
	 * 
	 */
	public OfficeType createOfficeType() {
		return new OfficeType();
	}

	/**
	 * Create an instance of {@link DeleteFaultType }
	 * 
	 */
	public DeleteFaultType createDeleteFaultType() {
		return new DeleteFaultType();
	}

	/**
	 * Create an instance of {@link SendFaultType }
	 * 
	 */
	public SendFaultType createSendFaultType() {
		return new SendFaultType();
	}

	/**
	 * Create an instance of {@link SendRespType }
	 * 
	 */
	public SendRespType createSendRespType() {
		return new SendRespType();
	}

	/**
	 * Create an instance of {@link DeviceType }
	 * 
	 */
	public DeviceType createDeviceType() {
		return new DeviceType();
	}

	/**
	 * Create an instance of {@link ValidateReqType }
	 * 
	 */
	public ValidateReqType createValidateReqType() {
		return new ValidateReqType();
	}

	/**
	 * Create an instance of {@link DeleteReqType }
	 * 
	 */
	public DeleteReqType createDeleteReqType() {
		return new DeleteReqType();
	}

	/**
	 * Create an instance of {@link SendReqType }
	 * 
	 */
	public SendReqType createSendReqType() {
		return new SendReqType();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SendRespType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntOTPDiffuser/", name = "sendResponse")
	public JAXBElement<SendRespType> createSendResponse(SendRespType value) {
		return new JAXBElement<SendRespType>(_SendResponse_QNAME, SendRespType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ValidateFaultType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntOTPDiffuser/", name = "validateFault")
	public JAXBElement<ValidateFaultType> createValidateFault(ValidateFaultType value) {
		return new JAXBElement<ValidateFaultType>(_ValidateFault_QNAME, ValidateFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SendReqType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntOTPDiffuser/", name = "sendRequest")
	public JAXBElement<SendReqType> createSendRequest(SendReqType value) {
		return new JAXBElement<SendReqType>(_SendRequest_QNAME, SendReqType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReqType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntOTPDiffuser/", name = "deleteRequest")
	public JAXBElement<DeleteReqType> createDeleteRequest(DeleteReqType value) {
		return new JAXBElement<DeleteReqType>(_DeleteRequest_QNAME, DeleteReqType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFaultType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntOTPDiffuser/", name = "deleteFault")
	public JAXBElement<DeleteFaultType> createDeleteFault(DeleteFaultType value) {
		return new JAXBElement<DeleteFaultType>(_DeleteFault_QNAME, DeleteFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ValidateReqType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntOTPDiffuser/", name = "validateRequest")
	public JAXBElement<ValidateReqType> createValidateRequest(ValidateReqType value) {
		return new JAXBElement<ValidateReqType>(_ValidateRequest_QNAME, ValidateReqType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ValidateRespType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntOTPDiffuser/", name = "validateResponse")
	public JAXBElement<ValidateRespType> createValidateResponse(ValidateRespType value) {
		return new JAXBElement<ValidateRespType>(_ValidateResponse_QNAME, ValidateRespType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SendFaultType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntOTPDiffuser/", name = "sendFault")
	public JAXBElement<SendFaultType> createSendFault(SendFaultType value) {
		return new JAXBElement<SendFaultType>(_SendFault_QNAME, SendFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRespType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntOTPDiffuser/", name = "deleteResponse")
	public JAXBElement<DeleteRespType> createDeleteResponse(DeleteRespType value) {
		return new JAXBElement<DeleteRespType>(_DeleteResponse_QNAME, DeleteRespType.class, null, value);
	}

}
