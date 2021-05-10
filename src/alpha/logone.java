package alpha;
import org.apache.logging.log4j.*;


public class logone {
	 private static Logger log=LogManager.getLogger(logone.class.getName());

	public static void main(String[] args) {
		
	log.debug("i m debugging");
	 
		log.info("object is present ");
	log.error("object is not present ");
	log.fatal("this is fatal");
	

		
	
	}

}
