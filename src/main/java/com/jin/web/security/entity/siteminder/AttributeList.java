package com.jin.web.security.entity.siteminder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "value", "id", "flags", "ttl", "oid" })
public class AttributeList implements Serializable {
	
	private static final long serialVersionUID = -4954292704425425663L;
	
	@JsonProperty("value")
	private String value;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("flags")
	private Integer flags;
	@JsonProperty("ttl")
	private Integer ttl;
	@JsonProperty("oid")
	private String oid;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("value")
	public String getValue() {
		return value;
	}

	@JsonProperty("value")
	public void setValue(String value) {
		this.value = value;
	}

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("flags")
	public Integer getFlags() {
		return flags;
	}

	@JsonProperty("flags")
	public void setFlags(Integer flags) {
		this.flags = flags;
	}

	@JsonProperty("ttl")
	public Integer getTtl() {
		return ttl;
	}

	@JsonProperty("ttl")
	public void setTtl(Integer ttl) {
		this.ttl = ttl;
	}

	@JsonProperty("oid")
	public String getOid() {
		return oid;
	}

	@JsonProperty("oid")
	public void setOid(String oid) {
		this.oid = oid;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}