package alphaPackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
	private static Logger log = LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		
		log.debug("Abc");
		log.info("Bca");
		log.error("Cba");
		log.fatal("Dac");

	}

}
