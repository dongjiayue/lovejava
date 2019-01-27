package zrt.rsa;

import com.pu.tool.RSACode;

/**
 * @author dongchao
 * @version 创建时间：2018年12月22日
 * 类说明:
*/
public class RSATest {
	public static void main(String[] args) throws Exception {
		String [] parm= {"D:/测试RSA加密/mima.txt","D:/测试RSA加密/jiamihou.dat","D:/测试RSA加密/pub.dat"};//3个参数，一个是原密码文件路劲，一个是密码保存路劲，一个是公钥地址
		RSACode.main(parm);
	}
}
