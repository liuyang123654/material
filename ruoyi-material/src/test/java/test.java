import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try {
            String str="标准热处理";
            //格式：String[] args = new String[] { "F:\\Program Files\\Python37\\python", pyPath, data1，data2};
            String[] strings = new String[] {"C:\\Users\\liuyang\\AppData\\Local\\Programs\\Python\\Python38\\python.exe","C:\\Users\\liuyang\\Desktop\\铸造高温合金分析\\拉伸性能\\mymain.py","K213",str,"20","RandomForestRegressor" };
            Process proc = Runtime.getRuntime().exec(strings); // 执行py文件
            //或者proc = Runtime.getRuntime().exec("C:\\Users\\liuyang\\AppData\\Local\\Programs\\Python\\Python38\\python.exe    C:\\Users\\liuyang\\PycharmProjects\\铸造高温合金分析\\testpy.py 111"); // 执行py文件
            // 用输入输出流来截取结果C:\Users\liuyang\AppData\Local\Programs\Python\Python38\python.exe
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream(),"gb2312"));

            /*
            测试文件执行是否有误：
            res如果是1，java调用python出错；是0，说明没有报错
            Process pr=Runtime.getRuntime().exec(strings);
            int res=pr.waitFor();
            System.out.println(res);

            如果报错为1：
            把报错信息输出，来查看错误：
            BufferedReader error = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
            String err = null;
            while ((err = error.readLine()) != null) {
                System.out.println("=====error：" + err);
            }*/
            String line = null;
            while ((line = in.readLine()) != null) {
                //System.out.println(line);
                String cut = " ";	// 分割串，此处为一个空格
                String[] newStr = line.split(cut);	// 分割成数组
                for (String string : newStr) {
                    System.out.println(string);	// 输出
                }
            }
            in.close();
            proc.waitFor();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
