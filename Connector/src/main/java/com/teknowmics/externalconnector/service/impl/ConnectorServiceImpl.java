/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknowmics.externalconnector.service.impl;

import com.teknowmics.externalconnector.fw.forms.EndPointConnectorDetailsForm;
import com.teknowmics.externalconnector.fw.forms.ResponceData;
import com.teknowmics.externalconnector.fw.service.Impl.AbstractConnectorPluginServiceImpl;

/**
 *
 * @author saikrishnan
 */
public class ConnectorServiceImpl extends AbstractConnectorPluginServiceImpl{

    @Override
    protected ResponceData executeTask(EndPointConnectorDetailsForm endPointConnectorDetailsForm) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //Add Custom Implementation
    }

    @Override
    protected Boolean isAsync() {
        throw new UnsupportedOperationException("Not supported yet.");
        //Checking the process is synchorinsed or not
    }

    @Override
    public String getEndConnectorKey() {
        throw new UnsupportedOperationException("Not supported yet."); 
        //Add Connector Key
    }
    
}
