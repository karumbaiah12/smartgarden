/*
 * Copyright 2016 (c) Hubble Connected (HKT) Ltd. - All Rights Reserved
 *
 * Proprietary and confidential.
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 */

package src.com.geeklabs.smartgarden.constants;

/**
 * Created by praveen on 19/2/16.
 */
public class ErrorCodes {

  /**
   *  The constant RECURLY_API_EXCEPTION.
   */
  public static final int RECURLY_API_EXCEPTION = 90001;
  /**
   * The constant RECURLY_TRANSACTION_EXCEPTION.
   */
  public static final int RECURLY_TRANSACTION_EXCEPTION = 90002;
  /**
   * The constant RECURLY_UNKNOWN_EXCEPTION.
   */
  public static final int RECURLY_UNKNOWN_EXCEPTION = 90003;
  /**
   * The constant USER_NOT_FOUND.
   */
  public static final int USER_NOT_FOUND = 1001;
  /**
   * The constant DEVICE_DOES_NOT_BELONG_TO_USER.
   */
  public static final int DEVICE_DOES_NOT_BELONG_TO_USER= 1002;

  public static final int AUTHORIZATION_USER_DEVICE_TOKEN_BLOCKED = 1003;

  public static final int AUTHORIZATION_USERNAME_BLOCKED = 1004;


  /**
   * The constant DEVICE_NOT_FOUND.
   */
  public static final int DEVICE_NOT_FOUND = 2001;
  /**
   * The constant REGISTRATION_ID_NOT_FOUND.
   */
  public static final int REGISTRATION_ID_NOT_FOUND = 2002;
  /**
   * The constant JOBS_NOT_FOUND.
   */
  public static final int JOBS_NOT_FOUND = 2011;
  /**
   * The constant STREAM_JOBS_NOT_FOUND.
   */
  public static final int STREAM_JOBS_NOT_FOUND= 2012;

  /**
   * The constant SNS_CONFIGURATION_NOT_FOUND.
   */
  public static final int SNS_CONFIGURATION_NOT_FOUND = 2013;

  /**
   * The constant INVALID_DEVICE_SETTING_VALUE.
   */
  public static final int INVALID_DEVICE_SETTING_VALUE = 3006;
  /**
   * The constant INVALID_EMAIL_FORMAT.
   */
  public static final int INVALID_EMAIL_FORMAT = 4002;
  /**
   * The constant INVALID_CLIENT_TYPE.
   */
  public static final int INVALID_CLIENT_TYPE = 4006;
  /**
   * The constant MODE_NOT_SUPPORTED.
   */
  public static final int MODE_NOT_SUPPORTED = 4007;
  /**
   * The constant ERROR_ACTIVE_RECORD.
   */
  public static final int ERROR_ACTIVE_RECORD = 5002;
  /**
   * The constant ERROR_RECURLY_SUBSCRIPTION.
   */
  public static final int ERROR_RECURLY_SUBSCRIPTION = 7002;
  /**
   * The constant ERROR_RECURLY_SUBSCRIPTION_NOT_FOUND.
   */
  public static final int ERROR_RECURLY_SUBSCRIPTION_NOT_FOUND = 7003;
  /**
   * The constant WRONG_PARENT_DEVICE.
   */
  public static final int WRONG_PARENT_DEVICE = 7006;
  /**
   * The constant TIMEOUT_ERROR.
   */
  public static final int TIMEOUT_ERROR = 9001;
  /**
   * The constant UNABLE_TO_CREATE_SESSION.
   */
  public static final int UNABLE_TO_CREATE_SESSION = 9002;
  /**
   * The constant UNABLE_TO_CREATE_FILE_SESSION.
   */
  public static final int UNABLE_TO_CREATE_FILE_SESSION = 9003;
  /**
   * The constant TYPE_NOT_FOUND.
   */
  public static final int TYPE_NOT_FOUND = 9101;
  /**
   * The constant MODEL_NOT_FOUND.
   */
  public static final int MODEL_NOT_FOUND = 9102;
  /**
   * The constant INVALID_FILE.
   */
  public static final int INVALID_FILE= 9110;
  /**
   * The constant DEVICE_INACTIVE.
   */
  public static final int DEVICE_INACTIVE= 9106;
  /**
   * The constant PLAN_NOT_FOUND.
   */
  public static final int PLAN_NOT_FOUND= 9112;
  /**
   * The constant INVALID_TOKEN.
   */
  public static final int INVALID_TOKEN = 9113;
  /**
   * The constant DEVICE_NOT_AVAILABLE.
   */
  public static final int DEVICE_NOT_AVAILABLE = 9117;
  /**
   * The constant RELAY_SESSION_NOT_FOUND.
   */
  public static final int RELAY_SESSION_NOT_FOUND = 9122;
  /**RELAY_SESSION_NOT_FOUND
   * The constant DEVICE_FREE_TRIAL_CLAIMED.
   */
  public static final int DEVICE_FREE_TRIAL_CLAIMED = 9136;
  /**
   * The constant INVALID_COMMAND_PASSED.
   */
  public static final int INVALID_COMMAND_PASSED = 601;
  /**
   * The constant CAMERA_ACCESS_PROBLEM.
   */
  public static final int CAMERA_ACCESS_PROBLEM = 632;
  /**
   * The constant SUCCESS.
   */
  public static final int SUCCESS= 200;
  /**
   * The constant INVALID_COMMAND_RESPONSE.
   */
  public static final int INVALID_COMMAND_RESPONSE = 710;
  /**
   * The constant RECORD_NOT_FOUND.
   */
  public static final int RECORD_NOT_FOUND = 404;
  /**
   * The constant UNKNOWN_STATUS.
   */
  public static final int UNKNOWN_STATUS = 100;
  /**
   * The constant UPLOAD_TOKEN_REQUIRED.
   */
  public static final int UPLOAD_TOKEN_REQUIRED = 122;
  /**
   * The constant DEVICE_FOUND.
   */
  public static final int DEVICE_FOUND = 101;
  /**
   * The constant INVALID_UPLOAD_TOKEN.
   */
  public static final int INVALID_UPLOAD_TOKEN = 123;
  /**
   * The constant UNPROCESSABLE_ENTITY.
   */
  public static final int UNPROCESSABLE_ENTITY=422;

