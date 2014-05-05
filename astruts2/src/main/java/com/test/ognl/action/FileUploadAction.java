package com.test.ognl.action;

import java.io.File;

/** 
 * <p>Title: FileUploadAction.java</p>
 * <p>Description: 文件上传</p>
 * <p>Copyright：Copyright(c)2011</p>
 * <p>Company: 成都四方信息技术有限公司</p>
 * <p>CreateTime：2011-12-26 上午09:01:16</p>
 * @author zenghua
 * @version 1.0
 */

public class FileUploadAction {
	private File upload;
	private String uploadContentType;
	private String uploadFileName;

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
}
