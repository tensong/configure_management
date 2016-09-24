package org.configure_util;

import java.net.URL;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.DefaultConfigurationBuilder;

public class ConfigUtil {
	private final static String CONFIG_XML = "config.xml";
	private static Configuration config = null;

	public static Configuration getConfiguration() {
		if (config == null) {
			initialize();
		}
		return config;
	}

	public static void initialize() {
		initializeCommonConfiguration();
	}

	private static void initializeCommonConfiguration()  {

		try { 
			URL configURL =Thread.currentThread().getContextClassLoader().getResource(CONFIG_XML);
			//下面的这个，打包成jar后没法使用，改成上面的那个ContextLoader的问题 
			//URL configURL = ConfigUtil.class.getClassLoader().getResource(CONFIG_XML);
 			DefaultConfigurationBuilder factory = new DefaultConfigurationBuilder(configURL.getPath());

			config = factory.getConfiguration();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

