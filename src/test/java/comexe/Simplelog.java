package comexe;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Simplelog {
	
	private static Logger log=LogManager.getLogger(Simplelog.class.getName());
	
	public static void main(String args[]) {
		log.info("******");
		log.debug("--------");
		log.error("&&&&&&&&&");
		log.debug("--------");
		
		log.debug("--------");
	}
}
