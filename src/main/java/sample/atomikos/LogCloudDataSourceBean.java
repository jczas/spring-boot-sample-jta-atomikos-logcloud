//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package sample.atomikos;

import com.atomikos.jdbc.AtomikosNonXADataSourceBean;
import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.instrument.classloading.LoadTimeWeaver;

public class LogCloudDataSourceBean extends AtomikosNonXADataSourceBean implements LoadTimeWeaverAware {
  private static final long serialVersionUID = 1L;

  public LogCloudDataSourceBean() {
  }

  public void setLoadTimeWeaver(LoadTimeWeaver loadTimeWeaver) {
  }
}
