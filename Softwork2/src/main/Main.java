package main;

public class Main implements Main_Interface{
	private AverageMax_Interface averageMax;
	private Find_Interface find;
	private Read_Interface read;
	private Sort_Interface sort;
	private Student[] stu;
	
	
	
	public Find_Interface getFind() {
		return find;
	}
	public Read_Interface getRead() {
		return read;
	}
	public Sort_Interface getSort() {
		return sort;
	}
	
	public AverageMax_Interface getAverageMax() {
		return averageMax;
	}
	public void setAverageMax(AverageMax_Interface averageMax) {
		this.averageMax = averageMax;
	}
	public void setFind(Find_Interface find) {
		this.find = find;
	}
	public void setRead(Read_Interface read) {
		this.read = read;
	}
	public void setSort(Sort_Interface sort) {
		this.sort = sort;
	}
	@Override
	public float[] sort() {
		// TODO Auto-generated method stub
		return sort.sort(stu);
	}
	@Override
	public Student[] read(String path) {
		// TODO Auto-generated method stub
		this.stu = read.read(path);
		return stu;
	}
	@Override
	public float[] findnumber(String num) {
		// TODO Auto-generated method stub
		return find.findnumber(num, stu);
	}
	@Override
	public float[] findname(String name) {
		// TODO Auto-generated method stub
		return find.findname(name, stu);
	}
	@Override
	public float[] average() {
		// TODO Auto-generated method stub
		return averageMax.average(stu);
	}
	@Override
	public float[] max() {
		// TODO Auto-generated method stub
		return averageMax.max(this.stu);
	}

}
