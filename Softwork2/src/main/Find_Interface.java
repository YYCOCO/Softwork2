package main;
/* 根据学号或姓名查找成绩，
 * 李光远，
 * 继承此接口，实现findnumber和findname方法，
 * */
public interface Find_Interface {
	//输出不同科目成绩，返回结果数组
	public abstract float[] findnumber(String num,Student[] stu);
	public abstract float[] findname(String name,Student[] stu);

}
