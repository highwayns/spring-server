package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.RefundStatus;
import io.swagger.model.RefundStepAction;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RefundStep
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")


public class RefundStep   {
  @JsonProperty("reference")
  private Long reference = null;

  @JsonProperty("createDateTimeUtc")
  private OffsetDateTime createDateTimeUtc = null;

  @JsonProperty("action")
  private RefundStepAction action = null;

  @JsonProperty("status")
  private RefundStatus status = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("resultAttributes")
  @Valid
  private Map<String, String> resultAttributes = null;

  public RefundStep reference(Long reference) {
    this.reference = reference;
    return this;
  }

  /**
   * A unique reference of this refund step.
   * @return reference
   **/
  @Schema(description = "A unique reference of this refund step.")
  
    public Long getReference() {
    return reference;
  }

  public void setReference(Long reference) {
    this.reference = reference;
  }

  public RefundStep createDateTimeUtc(OffsetDateTime createDateTimeUtc) {
    this.createDateTimeUtc = createDateTimeUtc;
    return this;
  }

  /**
   * The date and time this refund step has been created.
   * @return createDateTimeUtc
   **/
  @Schema(description = "The date and time this refund step has been created.")
  
    @Valid
    public OffsetDateTime getCreateDateTimeUtc() {
    return createDateTimeUtc;
  }

  public void setCreateDateTimeUtc(OffsetDateTime createDateTimeUtc) {
    this.createDateTimeUtc = createDateTimeUtc;
  }

  public RefundStep action(RefundStepAction action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   **/
  @Schema(description = "")
  
    @Valid
    public RefundStepAction getAction() {
    return action;
  }

  public void setAction(RefundStepAction action) {
    this.action = action;
  }

  public RefundStep status(RefundStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    @Valid
    public RefundStatus getStatus() {
    return status;
  }

  public void setStatus(RefundStatus status) {
    this.status = status;
  }

  public RefundStep description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the result of the performed action.
   * @return description
   **/
  @Schema(description = "A description of the result of the performed action.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RefundStep resultAttributes(Map<String, String> resultAttributes) {
    this.resultAttributes = resultAttributes;
    return this;
  }

  public RefundStep putResultAttributesItem(String key, String resultAttributesItem) {
    if (this.resultAttributes == null) {
      this.resultAttributes = new HashMap<String, String>();
    }
    this.resultAttributes.put(key, resultAttributesItem);
    return this;
  }

  /**
   * List of attributes generated by the refund method, like references, reliability scores etc.
   * @return resultAttributes
   **/
  @Schema(description = "List of attributes generated by the refund method, like references, reliability scores etc.")
  
    public Map<String, String> getResultAttributes() {
    return resultAttributes;
  }

  public void setResultAttributes(Map<String, String> resultAttributes) {
    this.resultAttributes = resultAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundStep refundStep = (RefundStep) o;
    return Objects.equals(this.reference, refundStep.reference) &&
        Objects.equals(this.createDateTimeUtc, refundStep.createDateTimeUtc) &&
        Objects.equals(this.action, refundStep.action) &&
        Objects.equals(this.status, refundStep.status) &&
        Objects.equals(this.description, refundStep.description) &&
        Objects.equals(this.resultAttributes, refundStep.resultAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, createDateTimeUtc, action, status, description, resultAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundStep {\n");
    
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    createDateTimeUtc: ").append(toIndentedString(createDateTimeUtc)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    resultAttributes: ").append(toIndentedString(resultAttributes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
