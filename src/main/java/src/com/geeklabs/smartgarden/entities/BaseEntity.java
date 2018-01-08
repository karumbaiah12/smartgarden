/*
 * Copyright 2016 (c) Hubble Connected (HKT) Ltd. - All Rights Reserved
 *
 * Proprietary and confidential.
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 */

package src.com.geeklabs.smartgarden.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hubbleconnected.server.config.mapper.annotations.SkipPatching;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

/**
 * Created by maheshsapre on 29/01/16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@EntityListeners(AuditingEntityListener.class)
@DynamicUpdate
@DynamicInsert
public abstract class BaseEntity extends PatchableEntity {

  @Id
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "uuid2")
  @Column(columnDefinition = "BINARY(16)")
  private UUID id;

  @JsonProperty("created_at")
  @CreatedDate
  private Date createdAt;

  @JsonProperty("updated_at")
  @LastModifiedDate
  private Date updatedAt;

  /**
   * Instantiates a new Base entity.
   */
  public BaseEntity() {
    this.createdAt = new DateTime(DateTimeZone.UTC).toDate();
    this.updatedAt = new DateTime(DateTimeZone.UTC).toDate();

  }

  public BaseEntity(UUID id) {
    this.id = id;
    this.createdAt = new DateTime(DateTimeZone.UTC).toDate();
    this.updatedAt = new DateTime(DateTimeZone.UTC).toDate();
  }

  /**
   * Gets id.
   *
   * @return the id
   */
  @SkipPatching
  public UUID getId() {
    return id;
  }

  /**
   * Sets id.
   *
   * @param id the id
   */
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   * Gets created at.
   *
   * @return the created at
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets created at.
   *
   * @param createdAt the created at
   */
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Gets updated at.
   *
   * @return the updated at
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Sets updated at.
   *
   * @param updatedAt the updated at
   */
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

}
