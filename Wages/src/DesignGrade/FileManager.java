package DesignGrade;

import java.io.*;
import java.util.ArrayList;

public class FileManager {
	//파일 저장하기
	public static void saveFile(ArrayList<Student> list) {
		try {
			ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream("studentsList.dat"));	
			save.writeObject(list);
			save.close();
			System.out.println("저장됨: " + new File("students.dat").getAbsolutePath());
		}catch(IOException e) {
			System.out.println("파일 저장 실패");
			e.printStackTrace();
		}
	}
	//파일 불러오기
	public static ArrayList<Student> loadFile() {
	    File file = new File("studentsList.dat");
	    //파일 없을때
	    if (!file.exists()) {
	        System.out.println("저장된 파일이 없습니다.");
	        return new ArrayList<>();
	    }
	    try {
	        ObjectInputStream load = new ObjectInputStream(new FileInputStream(file));
	        ArrayList<Student> list = (ArrayList<Student>) load.readObject();
	        load.close();
	        System.out.println("파일을 불러왔습니다.");
	        return list;
	    } catch (IOException | ClassNotFoundException e) {
	        e.printStackTrace();
	        return new ArrayList<>();
	    }
	}

}