  /**
   * The constant NEW_ERROR_CODES_START.
   */
  public static final int NEW_ERROR_CODES_START = 0x10000000;
  /**
   * The constant TOKEN_EXPIRED_ERROR_CODE.
   */
  public static final int TOKEN_EXPIRED_ERROR_CODE = NEW_ERROR_CODES_START + 1;
  /**
   * The constant TOO_MANY_REQUESTS.
   */
  public static final int TOO_MANY_REQUESTS = 429;

  /**
   * The constant INVALID_STREAM_ID.
   */
  public final static String INVALID_STREAM_ID = "601";
  /**
   * The constant LIVE_STREAMING_IN_PROGRESS.
   */
  public final static String LIVE_STREAMING_IN_PROGRESS = "602";
  /**
   * The constant INVALID_CLIP.
   */
  public final static String INVALID_CLIP = "603";
  /**
   * The constant INVALID_MD5SUM.
   */
  public final static String INVALID_MD5SUM = "604";
  /**
   * The constant SD_NOT_INSERTED.
   */
  public final static String SD_NOT_INSERTED = "605";
  /*
   The constant PING_COUNT_EXHAUSTED
  */
  public final static int PING_COUNT_EXHAUSTED = 10001;
  /**
   * The constant PLAN_ID_MISSING
   */
  public final static int PLAN_ID_MISSING=10002;
  /**
   * The constant USER_ALREADY_UNDER_SUBSCRIPTION
   */
  public final static int USER_ALREADY_UNDER_SUBSCRIPTION = 9146;


  /**
   * The constant NOT_FOUND_ERROR_MSG_PREFIX.
   */
//Error messages
  public final static String NOT_FOUND_ERROR_MSG_PREFIX="Not found! ";

  public final static String METHOD_NOT_SUPPORTED_ERROR_MSG_PREFIX="Not supported ";
  /**
   * The constant DEVICE_NOT_FOUND_MSG.
   */
  public final static String DEVICE_NOT_FOUND_MSG="Device: %s";

  /**
   * The constant PARENT_DEVICE_NOT_FOUND_MSG.
   */
  public final static String PARENT_DEVICE_NOT_FOUND_MSG="Parent Device: %s";
  /**
   * The constant STREAM_JOBS_NOT_FOUND_MSG.
   */
  public final static String STREAM_JOBS_NOT_FOUND_MSG = "Error Code: StreamJobNotFound; Id: %s";

