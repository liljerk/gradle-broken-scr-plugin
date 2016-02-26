package broken;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;

@Component(immediate = true)
@Service({BrokenRef.class})
public class BrokenRef {
  @Reference
  private Handler handler;
}
