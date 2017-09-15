package com.jin.web.security.entity.siteminder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "attributeList", "returnCode", "sessionStartTime", "sessionIdleTTL", "sessionMaxTTL",
		"sessionAuthReason", "sessionCurrentServerTime", "ssoToken", "sessionId", "sessionSpec", "transactionId",
		"authDirName", "authDirOid", "authDirNamespace", "sessionStartTimeString", "sessionLastAccessTimeString",
		"currentTimeString", "currentTime", "responseRedirectURL", "userDN", "clientIP", "idleSessionTimeout",
		"maxSessionTimeout", "sessionLastAccessTime", "universalID", "authFailedMessage", "responseHeaders",
		"authDirServer", "userName" })
public class Results implements Serializable{

	private static final long serialVersionUID = -8420852801870636489L;
	
	@JsonProperty("attributeList")
	private List<AttributeList> attributeList = null;
	@JsonProperty("returnCode")
	private Integer returnCode;
	@JsonProperty("sessionStartTime")
	private Integer sessionStartTime;
	@JsonProperty("sessionIdleTTL")
	private Integer sessionIdleTTL;
	@JsonProperty("sessionMaxTTL")
	private Integer sessionMaxTTL;
	@JsonProperty("sessionAuthReason")
	private Integer sessionAuthReason;
	@JsonProperty("sessionCurrentServerTime")
	private Integer sessionCurrentServerTime;
	@JsonProperty("ssoToken")
	private Object ssoToken;
	@JsonProperty("sessionId")
	private String sessionId;
	@JsonProperty("sessionSpec")
	private String sessionSpec;
	@JsonProperty("transactionId")
	private Object transactionId;
	@JsonProperty("authDirName")
	private String authDirName;
	@JsonProperty("authDirOid")
	private String authDirOid;
	@JsonProperty("authDirNamespace")
	private String authDirNamespace;
	@JsonProperty("sessionStartTimeString")
	private String sessionStartTimeString;
	@JsonProperty("sessionLastAccessTimeString")
	private String sessionLastAccessTimeString;
	@JsonProperty("currentTimeString")
	private String currentTimeString;
	@JsonProperty("currentTime")
	private Long currentTime;
	@JsonProperty("responseRedirectURL")
	private Object responseRedirectURL;
	@JsonProperty("userDN")
	private String userDN;
	@JsonProperty("clientIP")
	private String clientIP;
	@JsonProperty("idleSessionTimeout")
	private Integer idleSessionTimeout;
	@JsonProperty("maxSessionTimeout")
	private Integer maxSessionTimeout;
	@JsonProperty("sessionLastAccessTime")
	private Integer sessionLastAccessTime;
	@JsonProperty("universalID")
	private String universalID;
	@JsonProperty("authFailedMessage")
	private Object authFailedMessage;
	@JsonProperty("responseHeaders")
	private Object responseHeaders;
	@JsonProperty("authDirServer")
	private String authDirServer;
	@JsonProperty("userName")
	private Object userName;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("attributeList")
	public List<AttributeList> getAttributeList() {
		return attributeList;
	}

	@JsonProperty("attributeList")
	public void setAttributeList(List<AttributeList> attributeList) {
		this.attributeList = attributeList;
	}

	@JsonProperty("returnCode")
	public Integer getReturnCode() {
		return returnCode;
	}

	@JsonProperty("returnCode")
	public void setReturnCode(Integer returnCode) {
		this.returnCode = returnCode;
	}

	@JsonProperty("sessionStartTime")
	public Integer getSessionStartTime() {
		return sessionStartTime;
	}

