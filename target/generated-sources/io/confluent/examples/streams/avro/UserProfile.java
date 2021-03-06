/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package io.confluent.examples.streams.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class UserProfile extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserProfile\",\"namespace\":\"io.confluent.examples.streams.avro\",\"fields\":[{\"name\":\"experience\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"region\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String experience;
  @Deprecated public java.lang.String region;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public UserProfile() {}

  /**
   * All-args constructor.
   */
  public UserProfile(java.lang.String experience, java.lang.String region) {
    this.experience = experience;
    this.region = region;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return experience;
    case 1: return region;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: experience = (java.lang.String)value$; break;
    case 1: region = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'experience' field.
   */
  public java.lang.String getExperience() {
    return experience;
  }

  /**
   * Sets the value of the 'experience' field.
   * @param value the value to set.
   */
  public void setExperience(java.lang.String value) {
    this.experience = value;
  }

  /**
   * Gets the value of the 'region' field.
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * Sets the value of the 'region' field.
   * @param value the value to set.
   */
  public void setRegion(java.lang.String value) {
    this.region = value;
  }

  /** Creates a new UserProfile RecordBuilder */
  public static io.confluent.examples.streams.avro.UserProfile.Builder newBuilder() {
    return new io.confluent.examples.streams.avro.UserProfile.Builder();
  }
  
  /** Creates a new UserProfile RecordBuilder by copying an existing Builder */
  public static io.confluent.examples.streams.avro.UserProfile.Builder newBuilder(io.confluent.examples.streams.avro.UserProfile.Builder other) {
    return new io.confluent.examples.streams.avro.UserProfile.Builder(other);
  }
  
  /** Creates a new UserProfile RecordBuilder by copying an existing UserProfile instance */
  public static io.confluent.examples.streams.avro.UserProfile.Builder newBuilder(io.confluent.examples.streams.avro.UserProfile other) {
    return new io.confluent.examples.streams.avro.UserProfile.Builder(other);
  }
  
  /**
   * RecordBuilder for UserProfile instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserProfile>
    implements org.apache.avro.data.RecordBuilder<UserProfile> {

    private java.lang.String experience;
    private java.lang.String region;

    /** Creates a new Builder */
    private Builder() {
      super(io.confluent.examples.streams.avro.UserProfile.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(io.confluent.examples.streams.avro.UserProfile.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.experience)) {
        this.experience = data().deepCopy(fields()[0].schema(), other.experience);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.region)) {
        this.region = data().deepCopy(fields()[1].schema(), other.region);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing UserProfile instance */
    private Builder(io.confluent.examples.streams.avro.UserProfile other) {
            super(io.confluent.examples.streams.avro.UserProfile.SCHEMA$);
      if (isValidValue(fields()[0], other.experience)) {
        this.experience = data().deepCopy(fields()[0].schema(), other.experience);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.region)) {
        this.region = data().deepCopy(fields()[1].schema(), other.region);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'experience' field */
    public java.lang.String getExperience() {
      return experience;
    }
    
    /** Sets the value of the 'experience' field */
    public io.confluent.examples.streams.avro.UserProfile.Builder setExperience(java.lang.String value) {
      validate(fields()[0], value);
      this.experience = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'experience' field has been set */
    public boolean hasExperience() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'experience' field */
    public io.confluent.examples.streams.avro.UserProfile.Builder clearExperience() {
      experience = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'region' field */
    public java.lang.String getRegion() {
      return region;
    }
    
    /** Sets the value of the 'region' field */
    public io.confluent.examples.streams.avro.UserProfile.Builder setRegion(java.lang.String value) {
      validate(fields()[1], value);
      this.region = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'region' field has been set */
    public boolean hasRegion() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'region' field */
    public io.confluent.examples.streams.avro.UserProfile.Builder clearRegion() {
      region = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public UserProfile build() {
      try {
        UserProfile record = new UserProfile();
        record.experience = fieldSetFlags()[0] ? this.experience : (java.lang.String) defaultValue(fields()[0]);
        record.region = fieldSetFlags()[1] ? this.region : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
