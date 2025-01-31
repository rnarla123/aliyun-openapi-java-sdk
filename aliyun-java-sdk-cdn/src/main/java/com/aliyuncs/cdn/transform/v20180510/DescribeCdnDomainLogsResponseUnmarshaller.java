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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeCdnDomainLogsResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnDomainLogsResponse.DomainLogDetail;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnDomainLogsResponse.DomainLogDetail.LogInfoDetail;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnDomainLogsResponse.DomainLogDetail.PageInfos;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnDomainLogsResponseUnmarshaller {

	public static DescribeCdnDomainLogsResponse unmarshall(DescribeCdnDomainLogsResponse describeCdnDomainLogsResponse, UnmarshallerContext _ctx) {
		
		describeCdnDomainLogsResponse.setRequestId(_ctx.stringValue("DescribeCdnDomainLogsResponse.RequestId"));

		List<DomainLogDetail> domainLogDetails = new ArrayList<DomainLogDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCdnDomainLogsResponse.DomainLogDetails.Length"); i++) {
			DomainLogDetail domainLogDetail = new DomainLogDetail();
			domainLogDetail.setDomainName(_ctx.stringValue("DescribeCdnDomainLogsResponse.DomainLogDetails["+ i +"].DomainName"));
			domainLogDetail.setLogCount(_ctx.longValue("DescribeCdnDomainLogsResponse.DomainLogDetails["+ i +"].LogCount"));

			PageInfos pageInfos = new PageInfos();
			pageInfos.setPageIndex(_ctx.longValue("DescribeCdnDomainLogsResponse.DomainLogDetails["+ i +"].PageInfos.PageIndex"));
			pageInfos.setPageSize(_ctx.longValue("DescribeCdnDomainLogsResponse.DomainLogDetails["+ i +"].PageInfos.PageSize"));
			pageInfos.setTotal(_ctx.longValue("DescribeCdnDomainLogsResponse.DomainLogDetails["+ i +"].PageInfos.Total"));
			domainLogDetail.setPageInfos(pageInfos);

			List<LogInfoDetail> logInfos = new ArrayList<LogInfoDetail>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCdnDomainLogsResponse.DomainLogDetails["+ i +"].LogInfos.Length"); j++) {
				LogInfoDetail logInfoDetail = new LogInfoDetail();
				logInfoDetail.setLogName(_ctx.stringValue("DescribeCdnDomainLogsResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogName"));
				logInfoDetail.setLogPath(_ctx.stringValue("DescribeCdnDomainLogsResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogPath"));
				logInfoDetail.setLogSize(_ctx.longValue("DescribeCdnDomainLogsResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogSize"));
				logInfoDetail.setStartTime(_ctx.stringValue("DescribeCdnDomainLogsResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].StartTime"));
				logInfoDetail.setEndTime(_ctx.stringValue("DescribeCdnDomainLogsResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].EndTime"));

				logInfos.add(logInfoDetail);
			}
			domainLogDetail.setLogInfos(logInfos);

			domainLogDetails.add(domainLogDetail);
		}
		describeCdnDomainLogsResponse.setDomainLogDetails(domainLogDetails);
	 
	 	return describeCdnDomainLogsResponse;
	}
}