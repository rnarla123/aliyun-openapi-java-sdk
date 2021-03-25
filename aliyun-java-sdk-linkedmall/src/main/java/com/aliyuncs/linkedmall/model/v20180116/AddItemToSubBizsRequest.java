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

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkedmall.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddItemToSubBizsRequest extends RpcAcsRequest<AddItemToSubBizsResponse> {
	   

	private String subBizIds;

	private Long itemId;

	private String bizId;

	private String lmItemId;
	public AddItemToSubBizsRequest() {
		super("linkedmall", "2018-01-16", "AddItemToSubBizs", "linkedmall");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSubBizIds() {
		return this.subBizIds;
	}

	public void setSubBizIds(String subBizIds) {
		this.subBizIds = subBizIds;
		if(subBizIds != null){
			putBodyParameter("SubBizIds", subBizIds);
		}
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
		if(itemId != null){
			putBodyParameter("ItemId", itemId.toString());
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putBodyParameter("BizId", bizId);
		}
	}

	public String getLmItemId() {
		return this.lmItemId;
	}

	public void setLmItemId(String lmItemId) {
		this.lmItemId = lmItemId;
		if(lmItemId != null){
			putBodyParameter("LmItemId", lmItemId);
		}
	}

	@Override
	public Class<AddItemToSubBizsResponse> getResponseClass() {
		return AddItemToSubBizsResponse.class;
	}

}
