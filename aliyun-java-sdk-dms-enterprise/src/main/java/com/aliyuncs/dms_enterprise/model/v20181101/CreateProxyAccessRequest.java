/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateProxyAccessRequest extends RpcAcsRequest<CreateProxyAccessResponse> {
	   

	private String indepAccount;

	private Long userId;

	private Long tid;

	private String indepPassword;

	private Long proxyId;
	public CreateProxyAccessRequest() {
		super("dms-enterprise", "2018-11-01", "CreateProxyAccess", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIndepAccount() {
		return this.indepAccount;
	}

	public void setIndepAccount(String indepAccount) {
		this.indepAccount = indepAccount;
		if(indepAccount != null){
			putQueryParameter("IndepAccount", indepAccount);
		}
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId.toString());
		}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public String getIndepPassword() {
		return this.indepPassword;
	}

	public void setIndepPassword(String indepPassword) {
		this.indepPassword = indepPassword;
		if(indepPassword != null){
			putQueryParameter("IndepPassword", indepPassword);
		}
	}

	public Long getProxyId() {
		return this.proxyId;
	}

	public void setProxyId(Long proxyId) {
		this.proxyId = proxyId;
		if(proxyId != null){
			putQueryParameter("ProxyId", proxyId.toString());
		}
	}

	@Override
	public Class<CreateProxyAccessResponse> getResponseClass() {
		return CreateProxyAccessResponse.class;
	}

}
