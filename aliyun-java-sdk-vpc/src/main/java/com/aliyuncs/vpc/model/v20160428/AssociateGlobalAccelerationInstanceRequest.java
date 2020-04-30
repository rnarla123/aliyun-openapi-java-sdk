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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AssociateGlobalAccelerationInstanceRequest extends RpcAcsRequest<AssociateGlobalAccelerationInstanceResponse> {
	   

	private Long resourceOwnerId;

	private String globalAccelerationInstanceId;

	private String backendServerId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String backendServerRegionId;

	private String backendServerType;
	public AssociateGlobalAccelerationInstanceRequest() {
		super("Vpc", "2016-04-28", "AssociateGlobalAccelerationInstance", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getGlobalAccelerationInstanceId() {
		return this.globalAccelerationInstanceId;
	}

	public void setGlobalAccelerationInstanceId(String globalAccelerationInstanceId) {
		this.globalAccelerationInstanceId = globalAccelerationInstanceId;
		if(globalAccelerationInstanceId != null){
			putQueryParameter("GlobalAccelerationInstanceId", globalAccelerationInstanceId);
		}
	}

	public String getBackendServerId() {
		return this.backendServerId;
	}

	public void setBackendServerId(String backendServerId) {
		this.backendServerId = backendServerId;
		if(backendServerId != null){
			putQueryParameter("BackendServerId", backendServerId);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getBackendServerRegionId() {
		return this.backendServerRegionId;
	}

	public void setBackendServerRegionId(String backendServerRegionId) {
		this.backendServerRegionId = backendServerRegionId;
		if(backendServerRegionId != null){
			putQueryParameter("BackendServerRegionId", backendServerRegionId);
		}
	}

	public String getBackendServerType() {
		return this.backendServerType;
	}

	public void setBackendServerType(String backendServerType) {
		this.backendServerType = backendServerType;
		if(backendServerType != null){
			putQueryParameter("BackendServerType", backendServerType);
		}
	}

	@Override
	public Class<AssociateGlobalAccelerationInstanceResponse> getResponseClass() {
		return AssociateGlobalAccelerationInstanceResponse.class;
	}

}