	@JsonProperty("sessionStartTime")
	public void setSessionStartTime(Integer sessionStartTime) {
		this.sessionStartTime = sessionStartTime;
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

	@JsonProperty("sessionAuthReason")
	public Integer getSessionAuthReason() {
		return sessionAuthReason;
	}

	@JsonProperty("sessionAuthReason")
	public void setSessionAuthReason(Integer sessionAuthReason) {
		this.sessionAuthReason = sessionAuthReason;
	}

	@JsonProperty("sessionCurrentServerTime")
	public Integer getSessionCurrentServerTime() {
		return sessionCurrentServerTime;
	}

	@JsonProperty("sessionCurrentServerTime")
	public void setSessionCurrentServerTime(Integer sessionCurrentServerTime) {
		this.sessionCurrentServerTime = sessionCurrentServerTime;
	}

	@JsonProperty("ssoToken")
	public Object getSsoToken() {
		return ssoToken;
	}

	@JsonProperty("ssoToken")
	public void setSsoToken(Object ssoToken) {
		this.ssoToken = ssoToken;
	}

	@JsonProperty("sessionId")
	public String getSessionId() {
		return sessionId;
	}

	@JsonProperty("sessionId")
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@JsonProperty("sessionSpec")
	public String getSessionSpec() {
		return sessionSpec;
	}

	@JsonProperty("sessionSpec")
	public void setSessionSpec(String sessionSpec) {
		this.sessionSpec = sessionSpec;
	}

	@JsonProperty("transactionId")
	public Object getTransactionId() {
		return transactionId;
	}

	@JsonProperty("transactionId")
	public void setTransactionId(Object transactionId) {
		this.transactionId = transactionId;
	}

	@JsonProperty("authDirName")
	public String getAuthDirName() {
		return authDirName;
	}

	@JsonProperty("authDirName")
	public void setAuthDirName(String authDirName) {
		this.authDirName = authDirName;
	}

	@JsonProperty("authDirOid")
	public String getAuthDirOid() {
		return authDirOid;
	}

	@JsonProperty("authDirOid")
	public void setAuthDirOid(String authDirOid) {
		this.authDirOid = authDirOid;
	}

	@JsonProperty("authDirNamespace")
	public String getAuthDirNamespace() {
		return authDirNamespace;
	}

	@JsonProperty("authDirNamespace")
	public void setAuthDirNamespace(String authDirNamespace) {
		this.authDirNamespace = authDirNamespace;
	}

	@JsonProperty("sessionStartTimeString")
	public String getSessionStartTimeString() {
		return sessionStartTimeString;
	}

	@JsonProperty("sessionStartTimeString")
	public void setSessionStartTimeString(String sessionStartTimeString) {
		this.sessionStartTimeString = sessionStartTimeString;
	}

	@JsonProperty("sessionLastAccessTimeString")
	public String getSessionLastAccessTimeString() {
		return sessionLastAccessTimeString;
	}

	@JsonProperty("sessionLastAccessTimeString")
	public void setSessionLastAccessTimeString(String sessionLastAccessTimeString) {
		this.sessionLastAccessTimeString = sessionLastAccessTimeString;
	}

	@JsonProperty("currentTimeString")
	public String getCurrentTimeString() {
		return currentTimeString;
	}

	@JsonProperty("currentTimeString")
	public void setCurrentTimeString(String currentTimeString) {
		this.currentTimeString = currentTimeString;
	}

	@JsonProperty("currentTime")
	public Long getCurrentTime() {
		return currentTime;
	}

	@JsonProperty("currentTime")
	public void setCurrentTime(Long currentTime) {
		this.currentTime = currentTime;
	}

	@JsonProperty("responseRedirectURL")
	public Object getResponseRedirectURL() {
		return responseRedirectURL;
	}

	@JsonProperty("responseRedirectURL")
	public void setResponseRedirectURL(Object responseRedirectURL) {
		this.responseRedirectURL = responseRedirectURL;
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

	@JsonProperty("sessionLastAccessTime")
	public Integer getSessionLastAccessTime() {
		return sessionLastAccessTime;
	}

	@JsonProperty("sessionLastAccessTime")
	public void setSessionLastAccessTime(Integer sessionLastAccessTime) {
		this.sessionLastAccessTime = sessionLastAccessTime;
	}

	@JsonProperty("universalID")
	public String getUniversalID() {
		return universalID;
	}

	@JsonProperty("universalID")
	public void setUniversalID(String universalID) {
		this.universalID = universalID;
	}

	@JsonProperty("authFailedMessage")
	public Object getAuthFailedMessage() {
		return authFailedMessage;
	}

	@JsonProperty("authFailedMessage")
	public void setAuthFailedMessage(Object authFailedMessage) {
		this.authFailedMessage = authFailedMessage;
	}

	@JsonProperty("responseHeaders")
	public Object getResponseHeaders() {
		return responseHeaders;
	}

	@JsonProperty("responseHeaders")
	public void setResponseHeaders(Object responseHeaders) {
		this.responseHeaders = responseHeaders;
	}

	@JsonProperty("authDirServer")
	public String getAuthDirServer() {
		return authDirServer;
	}

	@JsonProperty("authDirServer")
	public void setAuthDirServer(String authDirServer) {
		this.authDirServer = authDirServer;
	}

	@JsonProperty("userName")
	public Object getUserName() {
		return userName;
	}

	@JsonProperty("userName")
	public void setUserName(Object userName) {
		this.userName = userName;
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