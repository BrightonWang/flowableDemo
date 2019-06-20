package com.brighton.flowableHalloWord;

import org.flowable.engine.ProcessEngine;
import org.flowable.engine.ProcessEngineConfiguration;
import org.flowable.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.flowable.idm.engine.impl.cfg.StandaloneIdmEngineConfiguration;

/**
 * <p>
 * </p>
 *
 * @author Brigh
 * @version $Id: <className>, v <versionName> 17:31 2019-06-20 Brigh Exp $
 */
public class HolidayRequest {
    public static void main(String[] args) {
        ProcessEngineConfiguration processEngineConfiguration = new StandaloneProcessEngineConfiguration()
                .setJdbcUrl("jdbc:mysql://localhost:3306/flowabledemo")
                .setJdbcUsername("root")
                .setJdbcPassword("112233")
                .setJdbcDriver("com.mysql.jdbc.Driver")
                .setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
        ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();
    }
}
