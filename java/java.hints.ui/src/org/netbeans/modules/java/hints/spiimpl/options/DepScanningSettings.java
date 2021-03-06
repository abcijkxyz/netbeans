/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.java.hints.spiimpl.options;

import java.util.prefs.Preferences;
import org.netbeans.api.java.source.JavaSource;
import org.openide.util.NbPreferences;

/**
 *
 * @author Dusan Balek
 */
class DepScanningSettings {

    private static final String KEY_DEPENDENCY_TRACKING = "dependency-tracking"; //NOI18N
    private static final String DEFAULT_DEPENDENCY_TRACKING = DependencyTracking.ENABLED.name();

    public static DependencyTracking getDependencyTracking() {
        String s = getPreferencesNode().get(KEY_DEPENDENCY_TRACKING, DEFAULT_DEPENDENCY_TRACKING);
        try {
            return DependencyTracking.valueOf(s);
        } catch (IllegalArgumentException e) {
            return DependencyTracking.valueOf(DEFAULT_DEPENDENCY_TRACKING);
        }
    }

    public static void setDependencyTracking(DependencyTracking dt) {
        final DependencyTracking curr = getDependencyTracking();
        if (curr != dt) {
            getPreferencesNode().put(KEY_DEPENDENCY_TRACKING, dt.name());
        }
    }

    private static Preferences getPreferencesNode() {
        return NbPreferences.forModule(JavaSource.class).node("tasklist");
    }

    public static enum DependencyTracking {
        DISABLED,
        ENABLED_WITHIN_ROOT,
        ENABLED_WITHIN_PROJECT,
        ENABLED
    }
}
