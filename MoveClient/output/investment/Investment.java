
package investment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for investment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="investment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totalValue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="totalpreviousVaue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="currencyrate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "investment", propOrder = {
    "totalValue",
    "totalpreviousVaue",
    "currencyrate"
})
public class Investment {

    protected double totalValue;
    protected double totalpreviousVaue;
    protected double currencyrate;

    /**
     * Gets the value of the totalValue property.
     * 
     */
    public double getTotalValue() {
        return totalValue;
    }

    /**
     * Sets the value of the totalValue property.
     * 
     */
    public void setTotalValue(double value) {
        this.totalValue = value;
    }

    /**
     * Gets the value of the totalpreviousVaue property.
     * 
     */
    public double getTotalpreviousVaue() {
        return totalpreviousVaue;
    }

    /**
     * Sets the value of the totalpreviousVaue property.
     * 
     */
    public void setTotalpreviousVaue(double value) {
        this.totalpreviousVaue = value;
    }

    /**
     * Gets the value of the currencyrate property.
     * 
     */
    public double getCurrencyrate() {
        return currencyrate;
    }

    /**
     * Sets the value of the currencyrate property.
     * 
     */
    public void setCurrencyrate(double value) {
        this.currencyrate = value;
    }

}
