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

package com.aliyuncs.mindlive.model.v20210301;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ReportScreenRequest extends RpcAcsRequest<ReportScreenResponse> {
	   

	private String screenShotReportRequest;

	private String user;
	public ReportScreenRequest() {
		super("MindLive", "2021-03-01", "ReportScreen");
		setMethod(MethodType.POST);
	}

	public String getScreenShotReportRequest() {
		return this.screenShotReportRequest;
	}

	public void setScreenShotReportRequest(String screenShotReportRequest) {
		this.screenShotReportRequest = screenShotReportRequest;
		if(screenShotReportRequest != null){
			putQueryParameter("ScreenShotReportRequest", screenShotReportRequest);
		}
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
		if(user != null){
			putQueryParameter("User", user);
		}
	}

	@Override
	public Class<ReportScreenResponse> getResponseClass() {
		return ReportScreenResponse.class;
	}

}
