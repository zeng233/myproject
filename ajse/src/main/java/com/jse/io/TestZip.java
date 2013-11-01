package com.jse.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @description: TODO
 * 
 * @createtime: 2013-10-17 下午5:20:32
 * 
 * @author zenghua
 * 
 * @version 1.0
 */

public class TestZip {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream bs = new ByteArrayOutputStream();
		ZipOutputStream zs = new ZipOutputStream(bs) ;
		try{
			ZipEntry e = new ZipEntry("test.xml");
			zs.putNextEntry(e);
			zs.write("123".getBytes());
			zs.flush();
		}finally{
			zs.closeEntry();
			zs.close();
		}

//		new ByteArrayInputStream(bs.toByteArray()),  z+".zip";
		
	}
}
