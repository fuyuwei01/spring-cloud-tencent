/*
 * Tencent is pleased to support the open source community by making Spring Cloud Tencent available.
 *
 * Copyright (C) 2019 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the BSD 3-Clause License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/BSD-3-Clause
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.tencent.cloud.polaris.router.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * the configuration for nearby router.
 *
 * @author lepdou 2022-05-23
 */
@ConfigurationProperties(prefix = "spring.cloud.polaris.router.nearby-router")
public class PolarisNearByRouterProperties {

	private boolean enabled = false;

	private String matchLevel;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getMatchLevel() {
		return matchLevel;
	}

	public void setMatchLevel(String matchLevel) {
		this.matchLevel = matchLevel;
	}

	@Override
	public String toString() {
		return "PolarisNearByRouterProperties{" +
				"enabled=" + enabled +
				", matchLevel='" + matchLevel + '\'' +
				'}';
	}
}
