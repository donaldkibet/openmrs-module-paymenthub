/**
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. If a copy of
 * the MPL was not distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * OpenMRS is also distributed under the terms of the Healthcare Disclaimer located at
 * http://openmrs.org/license.
 *
 * <p>Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS graphic logo is a
 * trademark of OpenMRS Inc.
 */
package org.openmrs.module.openmrs.module.payment.hub;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.User;

/** Please note that a corresponding table schema must be created in liquibase.xml. */
public class Item extends BaseOpenmrsData {

  private Integer id;
  private User owner;
  private String description;

  @Override
  public Integer getId() {
    return id;
  }

  @Override
  public void setId(Integer id) {
    this.id = id;
  }

  @Override
  public String getUuid() {
    return super.getUuid();
  }

  @Override
  public void setUuid(String uuid) {
    super.setUuid(uuid);
  }

  public User getOwner() {
    return owner;
  }

  public void setOwner(User owner) {
    this.owner = owner;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
