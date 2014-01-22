package apache.commons;

import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * @description: TODO
 *
 * @createtime: 2014-1-22 下午1:32:16
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestHttpClient {
	public static void main(String[] args) throws Exception {
		TestHttpClient t=new TestHttpClient();
		t.testResp();
	}
	
	public void testResp() throws Exception {
		HttpClient client = new DefaultHttpClient();
//		HttpClient client = new CloseableHttpClient();抽象类不能初始化
		HttpGet get = new HttpGet("http://www.baidu.com/");
		ResponseHandler<String> responseHandler = new BasicResponseHandler();
		//这种形式可以直接打印出String结果，还有种使用EntityUtils.consume(entity);
		String s = client.execute(get, responseHandler);
		System.out.println(s);
	}
}
