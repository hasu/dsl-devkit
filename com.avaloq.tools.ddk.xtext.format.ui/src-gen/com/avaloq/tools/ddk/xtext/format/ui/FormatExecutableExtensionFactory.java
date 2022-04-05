/*
 * generated by Xtext 2.26.0
 */
package com.avaloq.tools.ddk.xtext.format.ui;

import com.avaloq.tools.ddk.xtext.format.ui.internal.FormatActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class FormatExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(FormatActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		FormatActivator activator = FormatActivator.getInstance();
		return activator != null ? activator.getInjector(FormatActivator.COM_AVALOQ_TOOLS_DDK_XTEXT_FORMAT_FORMAT) : null;
	}

}
