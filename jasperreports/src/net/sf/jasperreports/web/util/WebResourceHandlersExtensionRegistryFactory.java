/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2013 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.web.util;

import net.sf.jasperreports.engine.JRPropertiesMap;
import net.sf.jasperreports.extensions.ExtensionsRegistry;
import net.sf.jasperreports.extensions.ExtensionsRegistryFactory;
import net.sf.jasperreports.extensions.SingletonExtensionRegistry;


/**
 * @author Narcis Marcu (narcism@users.sourceforge.net)
 * @version $Id$
 */
public class WebResourceHandlersExtensionRegistryFactory implements ExtensionsRegistryFactory {

	private static final ExtensionsRegistry REGISTRY;
	
	static {
		
		JiveWebResourceHandler jiveHandler = new JiveWebResourceHandler();
		jiveHandler.addMapping("jive.templates.tmpl", "net/sf/jasperreports/components/headertoolbar/htmlv2/resources/require/jive.templates.tmpl");
		jiveHandler.addMapping("jive.vm.css", "net/sf/jasperreports/components/headertoolbar/resources/jive.vm.css");
		jiveHandler.addMapping("jive.i18n.vm.js", "net/sf/jasperreports/components/headertoolbar/htmlv2/resources/require/jive.i18n.vm.js");

		REGISTRY = new SingletonExtensionRegistry<WebResourceHandler>(WebResourceHandler.class, jiveHandler);
	}
	
	@Override
	public ExtensionsRegistry createRegistry(String registryId,
			JRPropertiesMap properties) {
		return REGISTRY;
	}
	
}