/*
 * Copyright 2016 (c) Hubble Connected (HKT) Ltd. - All Rights Reserved
 *
 * Proprietary and confidential.
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 */

package src.com.geeklabs.smartgarden.entities;

import com.hubbleconnected.server.config.mapper.annotations.H2ONonNullString;
import com.hubbleconnected.server.config.mapper.annotations.SkipPatching;
import com.hubbleconnected.server.pojos.constants.FieldLengths;
import com.hubbleconnected.server.pojos.constants.H2OConstants;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.FilterDefs;
import org.hibernate.annotations.Where;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

/**
 * Created by vinay on 1/6/16.
 */
@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(name = "UK_email", columnNames = {"email"}))
}
)
@FilterDefs({
        @FilterDef(name = "NOT_DELETED", defaultCondition = "deletedAt is NULL")
})
public class UserEntity extends BaseEntity {


  private UUID tenantId;

  @NotBlank
  @H2ONonNullString(
          min = 3,
          max = 25,
          nullAllowed = false)
  private String name;
  private Integer oldId;
  @NotBlank
  @Email
  @H2ONonNullString(
          min = FieldLengths.GENERAL_STRING_LENGTH_MIN,
          max = FieldLengths.GENERAL_STRING_LENGH_MAX,
          nullAllowed = false)
  private String email;
  @Length(min = FieldLengths.USER_AUTH_TOKEN, max = FieldLengths.USER_AUTH_TOKEN)
  private String authenticationToken;
  @Length(max = FieldLengths.GENERAL_STRING_LENGH_MAX)
  private String oldPassword;
  @Length(max = FieldLengths.GENERAL_STRING_LENGH_MAX)
  private String password;
  //@Length(max = FieldLengths.GENERAL_STRING_LENGH_MAX)
  //private String scryptPassword;
  @Length(max = FieldLengths.GENERAL_STRING_LENGH_MAX)
  @Column(nullable = true)
  private String resetPasswordToken;
  private Date resetPasswordSentAt;
  private Date birthday;
  private Date deletedAt;
  private int rolesMask;
  private Date uploadTokenExpiresAt;
  private String uploadToken;
  @Column(columnDefinition = "int(11) default 0")
  private H2OConstants.USER_STATUS status;
  @Column(columnDefinition = "boolean default false")
  private boolean emailVerified;

  @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id", referencedColumnName = "id")
  private Set<AppEntity> apps;

