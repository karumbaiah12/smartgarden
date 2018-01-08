/*
 * Copyright 2016 (c) Hubble Connected (HKT) Ltd. - All Rights Reserved
 *
 * Proprietary and confidential.
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 */

package src.com.geeklabs.smartgarden.entities;

import src.com.geeklabs.smartgarden.annotations.H2ONonNullString;
import src.com.geeklabs.smartgarden.annotations.SkipPatching;

import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.FilterDefs;
import org.hibernate.annotations.Where;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import src.com.geeklabs.smartgarden.constants.SmartGardenConstants;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

/**
 *
 */
@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Long getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(Long mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  private String email;
  private Long mobileNumber;


}


