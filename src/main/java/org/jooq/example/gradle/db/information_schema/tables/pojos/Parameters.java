/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Parameters implements Serializable {

	private static final long serialVersionUID = -1567626839;

	private String  specificCatalog;
	private String  specificSchema;
	private String  specificName;
	private Integer ordinalPosition;
	private String  parameterMode;
	private String  parameterName;
	private String  dataType;
	private Integer characterMaximumLength;
	private Integer characterOctetLength;
	private ULong   numericPrecision;
	private Integer numericScale;
	private ULong   datetimePrecision;
	private String  characterSetName;
	private String  collationName;
	private String  dtdIdentifier;
	private String  routineType;

	public Parameters() {}

	public Parameters(Parameters value) {
		this.specificCatalog = value.specificCatalog;
		this.specificSchema = value.specificSchema;
		this.specificName = value.specificName;
		this.ordinalPosition = value.ordinalPosition;
		this.parameterMode = value.parameterMode;
		this.parameterName = value.parameterName;
		this.dataType = value.dataType;
		this.characterMaximumLength = value.characterMaximumLength;
		this.characterOctetLength = value.characterOctetLength;
		this.numericPrecision = value.numericPrecision;
		this.numericScale = value.numericScale;
		this.datetimePrecision = value.datetimePrecision;
		this.characterSetName = value.characterSetName;
		this.collationName = value.collationName;
		this.dtdIdentifier = value.dtdIdentifier;
		this.routineType = value.routineType;
	}

	public Parameters(
		String  specificCatalog,
		String  specificSchema,
		String  specificName,
		Integer ordinalPosition,
		String  parameterMode,
		String  parameterName,
		String  dataType,
		Integer characterMaximumLength,
		Integer characterOctetLength,
		ULong   numericPrecision,
		Integer numericScale,
		ULong   datetimePrecision,
		String  characterSetName,
		String  collationName,
		String  dtdIdentifier,
		String  routineType
	) {
		this.specificCatalog = specificCatalog;
		this.specificSchema = specificSchema;
		this.specificName = specificName;
		this.ordinalPosition = ordinalPosition;
		this.parameterMode = parameterMode;
		this.parameterName = parameterName;
		this.dataType = dataType;
		this.characterMaximumLength = characterMaximumLength;
		this.characterOctetLength = characterOctetLength;
		this.numericPrecision = numericPrecision;
		this.numericScale = numericScale;
		this.datetimePrecision = datetimePrecision;
		this.characterSetName = characterSetName;
		this.collationName = collationName;
		this.dtdIdentifier = dtdIdentifier;
		this.routineType = routineType;
	}

	public String getSpecificCatalog() {
		return this.specificCatalog;
	}

	public void setSpecificCatalog(String specificCatalog) {
		this.specificCatalog = specificCatalog;
	}

	public String getSpecificSchema() {
		return this.specificSchema;
	}

	public void setSpecificSchema(String specificSchema) {
		this.specificSchema = specificSchema;
	}

	public String getSpecificName() {
		return this.specificName;
	}

	public void setSpecificName(String specificName) {
		this.specificName = specificName;
	}

	public Integer getOrdinalPosition() {
		return this.ordinalPosition;
	}

	public void setOrdinalPosition(Integer ordinalPosition) {
		this.ordinalPosition = ordinalPosition;
	}

	public String getParameterMode() {
		return this.parameterMode;
	}

	public void setParameterMode(String parameterMode) {
		this.parameterMode = parameterMode;
	}

	public String getParameterName() {
		return this.parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public Integer getCharacterMaximumLength() {
		return this.characterMaximumLength;
	}

	public void setCharacterMaximumLength(Integer characterMaximumLength) {
		this.characterMaximumLength = characterMaximumLength;
	}

	public Integer getCharacterOctetLength() {
		return this.characterOctetLength;
	}

	public void setCharacterOctetLength(Integer characterOctetLength) {
		this.characterOctetLength = characterOctetLength;
	}

	public ULong getNumericPrecision() {
		return this.numericPrecision;
	}

	public void setNumericPrecision(ULong numericPrecision) {
		this.numericPrecision = numericPrecision;
	}

	public Integer getNumericScale() {
		return this.numericScale;
	}

	public void setNumericScale(Integer numericScale) {
		this.numericScale = numericScale;
	}

	public ULong getDatetimePrecision() {
		return this.datetimePrecision;
	}

	public void setDatetimePrecision(ULong datetimePrecision) {
		this.datetimePrecision = datetimePrecision;
	}

	public String getCharacterSetName() {
		return this.characterSetName;
	}

	public void setCharacterSetName(String characterSetName) {
		this.characterSetName = characterSetName;
	}

	public String getCollationName() {
		return this.collationName;
	}

	public void setCollationName(String collationName) {
		this.collationName = collationName;
	}

	public String getDtdIdentifier() {
		return this.dtdIdentifier;
	}

	public void setDtdIdentifier(String dtdIdentifier) {
		this.dtdIdentifier = dtdIdentifier;
	}

	public String getRoutineType() {
		return this.routineType;
	}

	public void setRoutineType(String routineType) {
		this.routineType = routineType;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Parameters (");

		sb.append(specificCatalog);
		sb.append(", ").append(specificSchema);
		sb.append(", ").append(specificName);
		sb.append(", ").append(ordinalPosition);
		sb.append(", ").append(parameterMode);
		sb.append(", ").append(parameterName);
		sb.append(", ").append(dataType);
		sb.append(", ").append(characterMaximumLength);
		sb.append(", ").append(characterOctetLength);
		sb.append(", ").append(numericPrecision);
		sb.append(", ").append(numericScale);
		sb.append(", ").append(datetimePrecision);
		sb.append(", ").append(characterSetName);
		sb.append(", ").append(collationName);
		sb.append(", ").append(dtdIdentifier);
		sb.append(", ").append(routineType);

		sb.append(")");
		return sb.toString();
	}
}