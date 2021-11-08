
package com.backoffice.client.bank;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.backoffice.client.bank package.
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

	private final static QName _TransferSavingsAccountResponse_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/",
			"transferSavingsAccountResponse");
	private final static QName _BankAccountServiceResponse_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/",
			"bankAccountServiceResponse");
	private final static QName _InquiryBankAccountResponse_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/",
			"inquiryBankAccountResponse");
	private final static QName _ManageAccountsFault_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/", "manageAccountsFault");
	private final static QName _TransferSavingsAccountRequest_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/",
			"transferSavingsAccountRequest");
	private final static QName _TransferSavingsAccountFault_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/",
			"transferSavingsAccountFault");
	private final static QName _ManageAccountsRequest_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/", "manageAccountsRequest");
	private final static QName _InquiryBankAccountFault_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/", "inquiryBankAccountFault");
	private final static QName _BankAccountServiceRequest_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/", "bankAccountServiceRequest");
	private final static QName _BankAccountServiceFault_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/", "bankAccountServiceFault");
	private final static QName _InquiryBankAccountRequest_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/", "inquiryBankAccountRequest");
	private final static QName _ManageAccountsResponse_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/", "manageAccountsResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.backoffice.client.bank
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link BankAccountServiceReqType }
	 * 
	 */
	public BankAccountServiceReqType createBankAccountServiceReqType() {
		return new BankAccountServiceReqType();
	}

	/**
	 * Create an instance of {@link OwnerListType }
	 * 
	 */
	public OwnerListType createOwnerListType() {
		return new OwnerListType();
	}

	/**
	 * Create an instance of {@link ErrorsList }
	 * 
	 */
	public ErrorsList createErrorsList() {
		return new ErrorsList();
	}

	/**
	 * Create an instance of {@link InquiryBankAccountFaultType }
	 * 
	 */
	public InquiryBankAccountFaultType createInquiryBankAccountFaultType() {
		return new InquiryBankAccountFaultType();
	}

	/**
	 * Create an instance of {@link CustomerCommonType }
	 * 
	 */
	public CustomerCommonType createCustomerCommonType() {
		return new CustomerCommonType();
	}

	/**
	 * Create an instance of {@link EnrolledAccountInfoType }
	 * 
	 */
	public EnrolledAccountInfoType createEnrolledAccountInfoType() {
		return new EnrolledAccountInfoType();
	}

	/**
	 * Create an instance of {@link ContextResponseType }
	 * 
	 */
	public ContextResponseType createContextResponseType() {
		return new ContextResponseType();
	}

	/**
	 * Create an instance of {@link TransferSavingsAccountRespType }
	 * 
	 */
	public TransferSavingsAccountRespType createTransferSavingsAccountRespType() {
		return new TransferSavingsAccountRespType();
	}

	/**
	 * Create an instance of {@link BankAccountServiceFaultType }
	 * 
	 */
	public BankAccountServiceFaultType createBankAccountServiceFaultType() {
		return new BankAccountServiceFaultType();
	}

	/**
	 * Create an instance of {@link VoucherBankAccountType }
	 * 
	 */
	public VoucherBankAccountType createVoucherBankAccountType() {
		return new VoucherBankAccountType();
	}

	/**
	 * Create an instance of {@link TranactionSIIFType }
	 * 
	 */
	public TranactionSIIFType createTranactionSIIFType() {
		return new TranactionSIIFType();
	}

	/**
	 * Create an instance of {@link BankAccountServiceRespType }
	 * 
	 */
	public BankAccountServiceRespType createBankAccountServiceRespType() {
		return new BankAccountServiceRespType();
	}

	/**
	 * Create an instance of {@link AgentType }
	 * 
	 */
	public AgentType createAgentType() {
		return new AgentType();
	}

	/**
	 * Create an instance of {@link ManageAccountsReqType }
	 * 
	 */
	public ManageAccountsReqType createManageAccountsReqType() {
		return new ManageAccountsReqType();
	}

	/**
	 * Create an instance of {@link ParameterType }
	 * 
	 */
	public ParameterType createParameterType() {
		return new ParameterType();
	}

	/**
	 * Create an instance of {@link TransferSavingsAccountFaultType }
	 * 
	 */
	public TransferSavingsAccountFaultType createTransferSavingsAccountFaultType() {
		return new TransferSavingsAccountFaultType();
	}

	/**
	 * Create an instance of {@link ServiceResponseType }
	 * 
	 */
	public ServiceResponseType createServiceResponseType() {
		return new ServiceResponseType();
	}

	/**
	 * Create an instance of {@link PersonType }
	 * 
	 */
	public PersonType createPersonType() {
		return new PersonType();
	}

	/**
	 * Create an instance of {@link OfficeType }
	 * 
	 */
	public OfficeType createOfficeType() {
		return new OfficeType();
	}

	/**
	 * Create an instance of {@link ServicePointType }
	 * 
	 */
	public ServicePointType createServicePointType() {
		return new ServicePointType();
	}

	/**
	 * Create an instance of {@link ErrorType }
	 * 
	 */
	public ErrorType createErrorType() {
		return new ErrorType();
	}

	/**
	 * Create an instance of {@link InquiryBankAccountRespType }
	 * 
	 */
	public InquiryBankAccountRespType createInquiryBankAccountRespType() {
		return new InquiryBankAccountRespType();
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
	 * Create an instance of {@link InfoAccountType }
	 * 
	 */
	public InfoAccountType createInfoAccountType() {
		return new InfoAccountType();
	}

	/**
	 * Create an instance of {@link TransferSavingsAccountReqType }
	 * 
	 */
	public TransferSavingsAccountReqType createTransferSavingsAccountReqType() {
		return new TransferSavingsAccountReqType();
	}

	/**
	 * Create an instance of {@link LastMovementsListType }
	 * 
	 */
	public LastMovementsListType createLastMovementsListType() {
		return new LastMovementsListType();
	}

	/**
	 * Create an instance of {@link MovementType }
	 * 
	 */
	public MovementType createMovementType() {
		return new MovementType();
	}

	/**
	 * Create an instance of {@link AuthorizedListType }
	 * 
	 */
	public AuthorizedListType createAuthorizedListType() {
		return new AuthorizedListType();
	}

	/**
	 * Create an instance of {@link BankAccountType }
	 * 
	 */
	public BankAccountType createBankAccountType() {
		return new BankAccountType();
	}

	/**
	 * Create an instance of {@link ManageAccountsFaultType }
	 * 
	 */
	public ManageAccountsFaultType createManageAccountsFaultType() {
		return new ManageAccountsFaultType();
	}

	/**
	 * Create an instance of {@link TransactionInfoType }
	 * 
	 */
	public TransactionInfoType createTransactionInfoType() {
		return new TransactionInfoType();
	}

	/**
	 * Create an instance of {@link AccountListType }
	 * 
	 */
	public AccountListType createAccountListType() {
		return new AccountListType();
	}

	/**
	 * Create an instance of {@link ManageAccountsRespType }
	 * 
	 */
	public ManageAccountsRespType createManageAccountsRespType() {
		return new ManageAccountsRespType();
	}

	/**
	 * Create an instance of {@link InfoAccountsListType }
	 * 
	 */
	public InfoAccountsListType createInfoAccountsListType() {
		return new InfoAccountsListType();
	}

	/**
	 * Create an instance of {@link DeviceType }
	 * 
	 */
	public DeviceType createDeviceType() {
		return new DeviceType();
	}

	/**
	 * Create an instance of {@link ParamsAgreementType }
	 * 
	 */
	public ParamsAgreementType createParamsAgreementType() {
		return new ParamsAgreementType();
	}

	/**
	 * Create an instance of {@link InquiryBankAccountReqType }
	 * 
	 */
	public InquiryBankAccountReqType createInquiryBankAccountReqType() {
		return new InquiryBankAccountReqType();
	}

	/**
	 * Create an instance of {@link BankAccountListType }
	 * 
	 */
	public BankAccountListType createBankAccountListType() {
		return new BankAccountListType();
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link TransferSavingsAccountRespType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/", name = "transferSavingsAccountResponse")
	public JAXBElement<TransferSavingsAccountRespType> createTransferSavingsAccountResponse(
			TransferSavingsAccountRespType value) {
		return new JAXBElement<TransferSavingsAccountRespType>(_TransferSavingsAccountResponse_QNAME,
				TransferSavingsAccountRespType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link BankAccountServiceRespType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/", name = "bankAccountServiceResponse")
	public JAXBElement<BankAccountServiceRespType> createBankAccountServiceResponse(BankAccountServiceRespType value) {
		return new JAXBElement<BankAccountServiceRespType>(_BankAccountServiceResponse_QNAME,
				BankAccountServiceRespType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link InquiryBankAccountRespType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/", name = "inquiryBankAccountResponse")
	public JAXBElement<InquiryBankAccountRespType> createInquiryBankAccountResponse(InquiryBankAccountRespType value) {
		return new JAXBElement<InquiryBankAccountRespType>(_InquiryBankAccountResponse_QNAME,
				InquiryBankAccountRespType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ManageAccountsFaultType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/", name = "manageAccountsFault")
	public JAXBElement<ManageAccountsFaultType> createManageAccountsFault(ManageAccountsFaultType value) {
		return new JAXBElement<ManageAccountsFaultType>(_ManageAccountsFault_QNAME, ManageAccountsFaultType.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link TransferSavingsAccountReqType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/", name = "transferSavingsAccountRequest")
	public JAXBElement<TransferSavingsAccountReqType> createTransferSavingsAccountRequest(
			TransferSavingsAccountReqType value) {
		return new JAXBElement<TransferSavingsAccountReqType>(_TransferSavingsAccountRequest_QNAME,
				TransferSavingsAccountReqType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link TransferSavingsAccountFaultType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/", name = "transferSavingsAccountFault")
	public JAXBElement<TransferSavingsAccountFaultType> createTransferSavingsAccountFault(
			TransferSavingsAccountFaultType value) {
		return new JAXBElement<TransferSavingsAccountFaultType>(_TransferSavingsAccountFault_QNAME,
				TransferSavingsAccountFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ManageAccountsReqType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/", name = "manageAccountsRequest")
	public JAXBElement<ManageAccountsReqType> createManageAccountsRequest(ManageAccountsReqType value) {
		return new JAXBElement<ManageAccountsReqType>(_ManageAccountsRequest_QNAME, ManageAccountsReqType.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link InquiryBankAccountFaultType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/", name = "inquiryBankAccountFault")
	public JAXBElement<InquiryBankAccountFaultType> createInquiryBankAccountFault(InquiryBankAccountFaultType value) {
		return new JAXBElement<InquiryBankAccountFaultType>(_InquiryBankAccountFault_QNAME,
				InquiryBankAccountFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link BankAccountServiceReqType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/", name = "bankAccountServiceRequest")
	public JAXBElement<BankAccountServiceReqType> createBankAccountServiceRequest(BankAccountServiceReqType value) {
		return new JAXBElement<BankAccountServiceReqType>(_BankAccountServiceRequest_QNAME,
				BankAccountServiceReqType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link BankAccountServiceFaultType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/", name = "bankAccountServiceFault")
	public JAXBElement<BankAccountServiceFaultType> createBankAccountServiceFault(BankAccountServiceFaultType value) {
		return new JAXBElement<BankAccountServiceFaultType>(_BankAccountServiceFault_QNAME,
				BankAccountServiceFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link InquiryBankAccountReqType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/", name = "inquiryBankAccountRequest")
	public JAXBElement<InquiryBankAccountReqType> createInquiryBankAccountRequest(InquiryBankAccountReqType value) {
		return new JAXBElement<InquiryBankAccountReqType>(_InquiryBankAccountRequest_QNAME,
				InquiryBankAccountReqType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ManageAccountsRespType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/", name = "manageAccountsResponse")
	public JAXBElement<ManageAccountsRespType> createManageAccountsResponse(ManageAccountsRespType value) {
		return new JAXBElement<ManageAccountsRespType>(_ManageAccountsResponse_QNAME, ManageAccountsRespType.class,
				null, value);
	}

}
