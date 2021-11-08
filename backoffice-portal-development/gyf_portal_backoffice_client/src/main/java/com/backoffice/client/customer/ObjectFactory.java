
package com.backoffice.client.customer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.backoffice.client.customer package.
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

	private final static QName _InquiryByIdCustomerResponse_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/", "InquiryByIdCustomerResponse");
	private final static QName _InquiryByIdCustomerCompanyRequest_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/",
			"inquiryByIdCustomerCompanyRequest");
	private final static QName _RegisterCustCompanyFault_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/", "registerCustCompanyFault");
	private final static QName _InquiryByIdCustomerCompanyResponse_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/",
			"inquiryByIdCustomerCompanyResponse");
	private final static QName _RegisterResponse_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/", "RegisterResponse");
	private final static QName _RegisterFault_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/", "RegisterFault");
	private final static QName _RegisterCustCompanyRequest_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/", "registerCustCompanyRequest");
	private final static QName _RegisterRequest_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/", "RegisterRequest");
	private final static QName _RegisterCustCompanyResponse_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/", "registerCustCompanyResponse");
	private final static QName _InquiryByIdCustomerRequest_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/", "InquiryByIdCustomerRequest");
	private final static QName _InquiryByIdCustomerFault_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/", "InquiryByIdCustomerFault");
	private final static QName _InquiryByIdCustomerCompanyfault_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/",
			"inquiryByIdCustomerCompanyfault");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.backoffice.client.customer
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link NotificationType }
	 * 
	 */
	public NotificationType createNotificationType() {
		return new NotificationType();
	}

	/**
	 * Create an instance of {@link InquiryByIdCustomerRespType }
	 * 
	 */
	public InquiryByIdCustomerRespType createInquiryByIdCustomerRespType() {
		return new InquiryByIdCustomerRespType();
	}

	/**
	 * Create an instance of {@link RequiredInformationClientType }
	 * 
	 */
	public RequiredInformationClientType createRequiredInformationClientType() {
		return new RequiredInformationClientType();
	}

	/**
	 * Create an instance of {@link UpdateInfoClientsType }
	 * 
	 */
	public UpdateInfoClientsType createUpdateInfoClientsType() {
		return new UpdateInfoClientsType();
	}

	/**
	 * Create an instance of {@link CustomerCompanyType.Shareholders }
	 * 
	 */
	public CustomerCompanyType.Shareholders createCustomerCompanyTypeShareholders() {
		return new CustomerCompanyType.Shareholders();
	}

	/**
	 * Create an instance of {@link CustomerCompanyType.LegalRepresentatives }
	 * 
	 */
	public CustomerCompanyType.LegalRepresentatives createCustomerCompanyTypeLegalRepresentatives() {
		return new CustomerCompanyType.LegalRepresentatives();
	}

	/**
	 * Create an instance of {@link InfoCustomerType }
	 * 
	 */
	public InfoCustomerType createInfoCustomerType() {
		return new InfoCustomerType();
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
	 * Create an instance of {@link RegisterCustCompanyRespType }
	 * 
	 */
	public RegisterCustCompanyRespType createRegisterCustCompanyRespType() {
		return new RegisterCustCompanyRespType();
	}

	/**
	 * Create an instance of {@link ContextTransactionType }
	 * 
	 */
	public ContextTransactionType createContextTransactionType() {
		return new ContextTransactionType();
	}

	/**
	 * Create an instance of {@link NotificationsListType }
	 * 
	 */
	public NotificationsListType createNotificationsListType() {
		return new NotificationsListType();
	}

	/**
	 * Create an instance of {@link UpdateInfoClientType }
	 * 
	 */
	public UpdateInfoClientType createUpdateInfoClientType() {
		return new UpdateInfoClientType();
	}

	/**
	 * Create an instance of {@link InquiryByIdCustCompanyReqType }
	 * 
	 */
	public InquiryByIdCustCompanyReqType createInquiryByIdCustCompanyReqType() {
		return new InquiryByIdCustCompanyReqType();
	}

	/**
	 * Create an instance of {@link InquiryByIdCustCompanyFaultType }
	 * 
	 */
	public InquiryByIdCustCompanyFaultType createInquiryByIdCustCompanyFaultType() {
		return new InquiryByIdCustCompanyFaultType();
	}

	/**
	 * Create an instance of {@link QuestionsAnswersType }
	 * 
	 */
	public QuestionsAnswersType createQuestionsAnswersType() {
		return new QuestionsAnswersType();
	}

	/**
	 * Create an instance of {@link RegisterReqType }
	 * 
	 */
	public RegisterReqType createRegisterReqType() {
		return new RegisterReqType();
	}

	/**
	 * Create an instance of {@link ErrorType }
	 * 
	 */
	public ErrorType createErrorType() {
		return new ErrorType();
	}

	/**
	 * Create an instance of {@link RegisterCustCompanyReqType }
	 * 
	 */
	public RegisterCustCompanyReqType createRegisterCustCompanyReqType() {
		return new RegisterCustCompanyReqType();
	}

	/**
	 * Create an instance of {@link InquiryByIdCustomerFaultType }
	 * 
	 */
	public InquiryByIdCustomerFaultType createInquiryByIdCustomerFaultType() {
		return new InquiryByIdCustomerFaultType();
	}

	/**
	 * Create an instance of {@link PersonType }
	 * 
	 */
	public PersonType createPersonType() {
		return new PersonType();
	}

	/**
	 * Create an instance of {@link CustomerCompanyType }
	 * 
	 */
	public CustomerCompanyType createCustomerCompanyType() {
		return new CustomerCompanyType();
	}

	/**
	 * Create an instance of {@link ErrorsType }
	 * 
	 */
	public ErrorsType createErrorsType() {
		return new ErrorsType();
	}

	/**
	 * Create an instance of {@link QuestionsAnswersFormType }
	 * 
	 */
	public QuestionsAnswersFormType createQuestionsAnswersFormType() {
		return new QuestionsAnswersFormType();
	}

	/**
	 * Create an instance of {@link RegisterRespType }
	 * 
	 */
	public RegisterRespType createRegisterRespType() {
		return new RegisterRespType();
	}

	/**
	 * Create an instance of {@link InquiryByIdCustomerReqType }
	 * 
	 */
	public InquiryByIdCustomerReqType createInquiryByIdCustomerReqType() {
		return new InquiryByIdCustomerReqType();
	}

	/**
	 * Create an instance of {@link RegisterCustCompanyFaultType }
	 * 
	 */
	public RegisterCustCompanyFaultType createRegisterCustCompanyFaultType() {
		return new RegisterCustCompanyFaultType();
	}

	/**
	 * Create an instance of {@link ContextResponseType }
	 * 
	 */
	public ContextResponseType createContextResponseType() {
		return new ContextResponseType();
	}

	/**
	 * Create an instance of {@link RepresentativeType }
	 * 
	 */
	public RepresentativeType createRepresentativeType() {
		return new RepresentativeType();
	}

	/**
	 * Create an instance of {@link RequiredInformationClientsType }
	 * 
	 */
	public RequiredInformationClientsType createRequiredInformationClientsType() {
		return new RequiredInformationClientsType();
	}

	/**
	 * Create an instance of {@link InquiryByIdCustCompanyRespType }
	 * 
	 */
	public InquiryByIdCustCompanyRespType createInquiryByIdCustCompanyRespType() {
		return new InquiryByIdCustCompanyRespType();
	}

	/**
	 * Create an instance of {@link RegisterFaultType }
	 * 
	 */
	public RegisterFaultType createRegisterFaultType() {
		return new RegisterFaultType();
	}

	/**
	 * Create an instance of {@link CustomerType }
	 * 
	 */
	public CustomerType createCustomerType() {
		return new CustomerType();
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link InquiryByIdCustomerRespType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/", name = "InquiryByIdCustomerResponse")
	public JAXBElement<InquiryByIdCustomerRespType> createInquiryByIdCustomerResponse(
			InquiryByIdCustomerRespType value) {
		return new JAXBElement<InquiryByIdCustomerRespType>(_InquiryByIdCustomerResponse_QNAME,
				InquiryByIdCustomerRespType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link InquiryByIdCustCompanyReqType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/", name = "inquiryByIdCustomerCompanyRequest")
	public JAXBElement<InquiryByIdCustCompanyReqType> createInquiryByIdCustomerCompanyRequest(
			InquiryByIdCustCompanyReqType value) {
		return new JAXBElement<InquiryByIdCustCompanyReqType>(_InquiryByIdCustomerCompanyRequest_QNAME,
				InquiryByIdCustCompanyReqType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link RegisterCustCompanyFaultType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/", name = "registerCustCompanyFault")
	public JAXBElement<RegisterCustCompanyFaultType> createRegisterCustCompanyFault(
			RegisterCustCompanyFaultType value) {
		return new JAXBElement<RegisterCustCompanyFaultType>(_RegisterCustCompanyFault_QNAME,
				RegisterCustCompanyFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link InquiryByIdCustCompanyRespType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/", name = "inquiryByIdCustomerCompanyResponse")
	public JAXBElement<InquiryByIdCustCompanyRespType> createInquiryByIdCustomerCompanyResponse(
			InquiryByIdCustCompanyRespType value) {
		return new JAXBElement<InquiryByIdCustCompanyRespType>(_InquiryByIdCustomerCompanyResponse_QNAME,
				InquiryByIdCustCompanyRespType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link RegisterRespType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/", name = "RegisterResponse")
	public JAXBElement<RegisterRespType> createRegisterResponse(RegisterRespType value) {
		return new JAXBElement<RegisterRespType>(_RegisterResponse_QNAME, RegisterRespType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link RegisterFaultType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/", name = "RegisterFault")
	public JAXBElement<RegisterFaultType> createRegisterFault(RegisterFaultType value) {
		return new JAXBElement<RegisterFaultType>(_RegisterFault_QNAME, RegisterFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link RegisterCustCompanyReqType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/", name = "registerCustCompanyRequest")
	public JAXBElement<RegisterCustCompanyReqType> createRegisterCustCompanyRequest(RegisterCustCompanyReqType value) {
		return new JAXBElement<RegisterCustCompanyReqType>(_RegisterCustCompanyRequest_QNAME,
				RegisterCustCompanyReqType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link RegisterReqType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/", name = "RegisterRequest")
	public JAXBElement<RegisterReqType> createRegisterRequest(RegisterReqType value) {
		return new JAXBElement<RegisterReqType>(_RegisterRequest_QNAME, RegisterReqType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link RegisterCustCompanyRespType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/", name = "registerCustCompanyResponse")
	public JAXBElement<RegisterCustCompanyRespType> createRegisterCustCompanyResponse(
			RegisterCustCompanyRespType value) {
		return new JAXBElement<RegisterCustCompanyRespType>(_RegisterCustCompanyResponse_QNAME,
				RegisterCustCompanyRespType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link InquiryByIdCustomerReqType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/", name = "InquiryByIdCustomerRequest")
	public JAXBElement<InquiryByIdCustomerReqType> createInquiryByIdCustomerRequest(InquiryByIdCustomerReqType value) {
		return new JAXBElement<InquiryByIdCustomerReqType>(_InquiryByIdCustomerRequest_QNAME,
				InquiryByIdCustomerReqType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link InquiryByIdCustomerFaultType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/", name = "InquiryByIdCustomerFault")
	public JAXBElement<InquiryByIdCustomerFaultType> createInquiryByIdCustomerFault(
			InquiryByIdCustomerFaultType value) {
		return new JAXBElement<InquiryByIdCustomerFaultType>(_InquiryByIdCustomerFault_QNAME,
				InquiryByIdCustomerFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link InquiryByIdCustCompanyFaultType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/", name = "inquiryByIdCustomerCompanyfault")
	public JAXBElement<InquiryByIdCustCompanyFaultType> createInquiryByIdCustomerCompanyfault(
			InquiryByIdCustCompanyFaultType value) {
		return new JAXBElement<InquiryByIdCustCompanyFaultType>(_InquiryByIdCustomerCompanyfault_QNAME,
				InquiryByIdCustCompanyFaultType.class, null, value);
	}

}
