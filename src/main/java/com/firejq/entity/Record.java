package com.firejq.entity;

/**
 * Created by firejq on 2017/7/25.
 */
public class Record {
	private Long id;

	private String time;

	private Integer autoChangeVar1;
	private Integer autoChangeVar2;
	private Integer autoChangeVar3;
	private Integer autoChangeVar4;
	private Integer autoChangeVar5;
	private Integer autoChangeVar6;
	private Integer autoChangeVar7;
	private Integer paramVar1;
	private Integer paramVar2;
	private Integer paramVar3;
	private Integer paramVar4;
	private Integer paramVar5;

	@Override
	public String toString() {
		return "Record{" + "id=" + id + ", time='" + time + '\'' + ", autoChangeVar1=" + autoChangeVar1 + ", autoChangeVar2=" + autoChangeVar2 + ", autoChangeVar3=" + autoChangeVar3 + ", autoChangeVar4=" + autoChangeVar4 + ", autoChangeVar5=" + autoChangeVar5 + ", autoChangeVar6=" + autoChangeVar6 + ", autoChangeVar7=" + autoChangeVar7 + ", paramVar1=" + paramVar1 + ", paramVar2=" + paramVar2 + ", paramVar3=" + paramVar3 + ", paramVar4=" + paramVar4 + ", paramVar5=" + paramVar5 + ", paramVar6=" + paramVar6 + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Record record = (Record) o;

		if (!autoChangeVar1.equals(record.autoChangeVar1))
			return false;
		if (!autoChangeVar2.equals(record.autoChangeVar2))
			return false;
		if (!autoChangeVar3.equals(record.autoChangeVar3))
			return false;
		if (!autoChangeVar4.equals(record.autoChangeVar4))
			return false;
		if (!autoChangeVar5.equals(record.autoChangeVar5))
			return false;
		if (!autoChangeVar6.equals(record.autoChangeVar6))
			return false;
		if (!autoChangeVar7.equals(record.autoChangeVar7))
			return false;
		if (!paramVar1.equals(record.paramVar1))
			return false;
		if (!paramVar2.equals(record.paramVar2))
			return false;
		if (!paramVar3.equals(record.paramVar3))
			return false;
		if (!paramVar4.equals(record.paramVar4))
			return false;
		if (!paramVar5.equals(record.paramVar5))
			return false;
		return paramVar6.equals(record.paramVar6);
	}

	@Override
	public int hashCode() {
		int result = autoChangeVar1.hashCode();
		result = 31 * result + autoChangeVar2.hashCode();
		result = 31 * result + autoChangeVar3.hashCode();
		result = 31 * result + autoChangeVar4.hashCode();
		result = 31 * result + autoChangeVar5.hashCode();
		result = 31 * result + autoChangeVar6.hashCode();
		result = 31 * result + autoChangeVar7.hashCode();
		result = 31 * result + paramVar1.hashCode();
		result = 31 * result + paramVar2.hashCode();
		result = 31 * result + paramVar3.hashCode();
		result = 31 * result + paramVar4.hashCode();
		result = 31 * result + paramVar5.hashCode();
		result = 31 * result + paramVar6.hashCode();
		return result;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Integer getAutoChangeVar1() {
		return autoChangeVar1;
	}

	public void setAutoChangeVar1(Integer autoChangeVar1) {
		this.autoChangeVar1 = autoChangeVar1;
	}

	public Integer getAutoChangeVar2() {
		return autoChangeVar2;
	}

	public void setAutoChangeVar2(Integer autoChangeVar2) {
		this.autoChangeVar2 = autoChangeVar2;
	}

	public Integer getAutoChangeVar3() {
		return autoChangeVar3;
	}

	public void setAutoChangeVar3(Integer autoChangeVar3) {
		this.autoChangeVar3 = autoChangeVar3;
	}

	public Integer getAutoChangeVar4() {
		return autoChangeVar4;
	}

	public void setAutoChangeVar4(Integer autoChangeVar4) {
		this.autoChangeVar4 = autoChangeVar4;
	}

	public Integer getAutoChangeVar5() {
		return autoChangeVar5;
	}

	public void setAutoChangeVar5(Integer autoChangeVar5) {
		this.autoChangeVar5 = autoChangeVar5;
	}

	public Integer getAutoChangeVar6() {
		return autoChangeVar6;
	}

	public void setAutoChangeVar6(Integer autoChangeVar6) {
		this.autoChangeVar6 = autoChangeVar6;
	}

	public Integer getAutoChangeVar7() {
		return autoChangeVar7;
	}

	public void setAutoChangeVar7(Integer autoChangeVar7) {
		this.autoChangeVar7 = autoChangeVar7;
	}

	public Integer getParamVar1() {
		return paramVar1;
	}

	public void setParamVar1(Integer paramVar1) {
		this.paramVar1 = paramVar1;
	}

	public Integer getParamVar2() {
		return paramVar2;
	}

	public void setParamVar2(Integer paramVar2) {
		this.paramVar2 = paramVar2;
	}

	public Integer getParamVar3() {
		return paramVar3;
	}

	public void setParamVar3(Integer paramVar3) {
		this.paramVar3 = paramVar3;
	}

	public Integer getParamVar4() {
		return paramVar4;
	}

	public void setParamVar4(Integer paramVar4) {
		this.paramVar4 = paramVar4;
	}

	public Integer getParamVar5() {
		return paramVar5;
	}

	public void setParamVar5(Integer paramVar5) {
		this.paramVar5 = paramVar5;
	}

	public Integer getParamVar6() {
		return paramVar6;
	}

	public void setParamVar6(Integer paramVar6) {
		this.paramVar6 = paramVar6;
	}

	public Record(Long id, String time, Integer autoChangeVar1, Integer autoChangeVar2, Integer autoChangeVar3, Integer autoChangeVar4, Integer autoChangeVar5, Integer autoChangeVar6, Integer autoChangeVar7, Integer paramVar1, Integer paramVar2, Integer paramVar3, Integer paramVar4, Integer paramVar5, Integer paramVar6) {

		this.id = id;
		this.time = time;
		this.autoChangeVar1 = autoChangeVar1;
		this.autoChangeVar2 = autoChangeVar2;
		this.autoChangeVar3 = autoChangeVar3;
		this.autoChangeVar4 = autoChangeVar4;
		this.autoChangeVar5 = autoChangeVar5;
		this.autoChangeVar6 = autoChangeVar6;
		this.autoChangeVar7 = autoChangeVar7;
		this.paramVar1 = paramVar1;
		this.paramVar2 = paramVar2;
		this.paramVar3 = paramVar3;
		this.paramVar4 = paramVar4;
		this.paramVar5 = paramVar5;
		this.paramVar6 = paramVar6;
	}

	private Integer paramVar6;

	public Record() {
	}


}
