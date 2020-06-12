package kr.co.iquest.order.Common;

import java.util.List;

public class ResultObjects<T> {

	public int resultCode;
	public String resultMessage;
	
	public List<T> resultList;

	public int getResultCode() {
		return resultCode;
	}

	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<T> getResultList() {
		return resultList;
	}

	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	@Override
	public String toString() {
		return "ResultObjects [resultCode=" + resultCode + ", resultMessage=" + resultMessage + ", resultList="
				+ resultList + "]";
	}

}

