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

package com.aliyuncs.slb.model.v20140515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.slb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetLoadBalancerModificationProtectionRequest extends RpcAcsRequest<SetLoadBalancerModificationProtectionResponse> {
	   

	private String modificationProtectionReason;

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String modificationProtectionStatus;

	private String ownerAccount;

	private Long ownerId;

	private String loadBalancerId;
	public SetLoadBalancerModificationProtectionRequest() {
		super("Slb", "2014-05-15", "SetLoadBalancerModificationProtection", "Slb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getModificationProtectionReason() {
		return this.modificationProtectionReason;
	}

	public void setModificationProtectionReason(String modificationProtectionReason) {
		this.modificationProtectionReason = modificationProtectionReason;
		if(modificationProtectionReason != null){
			putQueryParameter("ModificationProtectionReason", modificationProtectionReason);
		}
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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getModificationProtectionStatus() {
		return this.modificationProtectionStatus;
	}

	public void setModificationProtectionStatus(String modificationProtectionStatus) {
		this.modificationProtectionStatus = modificationProtectionStatus;
		if(modificationProtectionStatus != null){
			putQueryParameter("ModificationProtectionStatus", modificationProtectionStatus);
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

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
		if(loadBalancerId != null){
			putQueryParameter("LoadBalancerId", loadBalancerId);
		}
	}

	@Override
	public Class<SetLoadBalancerModificationProtectionResponse> getResponseClass() {
		return SetLoadBalancerModificationProtectionResponse.class;
	}

}
