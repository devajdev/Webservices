//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.02 at 11:44:45 AM IST 
//


package bank.sbi.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bankaccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankaccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saving-account" type="{http://bank/sbi/account}saving-accountType"/>
 *         &lt;element name="current-account" type="{http://bank/sbi/account}current-accountType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankaccountType", propOrder = {
    "savingAccount",
    "currentAccount"
})
public class BankaccountType {

    @XmlElement(name = "saving-account", required = true)
    protected SavingAccountType savingAccount;
    @XmlElement(name = "current-account", required = true)
    protected CurrentAccountType currentAccount;

    /**
     * Gets the value of the savingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link SavingAccountType }
     *     
     */
    public SavingAccountType getSavingAccount() {
        return savingAccount;
    }

    /**
     * Sets the value of the savingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SavingAccountType }
     *     
     */
    public void setSavingAccount(SavingAccountType value) {
        this.savingAccount = value;
    }

    /**
     * Gets the value of the currentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentAccountType }
     *     
     */
    public CurrentAccountType getCurrentAccount() {
        return currentAccount;
    }

    /**
     * Sets the value of the currentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentAccountType }
     *     
     */
    public void setCurrentAccount(CurrentAccountType value) {
        this.currentAccount = value;
    }

}
