package com.leanote.android.model;

import com.leanote.android.Leanote;

/**
 * Created by binnchx on 8/26/15.
 */
public class AccountModel {
    private long localUserId;
    private String mUserId;
    private String mUserName;
    private String mEmail;
    private boolean verified;
    private String mAvatar;
    private String mAccessToken;
    private boolean useMarkdown;
    private int lastSyncUsn;
    private String host;

    public AccountModel() {
        localUserId = 0L;
    }

    public void init() {
        mUserId = "";
        mUserName = "";
        mEmail = "";
        verified = false;
        mAvatar = "";
        mAccessToken = "";
        lastSyncUsn = 0;
    }

    public void clearToken() {
        mAccessToken = "";
    }

    public long getLocalUserId() {
        return localUserId;
    }

    public void setLocalUserId(long localUserId) {
        this.localUserId = localUserId;
    }

    public String getmUserId() {
        return mUserId;
    }

    public void setmUserId(String mUserId) {
        this.mUserId = mUserId;
    }

    public String getmUserName() {
        return mUserName;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getmAvatar() {
        return mAvatar;
    }

    public void setmAvatar(String mAvatar) {
        this.mAvatar = mAvatar;
    }

    public String getmAccessToken() {
        return mAccessToken;
    }

    public void setmAccessToken(String mAccessToken) {
        this.mAccessToken = mAccessToken;
    }

    public int getLastSyncUsn() {
        return Leanote.leaDB.getAccountUsn(mUserId);
    }

    public void setLastSyncUsn(int lastSyncUsn) {
        this.lastSyncUsn = lastSyncUsn;
    }

    public boolean isUseMarkdown() {
        return useMarkdown;
    }

    public void setUseMarkdown(boolean useMarkdown) {
        this.useMarkdown = useMarkdown;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
