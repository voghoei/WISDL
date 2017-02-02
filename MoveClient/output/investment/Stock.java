
package investment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stock"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lastValue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="previousVaue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stock", propOrder = {
    "lastValue",
    "previousVaue"
})
public class Stock {

    protected double lastValue;
    protected double previousVaue;

    /**
     * Gets the value of the lastValue property.
     * 
     */
    public double getLastValue() {
        return lastValue;
    }

    /**
     * Sets the value of the lastValue property.
     * 
     */
    public void setLastValue(double value) {
        this.lastValue = value;
    }

    /**
     * Gets the value of the previousVaue property.
     * 
     */
    public double getPreviousVaue() {
        return previousVaue;
    }

    /**
     * Sets the value of the previousVaue property.
     * 
     */
    public void setPreviousVaue(double value) {
        this.previousVaue = value;
    }

}
