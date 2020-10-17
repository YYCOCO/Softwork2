package test;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.Test;

import main.Find;
import main.Find_Interface;
import main.Main;
import main.Read_Interface;
import main.Student;

public class LGYTest {

	@Test
	public void test() {
		Main main = new Main();
		String path="sutdent.txt";
		Student[] stu = new Student[4];
		stu[0] = new Student("001", "zhl", 100, 100, 60);
		stu[1] = new Student("002", "ys", 88, 99, 77);
		stu[2] = new Student("003", "lgy", 86, 68, 100);
		stu[3] = new Student("004", "cyc", 96, 69, 60);
		
		Read_Interface read = EasyMock.createMock(Read_Interface.class);
		EasyMock.expect(read.read(path)).andReturn(stu);
		EasyMock.replay(read);
		main.setRead(read);		
		stu = main.read(path);
		
		 Find_Interface find = EasyMock.createMock(Find_Interface.class);
//			EasyMock.expect(find.findnumber("002", stu)).andReturn(new float[]{88, 99, 77});
//			EasyMock.expect(find.findname("zhl", stu)).andReturn(new float[]{100, 100, 60});
//			EasyMock.replay(find);
		    Find_Interface find_real = new Find();
			main.setFind(find_real);
			//assertArrayEquals(main.findnumber("002"),new float[]{88, 99, 77});
			//assertArrayEquals(main.findname("zhl"),new float[]{100, 100, 60});
	}

}
