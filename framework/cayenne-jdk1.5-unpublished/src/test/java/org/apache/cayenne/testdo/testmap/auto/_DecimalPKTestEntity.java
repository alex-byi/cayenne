package org.apache.cayenne.testdo.testmap.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _DecimalPKTestEntity was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DecimalPKTestEntity extends CayenneDataObject {

    @Deprecated
    public static final String DECIMAL_PK_PROPERTY = "decimalPK";
    @Deprecated
    public static final String NAME_PROPERTY = "name";

    public static final String DECIMAL_PK_PK_COLUMN = "DECIMAL_PK";

    public static final Property<BigDecimal> DECIMAL_PK = new Property<BigDecimal>("decimalPK");
    public static final Property<String> NAME = new Property<String>("name");

    public void setDecimalPK(BigDecimal decimalPK) {
        writeProperty("decimalPK", decimalPK);
    }
    public BigDecimal getDecimalPK() {
        return (BigDecimal)readProperty("decimalPK");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

}