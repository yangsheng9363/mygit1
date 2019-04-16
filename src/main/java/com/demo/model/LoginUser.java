package com.demo.model;

public class LoginUser {
    private String loginId;

    private Short indexs;

    private String depotId;

    private String password;

    private String realName;

    private String sex;

    private String workPhone;

    private String mobilePhone;

    private String emial;

    private String isAdmin;

    private Short locks;

    private String userType;

    private String ukey;

    private String deviceId;

    private String person;

    private String personId;

    private String address;

    private Short canDeal;

    private Short psLevel;

    private Short usekey;

    private Short usedevice;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    public Short getIndexs() {
        return indexs;
    }

    public void setIndexs(Short indexs) {
        this.indexs = indexs;
    }

    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId == null ? null : depotId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone == null ? null : workPhone.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial == null ? null : emial.trim();
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin == null ? null : isAdmin.trim();
    }

    public Short getLocks() {
        return locks;
    }

    public void setLocks(Short locks) {
        this.locks = locks;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getUkey() {
        return ukey;
    }

    public void setUkey(String ukey) {
        this.ukey = ukey == null ? null : ukey.trim();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId == null ? null : personId.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Short getCanDeal() {
        return canDeal;
    }

    public void setCanDeal(Short canDeal) {
        this.canDeal = canDeal;
    }

    public Short getPsLevel() {
        return psLevel;
    }

    public void setPsLevel(Short psLevel) {
        this.psLevel = psLevel;
    }

    public Short getUsekey() {
        return usekey;
    }

    public void setUsekey(Short usekey) {
        this.usekey = usekey;
    }

    public Short getUsedevice() {
        return usedevice;
    }

    public void setUsedevice(Short usedevice) {
        this.usedevice = usedevice;
    }
}