package com.myweb.apache.commons;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/**
 * @description: TODO
 *
 * @createtime: 2013-8-9 上午9:21:12
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestHttpClient {
	private HttpClient client = new DefaultHttpClient();
	
	public static void main(String[] args) throws Exception {
		TestHttpClient testHttpClient = new TestHttpClient();
//		testHttpClient.testUploadFile(null);
		
		testHttpClient.testZipUpload();
	}
	
	/**
	 * simple demo
	 * @param path
	 */
	public void testSimpleDemo(String path) {
		HttpGet httpGet = new HttpGet(path);
		InputStream inputStream = null;
		
		try {
			HttpResponse response = client.execute(httpGet);
			StatusLine statusLine = response.getStatusLine();
			ProtocolVersion protocolVersion = statusLine.getProtocolVersion();
			System.out.println("Protocol : " + protocolVersion.getProtocol() + protocolVersion.getMajor() 
					+ "." + protocolVersion.getMajor() + " " + statusLine.getReasonPhrase());
			System.out.println("StatusCode : " + statusLine.getStatusCode());
			
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				inputStream = entity.getContent();
				BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
				while(br.readLine() != null) {
					System.out.println(br.readLine());
				}
			}
		} catch (Exception e) {
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		client.getConnectionManager().shutdown();
	}
	
	
	
	/**
	 * 上传文件,参考httpclient自带的samples，F:\mylibs\apache\commons\httpcomponents-client-4.2.2\examples\org\apache\http\examples\entity\mime
	 * @param path
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public void testUploadFile(String path) throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost("http://localhost:8080/amyweb/uploadServlet");
		//设置请求参数
//		post.setParams(params);
		FileBody fileBody = new FileBody(new File("C:\\P30611-141923.jpg"));
		StringBody stringBody = new StringBody("测试文件上传");
		StringBody username = new StringBody("用户名");
		StringBody password = new StringBody("密码");
		
		 MultipartEntity reqEntity = new MultipartEntity();
		 reqEntity.addPart("bin",fileBody);
		 //相当于页面的input等元素
		 reqEntity.addPart("comment",stringBody);
		 reqEntity.addPart("usename",username);
		 reqEntity.addPart("password",password);
		 post.setEntity(reqEntity);
		 
		 HttpResponse response = client.execute(post);
		 System.out.println("响应状态码 ：" + response.getStatusLine().getStatusCode());
		 HttpEntity entity = response.getEntity();
		 InputStream inputStream = null;
		if (entity != null) {
			inputStream = entity.getContent();
			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
			while(br.readLine() != null) {
				System.out.println(br.readLine());
			}
		}
		inputStream.close();
		client.getConnectionManager().shutdown();
	}
	
	
	
	/**
	 * 压缩文件上传
	 * @throws Exception
	 */
	public void testZipUpload() throws Exception {
		HttpPost post = new HttpPost("http://localhost:8080/amyweb/uploadServlet");
		
		ByteArrayOutputStream  out = new ByteArrayOutputStream();
		ZipOutputStream zipos = new ZipOutputStream(out);
		ZipEntry entry1 = new ZipEntry("filename1.xt");//
		entry1.setSize(1024);
		zipos.putNextEntry(entry1);
		zipos.write("111111".getBytes());
		zipos.closeEntry();
		
		ZipEntry entry2 = new ZipEntry("filename2.xt");
		entry1.setSize(1024);
		zipos.putNextEntry(entry2);
		zipos.write("2222222".getBytes());
		zipos.closeEntry();
		
		zipos.close();
		
		ByteArrayBody bytes = new ByteArrayBody(out.toByteArray(), "1017test.zip");
		
		MultipartEntity reqEntity = new MultipartEntity();
		reqEntity.addPart("bin", bytes);
		HttpResponse resp = client.execute(post);
		System.out.println("响应码：" + resp.getStatusLine());
		HttpEntity result = resp.getEntity();
		String s = EntityUtils.getContentCharSet(result);
		System.out.println("响应结果：" + s);
	}
}
