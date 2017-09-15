package com.jin.web.security.entity.siteminder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "results", "userDN", "clientIP", "idleSessionTimeout", "maxSessionTimeout", "universalID",
		"returnCode", "sessionIdleTTL", "sessionMaxTTL", "currentTimestamp", "sessionStartTimestamp",
		"sessionLastAccessTimestamp", "sessionData", "sessionId" })
public class LoginResponse implements Serializable{

	private static final long serialVersionUID = -4761959147013098806L;
	
	@JsonProperty("results")
	private Results results;
	@JsonProperty("userDN")
	private String userDN;
	@JsonProperty("clientIP")
	private String clientIP;
	@JsonProperty("idleSessionTimeout")
	private Integer idleSessionTimeout;
	@JsonProperty("maxSessionTimeout")
	private Integer maxSessionTimeout;
	@JsonProperty("universalID")
	private String universalID;
	@JsonProperty("returnCode")
	private Integer returnCode;
	@JsonProperty("sessionIdleTTL")
	private Integer sessionIdleTTL;
	@JsonProperty("sessionMaxTTL")
	private Integer sessionMaxTTL;
	@JsonProperty("currentTimestamp")
	private String currentTimestamp;
	@JsonProperty("sessionStartTimestamp")
	private String sessionStartTimestamp;
	@JsonProperty("sessionLastAccessTimestamp")
	private String sessionLastAccessTimestamp;
	@JsonProperty("sessionData")
	private String sessionData;
	@JsonProperty("sessionId")
	private String sessionId;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("results")
	public Results getResults() {
		return results;
	}

	@JsonProperty("results")
	public void setResults(Results results) {
		this.results = results;
	}

	@JsonProperty("userDN")
	public String getUserDN() {
		return userDN;
	}

	@JsonProperty("userDN")
	public void setUserDN(String userDN) {
		this.userDN = userDN;
	}

	@JsonProperty("clientIP")
	public String getClientIP() {
		return clientIP;
	}

	@JsonProperty("clientIP")
	public void setClientIP(String clientIP) {
		this.clientIP = clientIP;
	}

	@JsonProperty("idleSessionTimeout")
	public Integer getIdleSessionTimeout() {
		return idleSessionTimeout;
	}

	@JsonProperty("idleSessionTimeout")
	public void setIdleSessionTimeout(Integer idleSessionTimeout) {
		this.idleSessionTimeout = idleSessionTimeout;
	}

	@JsonProperty("maxSessionTimeout")
	public Integer getMaxSessionTimeout() {
		return maxSessionTimeout;
	}

	@JsonProperty("maxSessionTimeout")
	public void setMaxSessionTimeout(Integer maxSessionTimeout) {
		this.maxSessionTimeout = maxSessionTimeout;
	}

	@JsonProperty("universalID")
	public String getUniversalID() {
		return universalID;
	}

	@JsonProperty("universalID")
	public void setUniversalID(String universalID) {
		this.universalID = universalID;
	}

	@JsonProperty("returnCode")
	public Integer getReturnCode() {
		return returnCode;
	}

	@JsonProperty("returnCode")
	public void setReturnCode(Integer returnCode) {
		this.returnCode = returnCode;
	}

	@JsonProperty("sessionIdleTTL")
	public Integer getSessionIdleTTL() {
		return sessionIdleTTL;
	}

	@JsonProperty("sessionIdleTTL")
	public void setSessionIdleTTL(Integer sessionIdleTTL) {
		this.sessionIdleTTL = sessionIdleTTL;
	}

	@JsonProperty("sessionMaxTTL")
	public Integer getSessionMaxTTL() {
		return sessionMaxTTL;
	}

	@JsonProperty("sessionMaxTTL")
	public void setSessionMaxTTL(Integer sessionMaxTTL) {
		this.sessionMaxTTL = sessionMaxTTL;
	}

	@JsonProperty("currentTimestamp")
	public String getCurrentTimestamp() {
		return currentTimestamp;
	}

	@JsonProperty("currentTimestamp")
	public void setCurrentTimestamp(String currentTimestamp) {
		this.currentTimestamp = currentTimestamp;
	}

	@JsonProperty("sessionStartTimestamp")
	public String getSessionStartTimestamp() {
		return sessionStartTimestamp;
	}

	@JsonProperty("sessionStartTimestamp")
	public void setSessionStartTimestamp(String sessionStartTimestamp) {
		this.sessionStartTimestamp = sessionStartTimestamp;
	}

	@JsonProperty("sessionLastAccessTimestamp")
	public String getSessionLastAccessTimestamp() {
		return sessionLastAccessTimestamp;
	}

	@JsonProperty("sessionLastAccessTimestamp")
	public void setSessionLastAccessTimestamp(String sessionLastAccessTimestamp) {
		this.sessionLastAccessTimestamp = sessionLastAccessTimestamp;
	}

	@JsonProperty("sessionData")
	public String getSessionData() {
		return sessionData;
	}

	@JsonProperty("sessionData")
	public void setSessionData(String sessionData) {
		this.sessionData = sessionData;
	}

	@JsonProperty("sessionId")
	public String getSessionId() {
		return sessionId;
	}

	@JsonProperty("sessionId")
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
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