/**
 * Copyright (c) 2015 by Delphix. All rights reserved.
 */

package com.delphix.delphix;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Handles the loading of localization messages.
 */
public final class Messages {

    /*
     * IDs for messages that can be localized
     */
    private static final String MESSAGE_BUNDLE = "messages";
    public static final String CANCEL_JOB_FAIL = "cancel.job.fail";
    public static final String NO_ENGINES = "no.engines";
    public static final String INVALID_ENGINE_CONTAINER = "invalid.engine.container";
    public static final String UNABLE_TO_LOGIN = "unable.to.login";
    public static final String UNABLE_TO_CONNECT = "unable.to.connect";
    public static final String CANCELED_JOB = "canceled.job";
    public static final String TEST_LOGIN_SUCCESS = "test.login.success";
    public static final String TEST_LOGIN_FAILURE = "test.login.failure";
    public static final String TEST_LOGIN_CONNECT = "test.login.connect";
    public static final String REFRESH_OPERATION = "refresh.operation";
    public static final String SYNC_OPERATION = "sync.operation";
    public static final String PLUGIN_NAME = "plugin.name";

    private static ResourceBundle messages = ResourceBundle.getBundle(MESSAGE_BUNDLE, Locale.getDefault());

    /**
     * Get message that does not have any parameters
     */
    public static String getMessage(String message) {
        return messages.getString(message);
    }

    /**
     * Get message with parameters
     */
    public static String getMessage(String message, String[] params) {
        MessageFormat formatter = new MessageFormat("");
        formatter.setLocale(Locale.getDefault());
        formatter.applyPattern(messages.getString(message));
        return formatter.format(params);
    }
}