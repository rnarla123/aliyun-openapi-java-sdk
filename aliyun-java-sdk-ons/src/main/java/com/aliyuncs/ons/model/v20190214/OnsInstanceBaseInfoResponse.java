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

package com.aliyuncs.ons.model.v20190214;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20190214.OnsInstanceBaseInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OnsInstanceBaseInfoResponse extends AcsResponse {

	private String requestId;

	private String helpUrl;

	private InstanceBaseInfo instanceBaseInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHelpUrl() {
		return this.helpUrl;
	}

	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
	}

	public InstanceBaseInfo getInstanceBaseInfo() {
		return this.instanceBaseInfo;
	}

	public void setInstanceBaseInfo(InstanceBaseInfo instanceBaseInfo) {
		this.instanceBaseInfo = instanceBaseInfo;
	}

	public static class InstanceBaseInfo {

		private Boolean independentNaming;

		private Long maxTps;

		private String remark;

		private String instanceName;

		private Long releaseTime;

		private Integer topicCapacity;

		private Integer instanceStatus;

		private String instanceId;

		private Integer instanceType;

		private Endpoints endpoints;

		public Boolean getIndependentNaming() {
			return this.independentNaming;
		}

		public void setIndependentNaming(Boolean independentNaming) {
			this.independentNaming = independentNaming;
		}

		public Long getMaxTps() {
			return this.maxTps;
		}

		public void setMaxTps(Long maxTps) {
			this.maxTps = maxTps;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Long getReleaseTime() {
			return this.releaseTime;
		}

		public void setReleaseTime(Long releaseTime) {
			this.releaseTime = releaseTime;
		}

		public Integer getTopicCapacity() {
			return this.topicCapacity;
		}

		public void setTopicCapacity(Integer topicCapacity) {
			this.topicCapacity = topicCapacity;
		}

		public Integer getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(Integer instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(Integer instanceType) {
			this.instanceType = instanceType;
		}

		public Endpoints getEndpoints() {
			return this.endpoints;
		}

		public void setEndpoints(Endpoints endpoints) {
			this.endpoints = endpoints;
		}

		public static class Endpoints {

			private String tcpEndpoint;

			private String httpInternetEndpoint;

			private String httpInternalEndpoint;

			private String httpInternetSecureEndpoint;

			private String tcpInternetEndpoint;

			public String getTcpEndpoint() {
				return this.tcpEndpoint;
			}

			public void setTcpEndpoint(String tcpEndpoint) {
				this.tcpEndpoint = tcpEndpoint;
			}

			public String getHttpInternetEndpoint() {
				return this.httpInternetEndpoint;
			}

			public void setHttpInternetEndpoint(String httpInternetEndpoint) {
				this.httpInternetEndpoint = httpInternetEndpoint;
			}

			public String getHttpInternalEndpoint() {
				return this.httpInternalEndpoint;
			}

			public void setHttpInternalEndpoint(String httpInternalEndpoint) {
				this.httpInternalEndpoint = httpInternalEndpoint;
			}

			public String getHttpInternetSecureEndpoint() {
				return this.httpInternetSecureEndpoint;
			}

			public void setHttpInternetSecureEndpoint(String httpInternetSecureEndpoint) {
				this.httpInternetSecureEndpoint = httpInternetSecureEndpoint;
			}

			public String getTcpInternetEndpoint() {
				return this.tcpInternetEndpoint;
			}

			public void setTcpInternetEndpoint(String tcpInternetEndpoint) {
				this.tcpInternetEndpoint = tcpInternetEndpoint;
			}
		}
	}

	@Override
	public OnsInstanceBaseInfoResponse getInstance(UnmarshallerContext context) {
		return	OnsInstanceBaseInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
