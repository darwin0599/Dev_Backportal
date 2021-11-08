
package com.backoffice.client.validatecustomer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.backoffice.client.validatecustomer
 * package.
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

	private final static QName _ValidateComplianceListResponse_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/",
			"validateComplianceListResponse");
	private final static QName _ValidateComplianceListFault_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/",
			"validateComplianceListFault");
	private final static QName _ValidateAccumulatedFault_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/", "validateAccumulatedFault");
	private final static QName _ValidateCustomerRequest_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/", "validateCustomerRequest");
	private final static QName _ValidateAccumulatedRequest_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/",
			"validateAccumulatedRequest");
	private final static QName _ValidateAccumulatedResponse_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/",
			"validateAccumulatedResponse");
	private final static QName _ValidateComplianceListRequest_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/",
			"validateComplianceListRequest");
	private final static QName _ValidateCustomerResponse_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/", "validateCustomerResponse");
	private final static QName _ValidateCustomerFault_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/", "validateCustomerFault");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package:
	 * com.backoffice.client.validatecustomer
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link ValidateAccumulatedReqType }
	 * 
	 */
	public ValidateAccumulatedReqType createValidateAccumulatedReqType() {
		return new ValidateAccumulatedReqType();
	}

	/**
	 * Create an instance of {@link NotificationType }
	 * 
	 */
	public NotificationType createNotificationType() {
		return new NotificationType();
	}

	/**
	 * Create an instance of {@link SendMoneyType }
	 * 
	 */
	public SendMoneyType createSendMoneyType() {
		return new SendMoneyType();
	}

	/**
	 * Create an instance of {@link DestinationsInfoType }
	 * 
	 */
	public DestinationsInfoType createDestinationsInfoType() {
		return new DestinationsInfoType();
	}

	/**
	 * Create an instance of {@link ValidateAccumulatedRespType }
	 * 
	 */
	public ValidateAccumulatedRespType createValidateAccumulatedRespType() {
		return new ValidateAccumulatedRespType();
	}

	/**
	 * Create an instance of {@link PaymentCheckType }
	 * 
	 */
	public PaymentCheckType createPaymentCheckType() {
		return new PaymentCheckType();
	}

	/**
	 * Create an instance of {@link PaymentGYFAccounType }
	 * 
	 */
	public PaymentGYFAccounType createPaymentGYFAccounType() {
		return new PaymentGYFAccounType();
	}

	/**
	 * Create an instance of {@link ValidateComplianceListReqType }
	 * 
	 */
	public ValidateComplianceListReqType createValidateComplianceListReqType() {
		return new ValidateComplianceListReqType();
	}

	/**
	 * Create an instance of {@link InfoCustomerType }
	 * 
	 */
	public InfoCustomerType createInfoCustomerType() {
		return new InfoCustomerType();
	}

	/**
	 * Create an instance of {@link AgentType }
	 * 
	 */
	public AgentType createAgentType() {
		return new AgentType();
	}

	/**
	 * Create an instance of {@link MethodOfPaymentType }
	 * 
	 */
	public MethodOfPaymentType createMethodOfPaymentType() {
		return new MethodOfPaymentType();
	}

	/**
	 * Create an instance of {@link QuestionsAnswersFormType }
	 * 
	 */
	public QuestionsAnswersFormType createQuestionsAnswersFormType() {
		return new QuestionsAnswersFormType();
	}

	/**
	 * Create an instance of {@link ValidateCustomerFaultType }
	 * 
	 */
	public ValidateCustomerFaultType createValidateCustomerFaultType() {
		return new ValidateCustomerFaultType();
	}

	/**
	 * Create an instance of {@link CustomerCompanyType.LegalRepresentatives }
	 * 
	 */
	public CustomerCompanyType.LegalRepresentatives createCustomerCompanyTypeLegalRepresentatives() {
		return new CustomerCompanyType.LegalRepresentatives();
	}

	/**
	 * Create an instance of {@link ValidateComplianceListFaultType }
	 * 
	 */
	public ValidateComplianceListFaultType createValidateComplianceListFaultType() {
		return new ValidateComplianceListFaultType();
	}

	/**
	 * Create an instance of {@link FaultType }
	 * 
	 */
	public FaultType createFaultType() {
		return new FaultType();
	}

	/**
	 * Create an instance of {@link QuestionAnswerType }
	 * 
	 */
	public QuestionAnswerType createQuestionAnswerType() {
		return new QuestionAnswerType();
	}

	/**
	 * Create an instance of {@link ValueUSDType }
	 * 
	 */
	public ValueUSDType createValueUSDType() {
		return new ValueUSDType();
	}

	/**
	 * Create an instance of {@link PaymentCashType }
	 * 
	 */
	public PaymentCashType createPaymentCashType() {
		return new PaymentCashType();
	}

	/**
	 * Create an instance of {@link ValidateComplianceListRespType }
	 * 
	 */
	public ValidateComplianceListRespType createValidateComplianceListRespType() {
		return new ValidateComplianceListRespType();
	}

	/**
	 * Create an instance of {@link ErrorType }
	 * 
	 */
	public ErrorType createErrorType() {
		return new ErrorType();
	}

	/**
	 * Create an instance of {@link UpdateInfoClientType }
	 * 
	 */
	public UpdateInfoClientType createUpdateInfoClientType() {
		return new UpdateInfoClientType();
	}

	/**
	 * Create an instance of {@link DeviceType }
	 * 
	 */
	public DeviceType createDeviceType() {
		return new DeviceType();
	}

	/**
	 * Create an instance of {@link ServicePointType }
	 * 
	 */
	public ServicePointType createServicePointType() {
		return new ServicePointType();
	}

	/**
	 * Create an instance of {@link ParameterType }
	 * 
	 */
	public ParameterType createParameterType() {
		return new ParameterType();
	}

	/**
	 * Create an instance of {@link ValidateCustomerReqType }
	 * 
	 */
	public ValidateCustomerReqType createValidateCustomerReqType() {
		return new ValidateCustomerReqType();
	}

	/**
	 * Create an instance of {@link CustomerCompanyType }
	 * 
	 */
	public CustomerCompanyType createCustomerCompanyType() {
		return new CustomerCompanyType();
	}

	/**
	 * Create an instance of {@link MoneyTransferType }
	 * 
	 */
	public MoneyTransferType createMoneyTransferType() {
		return new MoneyTransferType();
	}

	/**
	 * Create an instance of {@link QuestionsAnswersType }
	 * 
	 */
	public QuestionsAnswersType createQuestionsAnswersType() {
		return new QuestionsAnswersType();
	}

	/**
	 * Create an instance of {@link ErrorsType }
	 * 
	 */
	public ErrorsType createErrorsType() {
		return new ErrorsType();
	}

	/**
	 * Create an instance of {@link PaymentACHType }
	 * 
	 */
	public PaymentACHType createPaymentACHType() {
		return new PaymentACHType();
	}

	/**
	 * Create an instance of {@link MoneyTransferMessageType }
	 * 
	 */
	public MoneyTransferMessageType createMoneyTransferMessageType() {
		return new MoneyTransferMessageType();
	}

	/**
	 * Create an instance of {@link ValidateCustomerRespType }
	 * 
	 */
	public ValidateCustomerRespType createValidateCustomerRespType() {
		return new ValidateCustomerRespType();
	}

	/**
	 * Create an instance of {@link RequiredInformationClientsType }
	 * 
	 */
	public RequiredInformationClientsType createRequiredInformationClientsType() {
		return new RequiredInformationClientsType();
	}

	/**
	 * Create an instance of {@link NotificationsListType }
	 * 
	 */
	public NotificationsListType createNotificationsListType() {
		return new NotificationsListType();
	}

	/**
	 * Create an instance of {@link UpdateInfoClientsType }
	 * 
	 */
	public UpdateInfoClientsType createUpdateInfoClientsType() {
		return new UpdateInfoClientsType();
	}

	/**
	 * Create an instance of {@link RepresentativeType }
	 * 
	 */
	public RepresentativeType createRepresentativeType() {
		return new RepresentativeType();
	}

	/**
	 * Create an instance of {@link OfficeType }
	 * 
	 */
	public OfficeType createOfficeType() {
		return new OfficeType();
	}

	/**
	 * Create an instance of {@link CustomerCompanyType.Shareholders }
	 * 
	 */
	public CustomerCompanyType.Shareholders createCustomerCompanyTypeShareholders() {
		return new CustomerCompanyType.Shareholders();
	}

	/**
	 * Create an instance of {@link ContextResponseType }
	 * 
	 */
	public ContextResponseType createContextResponseType() {
		return new ContextResponseType();
	}

	/**
	 * Create an instance of {@link ContextTransactionType }
	 * 
	 */
	public ContextTransactionType createContextTransactionType() {
		return new ContextTransactionType();
	}

	/**
	 * Create an instance of {@link CustomerCommonType }
	 * 
	 */
	public CustomerCommonType createCustomerCommonType() {
		return new CustomerCommonType();
	}

	/**
	 * Create an instance of {@link RequiredInformationClientType }
	 * 
	 */
	public RequiredInformationClientType createRequiredInformationClientType() {
		return new RequiredInformationClientType();
	}

	/**
	 * Create an instance of {@link PersonType }
	 * 
	 */
	public PersonType createPersonType() {
		return new PersonType();
	}

	/**
	 * Create an instance of {@link InfoSourceTransactionType }
	 * 
	 */
	public InfoSourceTransactionType createInfoSourceTransactionType() {
		return new InfoSourceTransactionType();
	}

	/**
	 * Create an instance of {@link ValidateAccumulatedFaultType }
	 * 
	 */
	public ValidateAccumulatedFaultType createValidateAccumulatedFaultType() {
		return new ValidateAccumulatedFaultType();
	}

	/**
	 * Create an instance of {@link CustomerType }
	 * 
	 */
	public CustomerType createCustomerType() {
		return new CustomerType();
	}

	/**
	 * Create an instance of {@link MoneyTransferPromotionType }
	 * 
	 */
	public MoneyTransferPromotionType createMoneyTransferPromotionType() {
		return new MoneyTransferPromotionType();
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ValidateComplianceListRespType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/", name = "validateComplianceListResponse")
	public JAXBElement<ValidateComplianceListRespType> createValidateComplianceListResponse(
			ValidateComplianceListRespType value) {
		return new JAXBElement<ValidateComplianceListRespType>(_ValidateComplianceListResponse_QNAME,
				ValidateComplianceListRespType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ValidateComplianceListFaultType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/", name = "validateComplianceListFault")
	public JAXBElement<ValidateComplianceListFaultType> createValidateComplianceListFault(
			ValidateComplianceListFaultType value) {
		return new JAXBElement<ValidateComplianceListFaultType>(_ValidateComplianceListFault_QNAME,
				ValidateComplianceListFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ValidateAccumulatedFaultType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/", name = "validateAccumulatedFault")
	public JAXBElement<ValidateAccumulatedFaultType> createValidateAccumulatedFault(
			ValidateAccumulatedFaultType value) {
		return new JAXBElement<ValidateAccumulatedFaultType>(_ValidateAccumulatedFault_QNAME,
				ValidateAccumulatedFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ValidateCustomerReqType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/", name = "validateCustomerRequest")
	public JAXBElement<ValidateCustomerReqType> createValidateCustomerRequest(ValidateCustomerReqType value) {
		return new JAXBElement<ValidateCustomerReqType>(_ValidateCustomerRequest_QNAME, ValidateCustomerReqType.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ValidateAccumulatedReqType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/", name = "validateAccumulatedRequest")
	public JAXBElement<ValidateAccumulatedReqType> createValidateAccumulatedRequest(ValidateAccumulatedReqType value) {
		return new JAXBElement<ValidateAccumulatedReqType>(_ValidateAccumulatedRequest_QNAME,
				ValidateAccumulatedReqType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ValidateAccumulatedRespType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/", name = "validateAccumulatedResponse")
	public JAXBElement<ValidateAccumulatedRespType> createValidateAccumulatedResponse(
			ValidateAccumulatedRespType value) {
		return new JAXBElement<ValidateAccumulatedRespType>(_ValidateAccumulatedResponse_QNAME,
				ValidateAccumulatedRespType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ValidateComplianceListReqType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/", name = "validateComplianceListRequest")
	public JAXBElement<ValidateComplianceListReqType> createValidateComplianceListRequest(
			ValidateComplianceListReqType value) {
		return new JAXBElement<ValidateComplianceListReqType>(_ValidateComplianceListRequest_QNAME,
				ValidateComplianceListReqType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ValidateCustomerRespType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/", name = "validateCustomerResponse")
	public JAXBElement<ValidateCustomerRespType> createValidateCustomerResponse(ValidateCustomerRespType value) {
		return new JAXBElement<ValidateCustomerRespType>(_ValidateCustomerResponse_QNAME,
				ValidateCustomerRespType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ValidateCustomerFaultType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/", name = "validateCustomerFault")
	public JAXBElement<ValidateCustomerFaultType> createValidateCustomerFault(ValidateCustomerFaultType value) {
		return new JAXBElement<ValidateCustomerFaultType>(_ValidateCustomerFault_QNAME, ValidateCustomerFaultType.class,
				null, value);
	}

}