  /**
   * The constant SNS_CONFIGURATION_NOT_FOUND_MSG.
   */
  public final static String SNS_CONFIGURATION_NOT_FOUND_MSG = "Missing configuration, app id %s,certificate type %d";
  /**
   * The constant JOB_NOT_FOUND_MSG.
   */
  public final static String JOB_NOT_FOUND_MSG = "Error Code: JobNotFound; Id: %s";
  /**
   * The constant JOB_NOT_FOUND_FOR_SESSION_ID_MSG.
   */
  public final static String JOB_NOT_FOUND_FOR_SESSION_ID_MSG = "Session id: %s";
  /**
   * The constant UNABLE_TO_APPLY_SETTING_MSG.
   */
  public final static String UNABLE_TO_APPLY_SETTING_MSG = "Unable to apply setting . Invalid response received from device";
  /**
   * The constant SD_NOT_INSERTED_MSG.
   */
  public final static String SD_NOT_INSERTED_MSG = "SD card is not inserted";
  /**
   * The constant CAMERA_NOT_CONNECTED_MSG.
   */
  public final static String CAMERA_NOT_CONNECTED_MSG = "Camera Not Connected";
  /**
   * The constant NOT_FOUND_TYPE_OR_NAME_ERROR_MSG_PREFIX.
   */
  public final static String NOT_FOUND_TYPE_OR_NAME_ERROR_MSG_PREFIX = "Validation failed: Type code has already been taken";
  /**
   * The constant NOT_FOUND_TYPE_ERROR_MSG_PREFIX.
   */
  public final static String NOT_FOUND_TYPE_ERROR_MSG_PREFIX = "Type Not found";
  /**
   * The constant NOT_FOUND_MODEL_ERROR_MSG_PREFIX.
   */
  public final static String NOT_FOUND_MODEL_ERROR_MSG_PREFIX = "Model Not found";
  /**
   * The constant MODEL_ALREADY_EXIST_MSG_PREFIX.
   */
  public final static String MODEL_ALREADY_EXIST_MSG_PREFIX = "Model Already Exist";
  /**
   * The constant FREE_TRIAL_CLAIMED_MSG.
   */
  public final static String FREE_TRIAL_CLAIMED_MSG = "Available free trials have already been claimed for this device";
  /**
   * The constant RELAY_SESSION_NOT_FOUND_MSG.
   */
  public final static String RELAY_SESSION_NOT_FOUND_MSG="Relay session";
  /**
   * The constant DEVICE_TYPE_NOT_FOUND_MSG.
   */
  public final static String DEVICE_TYPE_NOT_FOUND_MSG = "DeviceType: %s";
  /**
   * The constant DEVICE_MODEL_NOT_FOUND_MSG.
   */
  public final static String DEVICE_MODEL_NOT_FOUND_MSG = "DeviceModel: %s";
  /**
   * The constant INVALID_CLIENT_TYPE_MSG.
   */
  public final static String INVALID_CLIENT_TYPE_MSG="Invalid client type";
  /**
   * The constant USER_REACTIVATED.
   */
  public final static String USER_REACTIVATED="User account reactivated";
  /**
   * The constant CAMERA_DISCONNECTED_MSG.
   */
  public final static String CAMERA_DISCONNECTED_MSG = "Camera disconnected";
  /**
   * The constant EXPIRED_SUBSCRIPTION_MSG.
   */
  public final static String EXPIRED_SUBSCRIPTION_MSG = "Your subscription '%s' has been cancelled";
  /**
   * The constant FAILED_SUBSCRIPTION_PAYMENT_MSG.
   */
  public final static String FAILED_SUBSCRIPTION_PAYMENT_MSG =  "Your payment for subscription '%s' has failed";
  /**
   * The constant DEVICE_MASTER_REGISTRATION_ID.
   */
  public final static String DEVICE_MASTER_REGISTRATION_ID = "Registration id : %s in device master";
  /**
   * The constant INVALID_STREAM_ID_MSG.
   */
  public final static String INVALID_STREAM_ID_MSG = "Stream id is not 12 characters";
  /**
   * The constant LIVE_STREAMING_IN_PROGRESS_MSG.
   */
  public final static String LIVE_STREAMING_IN_PROGRESS_MSG = "Live streaming is in progress";
  /**
   * The constant INVALID_CLIP_MSG.
   */
  public final static String INVALID_CLIP_MSG = "Clip does not exist";
  /**
   * The constant INVALID_MD5SUM_MSG.
   */
  public final static String INVALID_MD5SUM_MSG = "Invalid MD5sum";
  /**
   * The constant USER_NOT_FOUND_MSG.
   */
  public final static String USER_NOT_FOUND_MSG = "User: %s";
  /**
   * The constant MODE_NOT_FOUND_MSG.
   */
  public final static String MODE_NOT_FOUND_MSG = "'mode' does not have valid value.";
  public final static String DELETE_ACCOUNT_INFORMATION_ALREADY_EXIST_MSG = "Delete user information already Exist";
    public static final int FREE_TRIAL_INACTIVE = 3001;
    public static final int MAC_ADDRESS_INVALID = 3002;
  public static final int GROUP_NOT_FOUND = 2014;
  public static final int PROFILE_NOT_FOUND = 2015;
  public static final int PARENT_NOT_FOUND = 2015;
  public final static String GROUP_NOT_FOUND_MSG = "Group: %s";
  public final static String PARENT_NOT_FOUND_MSG = "Parent not found: %s";
  public final static String UNABLE_TO_DELETE_GROUP_MSG = "You r not authorise to delete this group";
  public final static String UNABLE_TO_UPLOAD_GROUP_IMAGE = "You r not authorise to upload group image in group: %s";
  public final static String PROFILE_NOT_FOUND_MSG = "profile: %s";
  public final static String UNABLE_TO_CREATE_GROUP = "Family group already created";
  public final static String UNABLE_TO_UPADTE_OWNER = "Unable to upadate owner in family group";
  public final static String GROUP_MEMBER__NOT_FOUND_MSG = "User not found in group: %s";
  public final static String REMOVE_GROUP_OWNER_MSG = "You are not authorized to delete this group owner";
  public final static String UNABLE_TO_UPADTE_ROLE = "Unable to add role in family group";
  public final static String SAFE_ZONE_NOT_FOUND_MSG = "User safe zone not found: %s";
    /**
   * The constant DEVICE_IS_IN_INACTIVE.
   */
  public static String DEVICE_IS_IN_INACTIVE = "Device is in inactive state";
  /**
   * The constant INVALID_FILE_ALREADY_EXIST_MSG.
   */
  public static String INVALID_FILE_ALREADY_EXIST_MSG = "File already exist";
  /**
   * The constant WRONG_PARENT_DEVICE_MSG.
   */
  public static String WRONG_PARENT_DEVICE_MSG = "Tag does not belongs to this camera";
  /**
   * The constant UNABLE_TO_CREATE_SESSION_MSG.
   */
  public static String UNABLE_TO_CREATE_SESSION_MSG = "Create session failed. URL:%s. Unexpected response from device. Response:%s. Registration Id:%s. Firmware Version:%s. (App)User-Agent:%s";
  /**
   * The constant UNABLE_TO_CREATE_SESSION_ERROR_MSG.
   */
  public static String UNABLE_TO_CREATE_SESSION_ERROR_MSG = "Unable to create session. There is an error reported by the device.";
  /**
   * The constant DEVICE_NOT_FOUND_MESSAGE.
   */
  public static String DEVICE_NOT_FOUND_MESSAGE="Not found device";
  /**
   * The constant ACCOUNT_SUBSCRPTION_MISMATCH.
   */
  public static String ACCOUNT_SUBSCRPTION_MISMATCH="Mismatch between account and subscription";
  /**
   * The constant ACCOUNT_SUBSCRPTION_MISMATCH.
   */
  public static String TOO_MANY_REQUESTS_MESSAGE = "Please wait request is being processed";
  /**
   * The constant AUTH_TOKEN_EXPIRED_MESSAGE.
   */
  public static String AUTH_TOKEN_EXPIRED_MESSAGE = "Your auth token has expired, please login again.";
  /**
   * The constant AUTH_TOKEN_EXPIRED_MESSAGE.
   */
  public static String P2P_CREDENTIAL_NOT_FOUND_MSG = "P2P credential not found for device %s";
  public static String PING_COUNT_EXHAUSTED_MESSAGE = "Pings have exhausted for this month and they will get reset on %s";
  public static String USER_REFRESH_TOKEN_NOT_FOUND = "Refresh token not found";
  public static String FREE_TRIAL_INACTIVE_MSG = "Free Trial for this device is not active";
  public static String INVALID_FILE_PATH = "invalid file path";
  public static String INVALID_VOICE_PATH = "invalid voice path";
  public static String INVALID_IMAGE_PATH = "invalid image path";


}
