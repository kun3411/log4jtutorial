package beta;
import org.apache.logging.log4j.*;


public class logtwo {
	 private static Logger log=LogManager.getLogger(logtwo.class.getName());

	public static void main(String[] args) {
		
	log.debug("i m debugging");
	 
		log.info("object is present ");
	log.error("object is not present ");
	log.fatal("this is fatal");
	

		
	
	}

}
