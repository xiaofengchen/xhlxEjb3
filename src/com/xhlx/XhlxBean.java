package com.xhlx;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(RemoteXhlx.class)
public class XhlxBean implements RemoteXhlx {
	public String showTime(String... args) {
		StringBuilder sb = new StringBuilder();
		for (String str : args) {
			sb.append(str);
			sb.append(":");
		}
		sb.deleteCharAt(sb.length() - 1);

		return sb.toString();
	}
}
