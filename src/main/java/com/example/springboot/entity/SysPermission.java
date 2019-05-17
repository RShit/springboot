package com.example.springboot.entity;


public class SysPermission {

  private long id;
  private long parentId;
  private String resName;
  private String resType;
  private String permission;
  private String url;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public String getResName() {
    return resName;
  }

  public void setResName(String resName) {
    this.resName = resName;
  }


  public String getResType() {
    return resType;
  }

  public void setResType(String resType) {
    this.resType = resType;
  }


  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

}
