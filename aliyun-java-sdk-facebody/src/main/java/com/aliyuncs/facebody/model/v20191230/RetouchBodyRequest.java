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

package com.aliyuncs.facebody.model.v20191230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.facebody.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RetouchBodyRequest extends RpcAcsRequest<RetouchBodyResponse> {
	   

	private Float lengthenDegree;

	private Float slimDegree;

	private String imageURL;
	public RetouchBodyRequest() {
		super("facebody", "2019-12-30", "RetouchBody");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Float getLengthenDegree() {
		return this.lengthenDegree;
	}

	public void setLengthenDegree(Float lengthenDegree) {
		this.lengthenDegree = lengthenDegree;
		if(lengthenDegree != null){
			putBodyParameter("LengthenDegree", lengthenDegree.toString());
		}
	}

	public Float getSlimDegree() {
		return this.slimDegree;
	}

	public void setSlimDegree(Float slimDegree) {
		this.slimDegree = slimDegree;
		if(slimDegree != null){
			putBodyParameter("SlimDegree", slimDegree.toString());
		}
	}

	public String getImageURL() {
		return this.imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
		if(imageURL != null){
			putBodyParameter("ImageURL", imageURL);
		}
	}

	@Override
	public Class<RetouchBodyResponse> getResponseClass() {
		return RetouchBodyResponse.class;
	}

}
