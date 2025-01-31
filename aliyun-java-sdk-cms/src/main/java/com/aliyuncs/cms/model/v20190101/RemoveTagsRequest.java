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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RemoveTagsRequest extends RpcAcsRequest<RemoveTagsResponse> {
	   

	private List<String> groupIdss;

	private List<Tag> tags;
	public RemoveTagsRequest() {
		super("Cms", "2019-01-01", "RemoveTags", "Cms");
		setMethod(MethodType.POST);
	}

	public List<String> getGroupIdss() {
		return this.groupIdss;
	}

	public void setGroupIdss(List<String> groupIdss) {
		this.groupIdss = groupIdss;	
		if (groupIdss != null) {
			for (int i = 0; i < groupIdss.size(); i++) {
				putQueryParameter("GroupIds." + (i + 1) , groupIdss.get(i));
			}
		}	
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<RemoveTagsResponse> getResponseClass() {
		return RemoveTagsResponse.class;
	}

}
