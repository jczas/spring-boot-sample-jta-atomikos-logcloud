//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package sample.atomikos;

import com.atomikos.jdbc.internal.AtomikosSQLException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.weaving.LoadTimeWeaverAware;

@Configuration
public class LogCloudDataSourceConfiguration {
  public LogCloudDataSourceConfiguration() {
  }

  @Bean
  public LoadTimeWeaverAware initializeLogCloudDataSource(DataSourceProperties dataSourceProperties, @Value("${spring.jta.atomikos.logcloud.min-pool-size:1}") int minPoolSize, @Value("${spring.jta.atomikos.logcloud.max-pool-size:1}") int maxPoolSize) throws AtomikosSQLException {
    LogCloudDataSourceBean logCloud = new LogCloudDataSourceBean();
    logCloud.setUniqueResourceName(com.atomikos.icatch.config.Configuration.getConfigProperties().getProperty("com.atomikos.icatch.logcloud_datasource_name"));
    logCloud.setUrl(dataSourceProperties.getUrl());
    logCloud.setUser(dataSourceProperties.determineUsername());
    if (dataSourceProperties.getPassword() != null) {
      logCloud.setPassword(dataSourceProperties.getPassword());
    }

    logCloud.setIgnoreJtaTransactions(true);
    logCloud.setMinPoolSize(minPoolSize);
    logCloud.setMaxPoolSize(maxPoolSize);
    logCloud.setDriverClassName(dataSourceProperties.determineDriverClassName());
    logCloud.init();
    return logCloud;
  }
}
