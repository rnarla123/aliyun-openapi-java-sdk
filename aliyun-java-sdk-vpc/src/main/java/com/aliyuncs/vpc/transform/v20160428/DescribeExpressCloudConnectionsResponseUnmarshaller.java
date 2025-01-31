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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeExpressCloudConnectionsResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionType;
import com.aliyuncs.vpc.model.v20160428.DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionType.VirtualBorderRouterModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExpressCloudConnectionsResponseUnmarshaller {

	public static DescribeExpressCloudConnectionsResponse unmarshall(DescribeExpressCloudConnectionsResponse describeExpressCloudConnectionsResponse, UnmarshallerContext _ctx) {
		
		describeExpressCloudConnectionsResponse.setRequestId(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.RequestId"));
		describeExpressCloudConnectionsResponse.setPageNumber(_ctx.integerValue("DescribeExpressCloudConnectionsResponse.PageNumber"));
		describeExpressCloudConnectionsResponse.setPageSize(_ctx.integerValue("DescribeExpressCloudConnectionsResponse.PageSize"));
		describeExpressCloudConnectionsResponse.setTotalCount(_ctx.integerValue("DescribeExpressCloudConnectionsResponse.TotalCount"));

		List<ExpressCloudConnectionType> expressCloudConnectionSet = new ArrayList<ExpressCloudConnectionType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet.Length"); i++) {
			ExpressCloudConnectionType expressCloudConnectionType = new ExpressCloudConnectionType();
			expressCloudConnectionType.setReservationActiveTime(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].ReservationActiveTime"));
			expressCloudConnectionType.setType(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].Type"));
			expressCloudConnectionType.setStatus(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].Status"));
			expressCloudConnectionType.setReservationOrderType(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].ReservationOrderType"));
			expressCloudConnectionType.setDistance(_ctx.integerValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].Distance"));
			expressCloudConnectionType.setConstructionPeriod(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].ConstructionPeriod"));
			expressCloudConnectionType.setChargeType(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].ChargeType"));
			expressCloudConnectionType.setApplicationBandwidth(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].ApplicationBandwidth"));
			expressCloudConnectionType.setCeIp(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].CeIp"));
			expressCloudConnectionType.setBgpAs(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].BgpAs"));
			expressCloudConnectionType.setIDCardNo(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].IDCardNo"));
			expressCloudConnectionType.setReservationInternetChargeType(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].ReservationInternetChargeType"));
			expressCloudConnectionType.setBandwidth(_ctx.integerValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].Bandwidth"));
			expressCloudConnectionType.setDescription(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].Description"));
			expressCloudConnectionType.setReservationBandwidth(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].ReservationBandwidth"));
			expressCloudConnectionType.setApplicationStatus(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].ApplicationStatus"));
			expressCloudConnectionType.setPeerCity(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].PeerCity"));
			expressCloudConnectionType.setPeerLocation(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].PeerLocation"));
			expressCloudConnectionType.setName(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].Name"));
			expressCloudConnectionType.setPeIp(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].PeIp"));
			expressCloudConnectionType.setContactMail(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].ContactMail"));
			expressCloudConnectionType.setGmtModify(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].GmtModify"));
			expressCloudConnectionType.setCircuitCode(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].CircuitCode"));
			expressCloudConnectionType.setApplicationType(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].ApplicationType"));
			expressCloudConnectionType.setInstanceId(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].InstanceId"));
			expressCloudConnectionType.setRedundantEccId(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].RedundantEccId"));
			expressCloudConnectionType.setIsp(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].Isp"));
			expressCloudConnectionType.setEndTime(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].EndTime"));
			expressCloudConnectionType.setContactTel(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].ContactTel"));
			expressCloudConnectionType.setIdcSP(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].IdcSP"));
			expressCloudConnectionType.setEstimatedTime(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].EstimatedTime"));
			expressCloudConnectionType.setPortType(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].PortType"));
			expressCloudConnectionType.setGmtCreate(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].GmtCreate"));
			expressCloudConnectionType.setBusinessStatus(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].BusinessStatus"));
			expressCloudConnectionType.setApplicationId(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].ApplicationId"));
			expressCloudConnectionType.setHasReservationData(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].HasReservationData"));

			List<VirtualBorderRouterModel> virtualBorderRouterModels = new ArrayList<VirtualBorderRouterModel>();
			for (int j = 0; j < _ctx.lengthValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].VirtualBorderRouterModels.Length"); j++) {
				VirtualBorderRouterModel virtualBorderRouterModel = new VirtualBorderRouterModel();
				virtualBorderRouterModel.setInstanceId(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].VirtualBorderRouterModels["+ j +"].InstanceId"));
				virtualBorderRouterModel.setAccessPointId(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].VirtualBorderRouterModels["+ j +"].AccessPointId"));
				virtualBorderRouterModel.setPhysicalConnectionId(_ctx.stringValue("DescribeExpressCloudConnectionsResponse.ExpressCloudConnectionSet["+ i +"].VirtualBorderRouterModels["+ j +"].PhysicalConnectionId"));

				virtualBorderRouterModels.add(virtualBorderRouterModel);
			}
			expressCloudConnectionType.setVirtualBorderRouterModels(virtualBorderRouterModels);

			expressCloudConnectionSet.add(expressCloudConnectionType);
		}
		describeExpressCloudConnectionsResponse.setExpressCloudConnectionSet(expressCloudConnectionSet);
	 
	 	return describeExpressCloudConnectionsResponse;
	}
}