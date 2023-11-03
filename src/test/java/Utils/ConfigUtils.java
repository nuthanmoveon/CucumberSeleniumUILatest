package Utils;

public class ConfigUtils {

	public static String getBrowser() {
		CommonUtils commonUtils = new CommonUtils();
		return commonUtils.getConfigProperties().get("browser").toString();
	}

	public static String getURL() {
		CommonUtils commonUtils = new CommonUtils();
		return commonUtils.getConfigProperties().get("url").toString();
	}

}
