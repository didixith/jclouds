/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jclouds.openstack.keystone.v2_0.extensions;

/**
 * Extension namespaces
 *
 * @author Pedro Navarro
 * @see <a href= "http://docs.openstack.org/developer/keystone/extension_development.html" />
 */
public interface ExtensionNamespaces {
   /**
    * OpenStack Keystone Admin Support
    */
   public static final String OS_KSADM = "http://docs.openstack.org/identity/api/ext/OS-KSADM/v1.0";
}