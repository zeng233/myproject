package apache.commons;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * @description: 读文件
 *
 * @createtime: 2013-10-25 上午10:26:07
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class FileUtil {
	
	public static void main(String[] args) throws Exception {
		FileUtil f = new FileUtil();
		f.readFileString("g:/mm.txt");
		
	}
	
	
	public void readFileString(String path) throws Exception {
		List<String> list = FileUtils.readLines(new File(path));
		StringBuffer sb = new StringBuffer();
		for (String id : list) {
			String s = "'" + id + "',";
			sb.append(s);
		}
		System.out.println(sb.toString());
	}
	
	
}
