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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.UpdateImageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateImageResponse extends AcsResponse {

	private String remarksArrayB;

	private String modifyTime;

	private String remarksC;

	private String remarksD;

	private String requestId;

	private String createTime;

	private String externalId;

	private String remarksArrayA;

	private String remarksA;

	private String imageUri;

	private String setId;

	private String remarksB;

	public String getRemarksArrayB() {
		return this.remarksArrayB;
	}

	public void setRemarksArrayB(String remarksArrayB) {
		this.remarksArrayB = remarksArrayB;
	}

	public String getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getRemarksC() {
		return this.remarksC;
	}

	public void setRemarksC(String remarksC) {
		this.remarksC = remarksC;
	}

	public String getRemarksD() {
		return this.remarksD;
	}

	public void setRemarksD(String remarksD) {
		this.remarksD = remarksD;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getRemarksArrayA() {
		return this.remarksArrayA;
	}

	public void setRemarksArrayA(String remarksArrayA) {
		this.remarksArrayA = remarksArrayA;
	}

	public String getRemarksA() {
		return this.remarksA;
	}

	public void setRemarksA(String remarksA) {
		this.remarksA = remarksA;
	}

	public String getImageUri() {
		return this.imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	public String getSetId() {
		return this.setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
	}

	public String getRemarksB() {
		return this.remarksB;
	}

	public void setRemarksB(String remarksB) {
		this.remarksB = remarksB;
	}

	@Override
	public UpdateImageResponse getInstance(UnmarshallerContext context) {
		return	UpdateImageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
