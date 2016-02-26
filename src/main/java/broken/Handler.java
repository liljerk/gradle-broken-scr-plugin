package broken;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true)
@Service({Handler.class})
public class Handler {
    // removing the static keyword gets rid of the class not found exception
    private static final Logger logger = LoggerFactory.getLogger(Handler.class);
}
