package main;

public class Find implements Find_Interface{

	@Override
	public float[] findnumber(String num, Student[] stu) {
		// TODO Auto-generated method stub
		float grade[]=new float[3]; 
		for(int i=0;i<stu.length;i++){
			if(stu[i].getNumber() == num){
				grade[0] = stu[i].getMath_score();
				grade[1] = stu[i].getChinese_score();
				grade[2] = stu[i].getEnglish_score();
			}
		}
		return grade;
	}

	@Override
	public float[] findname(String name, Student[] stu) {
		// TODO Auto-generated method stub
		float grade[]=new float[3]; 
		for(int i=0;i<stu.length;i++){
			if(stu[i].getName() == name){
				grade[0] = stu[i].getMath_score();
				grade[1] = stu[i].getChinese_score();
				grade[2] = stu[i].getEnglish_score();
			}
		}
		return grade;
	}




}
