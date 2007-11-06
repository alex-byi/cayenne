/*****************************************************************
 *   Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 ****************************************************************/
package org.apache.cayenne.modeler.action;

import org.apache.cayenne.modeler.Application;
import org.apache.cayenne.modeler.event.EntityListenerEvent;
import org.apache.cayenne.modeler.util.CayenneAction;
import org.apache.cayenne.map.ObjEntity;
import org.apache.cayenne.map.event.MapEvent;

import java.awt.event.ActionEvent;


/**
 * Action class for removing entity listeners from an ObjEntity
 *
 * @author Vasil Tarasevich
 * @version 1.0 Oct 30, 2007
 */
public class RemoveEntityListenerAction extends CayenneAction {
    /**
     * unique action name
     */
    private static final String ACTION_NAME = "Remove entity listener";

    /**
     * Constructor.
     *
     * @param application Application instance
     */
    public RemoveEntityListenerAction(Application application) {
        super(getActionName(), application);
    }

    /**
     * @return unique action name
     */
    public static String getActionName() {
        return ACTION_NAME;
    }

    /**
     * @return icon file name for button
     */
    public String getIconName() {
        return "icon-remove-listener.gif";
    }

    /**
     * base entity listener removing logic
     * @param e event
     */
    public void performAction(ActionEvent e) {
        ObjEntity objEnt = getProjectController().getCurrentObjEntity();
        String listenerClass = getProjectController().getCurrentListenerClass();

        objEnt.removeEntityListener(listenerClass);

        getProjectController().fireEntityListenerEvent(
                new EntityListenerEvent(
                        RemoveEntityListenerAction.this,
                        listenerClass,
                        listenerClass,
                        MapEvent.REMOVE
                )
        );
    }
}