  @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<DeviceFreeTrialEntity> deviceFreeTrialEntitySet;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "userEntity", fetch = FetchType.LAZY)
  @Where(clause = "deleted_at is NULL")
  private Set<DeviceEntity> deviceEntitySet;

  @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "userEntity", fetch = FetchType.LAZY)
  private Set<UserSubscriptionEntity> userSubscriptions;

  /**
   * Instantiates a new User entity.
   */
  public UserEntity() {
  }

  /**
   * Instantiates a new User entity.
   *
   * @param oldId    the old id
   * @param userName the user name
   * @param email    the email
   * @param userName the user name
   * @param email    the email
   */
  public UserEntity(final Integer oldId,
                    final String userName,
                    final String email,
                    final String password) {
    this.oldId = oldId;
    this.name = userName;
    this.email = email;
    this.password = password;
  }

  /**
   * Gets old id.
   *
   * @return the old id
   */
  @SkipPatching
  public Integer getOldId() {
    return oldId;
  }

  /**
   * Sets old id.
   *
   * @param oldId the old id
   */
  public void setOldId(final Integer oldId) {
    this.oldId = oldId;
  }


  /**
   * Gets old password.
   *
   * @return the old password
   */
  public String getOldPassword() {
    return oldPassword;
  }

  /**
   * Sets old password.
   *
   * @param oldPassword the old password
   */
  public void setOldPassword(final String oldPassword) {
    this.oldPassword = oldPassword;
  }


  /**
   * Gets apps.
   *
   * @return the apps
   */
  public Set<AppEntity> getApps() {
    return apps;
  }

  /**
   * Sets apps.
   *
   * @param apps the apps
   */
  public void setApps(Set<AppEntity> apps) {
    this.apps = apps;
  }

  /**
   * Gets name
   *
   * @return name name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets name.
   *
   * @param name the name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets email.
   *
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * Sets email.
   *
   * @param email the email
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Gets authentication token.
   *
   * @return the authentication token
   */
  public String getAuthenticationToken() {
    return authenticationToken;
  }

  /**
   * Sets authentication token.
   *
   * @param authenticationToken the authentication token
   */
  public void setAuthenticationToken(String authenticationToken) {
    this.authenticationToken = authenticationToken;
  }

  /**
   * Gets password.
   *
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * Sets password.
   *
   * @param password the password
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Gets reset password token.
   *
   * @return the reset password token
   */
  public String getResetPasswordToken() {
    return resetPasswordToken;
  }

  /**
   * Sets reset password token.
   *
   * @param resetPasswordToken the reset password token
   */
  public void setResetPasswordToken(String resetPasswordToken) {
    this.resetPasswordToken = resetPasswordToken;
  }

  /**
   * Gets device entity set.
   *
   * @return the device entity set
   */
  public Set<DeviceEntity> getDeviceEntitySet() {
    return deviceEntitySet;
  }

  /**
   * Sets device entity set.
   *
   * @param deviceEntitySet the device entity set
   */
  public void setDeviceEntitySet(Set<DeviceEntity> deviceEntitySet) {
    this.deviceEntitySet = deviceEntitySet;
  }

  /**
   * Gets device free trial entity set.
   *
   * @return the device free trial entity set
   */
  public Set<DeviceFreeTrialEntity> getDeviceFreeTrialEntitySet() {
    return deviceFreeTrialEntitySet;
  }

  /**
   * Sets device free trial entity set.
   *
   * @param deviceFreeTrialEntitySet the device free trial entity set
   */
  public void setDeviceFreeTrialEntitySet(Set<DeviceFreeTrialEntity> deviceFreeTrialEntitySet) {
    this.deviceFreeTrialEntitySet = deviceFreeTrialEntitySet;
  }


  /**
   * Gets birthday.
   *
   * @return the birthday
   */
  public Date getBirthday() {
    return birthday;
  }

  /**
   * Sets birthday.
   *
   * @param birthday the birthday
   */
  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  /**
   * Gets deleted at.
   *
   * @return the deleted at
   */
  public Date getDeletedAt() {
    return deletedAt;
  }

  /**
   * Sets deleted at.
   *
   * @param deletedAt the deleted at
   */
  public void setDeletedAt(Date deletedAt) {
    this.deletedAt = deletedAt;
  }

  /**
   * Gets roles mask.
   *
   * @return the roles mask
   */
  public int getRolesMask() {
    return rolesMask;
  }

  /**
   * Sets roles mask.
   *
   * @param rolesMask the roles mask
   */
  public void setRolesMask(int rolesMask) {
    this.rolesMask = rolesMask;
  }

  /**
   * Gets upload token expires at.
   *
   * @return the upload token expires at
   */
  public Date getUploadTokenExpiresAt() {
    return uploadTokenExpiresAt;
  }

  /**
   * Sets upload token expires at.
   *
   * @param uploadTokenExpiresAt the upload token expires at
   */
  public void setUploadTokenExpiresAt(Date uploadTokenExpiresAt) {
    this.uploadTokenExpiresAt = uploadTokenExpiresAt;
  }

  /**
   * Gets upload token .
   *
   * @return the upload token
   */
  public String getUploadToken() {
    return uploadToken;
  }

  /**
   * Sets upload token
   *
   * @param uploadToken the upload token
   */


  public void setUploadToken(String uploadToken) {
    this.uploadToken = uploadToken;
  }

  /**
   * Gets user subscriptions.
   *
   * @return the user subscriptions
   */
  public Set<UserSubscriptionEntity> getUserSubscriptions() {
    return userSubscriptions;
  }

  /**
   * Sets user subscriptions.
   *
   * @param userSubscriptionEntity the user subscription entity
   */
  public void setUserSubscriptions(final Set<UserSubscriptionEntity> userSubscriptionEntity) {
    this.userSubscriptions = userSubscriptionEntity;
  }

  /**
   * Gets reset password sent at.
   *
   * @return the reset password sent at
   */
  public Date getResetPasswordSentAt() {
    return resetPasswordSentAt;
  }

  /**
   * Sets reset password sent at.
   *
   * @param resetPasswordSentAt the reset password sent at
   */
  public void setResetPasswordSentAt(Date resetPasswordSentAt) {
    this.resetPasswordSentAt = resetPasswordSentAt;
  }

  public UUID getTenantId() {
    return tenantId;
  }

  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }

  public H2OConstants.USER_STATUS getStatus() {
    return status;
  }

  public void setStatus(H2OConstants.USER_STATUS status) {
    this.status = status;
  }

  public Boolean getEmailVerified() {
    return emailVerified;
  }

  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }

}


