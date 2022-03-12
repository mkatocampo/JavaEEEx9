/**
 * 
 */
package edu.nbcc.util;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Arun.John
 *
 */
public class ValidationUtil {
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isNumeric(String value) {
		try {
			Double.parseDouble(value);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static int getInteger(String value) {
		try {
			return Integer.parseInt(value);
		} catch (Exception e) {
			return 0;
		}
	}
	/**
	 * 
	 * @param request
	 * @param key
	 * @return
	 */
	public static int getInteger(HttpServletRequest request, String key) {
		try {
			return Integer.parseInt(request.getParameter(key));
		} catch (Exception e) {
			
			return 0;
		}
	}
	/**
	 * 
	 * @param request
	 * @param key
	 * @param errorList
	 * @return
	 */
	public static int getTerm(HttpServletRequest request, String key, List<String> errorList) {
		try {
			return Integer.parseInt(request.getParameter(key));
		} catch (Exception e) {
			errorList.add("Value for " + key + " is not valid");
			return 0;
		}
	}
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static double getDouble(String value) {
		try {
			return Double.parseDouble(value);
		} catch (Exception e) {

			return 0.0;
		}
	}
	/**
	 * 
	 * @param request
	 * @param key
	 * @param errorList
	 * @return
	 */
	public static double getDouble(HttpServletRequest request, String key, List<String> errorList) {
		try {
			return Double.parseDouble(request.getParameter(key));
		} catch (Exception e) {
			errorList.add("Value for " + key + " is not valid");
			return 0.0;
		}
	}
	/**
	 * 
	 * @param request
	 * @param key
	 * @return
	 */
	public static String getValue(HttpServletRequest request, String key) {
		return request.getParameter(key);
	}
}
