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

package com.aliyuncs.linkedmall.transform.v20210616;

import com.aliyuncs.linkedmall.model.v20210616.CreatePermissionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePermissionResponseUnmarshaller {

	public static CreatePermissionResponse unmarshall(CreatePermissionResponse createPermissionResponse, UnmarshallerContext _ctx) {
		
		createPermissionResponse.setRequestId(_ctx.stringValue("CreatePermissionResponse.RequestId"));
		createPermissionResponse.setCode(_ctx.stringValue("CreatePermissionResponse.Code"));
		createPermissionResponse.setMessage(_ctx.stringValue("CreatePermissionResponse.Message"));
		createPermissionResponse.setPermissionId(_ctx.stringValue("CreatePermissionResponse.PermissionId"));
	 
	 	return createPermissionResponse;
	}
}