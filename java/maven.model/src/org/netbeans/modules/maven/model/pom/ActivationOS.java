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
package org.netbeans.modules.maven.model.pom;


/**
 *
 * @author mkleint
 */
public interface ActivationOS extends POMComponent {

//   <!--xs:complexType name="ActivationOS">
//    <xs:all>
//      <xs:element name="name" minOccurs="0" type="xs:string">
//      <xs:element name="family" minOccurs="0" type="xs:string">
//      <xs:element name="arch" minOccurs="0" type="xs:string">
//      <xs:element name="version" minOccurs="0" type="xs:string">
//    </xs:all>
//  </xs:complexType-->

    String getName();
    void setName(String name);

    String getFamily();
    void setFamily(String family);

    String getArch();
    void setArch(String arch);

    String getVersion();
    void setVersion(String version);

}
