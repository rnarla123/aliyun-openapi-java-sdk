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

package com.aliyuncs.cloudesl.transform.v20200201;

import com.aliyuncs.cloudesl.model.v20200201.UnbindStoreEslDevicesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnbindStoreEslDevicesResponseUnmarshaller {

	public static UnbindStoreEslDevicesResponse unmarshall(UnbindStoreEslDevicesResponse unbindStoreEslDevicesResponse, UnmarshallerContext _ctx) {
		
		unbindStoreEslDevicesResponse.setRequestId(_ctx.stringValue("UnbindStoreEslDevicesResponse.RequestId"));
		unbindStoreEslDevicesResponse.setErrorMessage(_ctx.stringValue("UnbindStoreEslDevicesResponse.ErrorMessage"));
		unbindStoreEslDevicesResponse.setSuccess(_ctx.booleanValue("UnbindStoreEslDevicesResponse.Success"));
		unbindStoreEslDevicesResponse.setErrorCode(_ctx.stringValue("UnbindStoreEslDevicesResponse.ErrorCode"));
		unbindStoreEslDevicesResponse.setCode(_ctx.stringValue("UnbindStoreEslDevicesResponse.Code"));
		unbindStoreEslDevicesResponse.setMessage(_ctx.stringValue("UnbindStoreEslDevicesResponse.Message"));
		unbindStoreEslDevicesResponse.setDynamicMessage(_ctx.stringValue("UnbindStoreEslDevicesResponse.DynamicMessage"));
	 
	 	return unbindStoreEslDevicesResponse;
	}
}