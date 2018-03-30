package com.yyz.in;

import com.yyz.imp.ChangLower;

public class ChangBll {
	private ChangLower chang;

	public ChangLower getChang() {
		return chang;
	}
	
	public ChangBll(ChangLower chang) {
		super();
		this.chang = chang;
	}

	public ChangBll() {
		super();
	}


	public void setChang(ChangLower chang) {
		this.chang = chang;
	}
	
	public void  to(){
		System.out.println(chang.chang());
	}
	
}
