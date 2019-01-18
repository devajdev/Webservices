//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.02 at 10:59:03 AM IST 
//


package bank.sbi.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saving-accountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saving-accountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://bank/sbi/account}accountDetails"/>
 *         &lt;element name="min-bal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saving-accountType", propOrder = {
    "accNo",
    "holderName",
    "branchName",
    "minBal"
})
public class SavingAccountType {

    @XmlElement(name = "acc-no")
    protected int accNo;
    @XmlElement(name = "holder-name", required = true)
    protected String holderName;
    @XmlElement(name = "branch-name", required = true)
    protected String branchName;
    @XmlElement(name = "min-bal")
    protected int minBal;

    /**
     * Gets the value of the accNo property.
     * 
     */
    public int getAccNo() {
        return accNo;
    }

    /**
     * Sets the value of the accNo property.
     * 
     */
    public void setAccNo(int value) {
        this.accNo = value;
    }

    /**
     * Gets the value of the holderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderName() {
        return holderName;
    }

    /**
     * Sets the value of the holderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderName(String value) {
        this.holderName = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the minBal property.
     * 
     */
    public int getMinBal() {
        return minBal;
    }

    /**
     * Sets the value of the minBal property.
     * 
     */
    public void setMinBal(int value) {
        this.minBal = value;
    }

}
