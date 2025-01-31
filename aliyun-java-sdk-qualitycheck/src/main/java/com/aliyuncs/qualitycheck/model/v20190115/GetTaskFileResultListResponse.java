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

package com.aliyuncs.qualitycheck.model.v20190115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.GetTaskFileResultListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTaskFileResultListResponse extends AcsResponse {

	private Integer dataSize;

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer pageSize;

	private Integer totalCount;

	private List<TaskResultReviewInfo> data;

	public Integer getDataSize() {
		return this.dataSize;
	}

	public void setDataSize(Integer dataSize) {
		this.dataSize = dataSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<TaskResultReviewInfo> getData() {
		return this.data;
	}

	public void setData(List<TaskResultReviewInfo> data) {
		this.data = data;
	}

	public static class TaskResultReviewInfo {

		private Integer status;

		private Integer dataType;

		private Integer hitNumber;

		private Boolean hitRule;

		private String nextVid;

		private String preVid;

		private Float reviewAccuracyRate;

		private Integer realViolationNumber;

		private Boolean isHitRule;

		private String fileName;

		private Integer totalScore;

		private Integer checkNumber;

		private String fileMergeName;

		private String bucketName;

		private Boolean handTaskFile;

		private String taskId;

		private String vid;

		private List<String> hitRuleSet;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getDataType() {
			return this.dataType;
		}

		public void setDataType(Integer dataType) {
			this.dataType = dataType;
		}

		public Integer getHitNumber() {
			return this.hitNumber;
		}

		public void setHitNumber(Integer hitNumber) {
			this.hitNumber = hitNumber;
		}

		public Boolean getHitRule() {
			return this.hitRule;
		}

		public void setHitRule(Boolean hitRule) {
			this.hitRule = hitRule;
		}

		public String getNextVid() {
			return this.nextVid;
		}

		public void setNextVid(String nextVid) {
			this.nextVid = nextVid;
		}

		public String getPreVid() {
			return this.preVid;
		}

		public void setPreVid(String preVid) {
			this.preVid = preVid;
		}

		public Float getReviewAccuracyRate() {
			return this.reviewAccuracyRate;
		}

		public void setReviewAccuracyRate(Float reviewAccuracyRate) {
			this.reviewAccuracyRate = reviewAccuracyRate;
		}

		public Integer getRealViolationNumber() {
			return this.realViolationNumber;
		}

		public void setRealViolationNumber(Integer realViolationNumber) {
			this.realViolationNumber = realViolationNumber;
		}

		public Boolean getIsHitRule() {
			return this.isHitRule;
		}

		public void setIsHitRule(Boolean isHitRule) {
			this.isHitRule = isHitRule;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public Integer getTotalScore() {
			return this.totalScore;
		}

		public void setTotalScore(Integer totalScore) {
			this.totalScore = totalScore;
		}

		public Integer getCheckNumber() {
			return this.checkNumber;
		}

		public void setCheckNumber(Integer checkNumber) {
			this.checkNumber = checkNumber;
		}

		public String getFileMergeName() {
			return this.fileMergeName;
		}

		public void setFileMergeName(String fileMergeName) {
			this.fileMergeName = fileMergeName;
		}

		public String getBucketName() {
			return this.bucketName;
		}

		public void setBucketName(String bucketName) {
			this.bucketName = bucketName;
		}

		public Boolean getHandTaskFile() {
			return this.handTaskFile;
		}

		public void setHandTaskFile(Boolean handTaskFile) {
			this.handTaskFile = handTaskFile;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getVid() {
			return this.vid;
		}

		public void setVid(String vid) {
			this.vid = vid;
		}

		public List<String> getHitRuleSet() {
			return this.hitRuleSet;
		}

		public void setHitRuleSet(List<String> hitRuleSet) {
			this.hitRuleSet = hitRuleSet;
		}
	}

	@Override
	public GetTaskFileResultListResponse getInstance(UnmarshallerContext context) {
		return	GetTaskFileResultListResponseUnmarshaller.unmarshall(this, context);
	}
}
