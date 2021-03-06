package com.jwebmp.plugins.angularautoexpand;

import com.jwebmp.core.FileTemplates;
import com.jwebmp.core.base.angular.directives.AngularDirectiveBase;

/**
 * The Angular Auto Expand Directive that is applied
 *
 * @author GedMarc
 * @since 30 May 2017
 */
public class AngularAutoExpandDirective
		extends AngularDirectiveBase<AngularAutoExpandDirective>
{
	/*
	 * Constructs a new AngularAutoExpandDirective
	 */
	public AngularAutoExpandDirective()
	{
		super("AngularAutoExpand");
	}

	@Override
	public String renderFunction()
	{
		return FileTemplates.getFileTemplate(AngularAutoExpandDirective.class, "autoExpand", "autoExpand.min.js")
		                    .toString();
	}

	/**
	 * If this page configurator is enabled
	 *
	 * @return if the configuration must run
	 */
	@Override
	public boolean enabled()
	{
		return AngularAutoExpandPageConfigurator.isEnabled();
	}
}
