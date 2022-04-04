/*
 * generated by Xtext 2.25.0
 */
package com.avaloq.tools.ddk.checkcfg.ide;

import org.eclipse.xtext.util.Modules2;

import com.avaloq.tools.ddk.checkcfg.CheckCfgRuntimeModule;
import com.avaloq.tools.ddk.checkcfg.CheckCfgStandaloneSetup;
import com.google.inject.Guice;
import com.google.inject.Injector;


/**
 * Initialization support for running Xtext languages as language servers.
 */
public class CheckCfgIdeSetup extends CheckCfgStandaloneSetup {

  @Override
  public Injector createInjector() {
    return Guice.createInjector(Modules2.mixin(new CheckCfgRuntimeModule(), new CheckCfgIdeModule()));
  }

}