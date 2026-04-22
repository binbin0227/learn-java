package d30_p51;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws IOException {
        //读取学生信息存到ArrayList<Student> list中
        File file = new File("d30IO练习/d30_p51/names.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        ArrayList<Student> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] student_arr = line.split("-");
            list.add(new Student(student_arr[0], student_arr[1], Integer.parseInt(student_arr[2]), Double.parseDouble(student_arr[3])));
        }
        br.close();
        //计算权重
        double totalWeight = 0;
        for (Student value : list) {
            totalWeight += value.getWeight();
        }
        //抽取
        Random r = new Random();
        double seed = r.nextDouble()*totalWeight;
        int i = 0;
        for (i = 0; i < list.size(); i++) {
            seed -= list.get(i).getWeight();
            if (seed<0){
                break;
            }
        }
        System.out.println("抽到了"+list.get(i).getName());
        list.get(i).setWeight(list.get(i).getWeight()/2);
        //把新的权重写入文件
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for (Student student : list) {
            bw.write(student.toString());
            bw.newLine();
        }
        bw.close();
    }
}
