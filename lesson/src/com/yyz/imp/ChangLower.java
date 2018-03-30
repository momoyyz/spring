package com.yyz.imp;

import com.yyz.inter.ChangeLetter;

public class ChangLower implements ChangeLetter{
	private  String str;
	@Override
	public String chang() {
		
		return str.toLowerCase();
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}

}
