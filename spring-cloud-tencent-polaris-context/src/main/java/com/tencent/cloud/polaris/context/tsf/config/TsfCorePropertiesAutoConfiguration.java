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

package com.tencent.cloud.polaris.context.tsf.config;

import com.tencent.cloud.common.tsf.ConditionalOnTsfEnabled;
import com.tencent.cloud.polaris.context.config.PolarisContextAutoConfiguration;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Core properties auto configuration.
 *
 * @author Haotian Zhang
 */
@Configuration(proxyBeanMethods = false)
@AutoConfigureAfter(PolarisContextAutoConfiguration.class)
@ConditionalOnTsfEnabled
public class TsfCorePropertiesAutoConfiguration {

	@Bean
	@ConditionalOnMissingBean
	public TsfCoreProperties tsfCoreProperties() {
		return new TsfCoreProperties();
	}
}
