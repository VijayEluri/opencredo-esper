/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opencredo.esper.integration.config.xml;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSimpleBeanDefinitionParser;
import org.springframework.integration.config.xml.IntegrationNamespaceUtils;
import org.springframework.util.ObjectUtils;
import org.w3c.dom.Element;

public class InboundChannelAdapterParser extends AbstractSimpleBeanDefinitionParser {

	private static String[] referenceAttributes = new String[] { "channel" };

	@Override
	protected boolean isEligibleAttribute(String attributeName) {
		return !ObjectUtils.containsElement(referenceAttributes, attributeName)
				&& super.isEligibleAttribute(attributeName);
	}
	
	@Override
	protected String getBeanClassName(Element element) {
		return EsperIntegrationNamespaceUtils.BASE_PACKAGE + ".EventDrivenEsperInboundChannelAdapter";
	}

	@Override
	protected void postProcess(BeanDefinitionBuilder builder,
			Element element) {
		for (String attributeName : referenceAttributes) {
			IntegrationNamespaceUtils.setReferenceIfAttributeDefined(builder, element, attributeName);
		}
	}
}
